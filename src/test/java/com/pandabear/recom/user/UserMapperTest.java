package com.pandabear.recom.user;

import com.pandabear.recom.user.constant.Role;
import com.pandabear.recom.user.data.Member;
import com.pandabear.recom.user.entity.MemberEntity;
import com.pandabear.recom.user.entity.UserMapper;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UserMapperTest {

    private final UserMapper userMapper = new UserMapper();

    @ParameterizedTest
    @ValueSource(strings = {
            "Recom",
            "iqpizza6349",
            "whitebear05",
            "snack655"
    })
    void memberConvertTest(String username) {
        // given
        final String password = String.format("1234%s5678", username);
        Member model = Member.builder()
                .id(UUID.randomUUID())
                .username(username)
                .password(password)
                .roles(Set.of(Role.READER))
                .build();

        //when
        MemberEntity entity = userMapper.toEntity(model);

        // verify
        assertThat(entity).isNotNull();
        assertThat(entity.getUsername()).isEqualTo(username);
        assertThat(entity.getPassword()).isEqualTo(password);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "Recom",
            "iqpizza6349",
            "whitebear05",
            "snack655"
    })
    void memberEntityConvertTest(String username) {
        final String password = String.format("1234%s5678", username);
        MemberEntity entity = new MemberEntity(UUID.randomUUID(), username, password, Set.of(Role.EDITOR));

        //when
        Member model = userMapper.toModel(entity);

        // verify
        assertThat(model).isNotNull();
        assertThat(model.getUsername()).isEqualTo(username);
        assertThat(model.getPassword()).isEqualTo(password);
    }
}
