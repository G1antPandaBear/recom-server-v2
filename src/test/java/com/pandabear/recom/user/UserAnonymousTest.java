package com.pandabear.recom.user;

import com.pandabear.recom.user.data.AnonymousUser;
import com.pandabear.recom.user.data.Member;
import com.pandabear.recom.user.data.User;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class UserAnonymousTest {

    @Test
    void anonymousTest() {
        // given
        final String ipAddress = "127.0.0.1";

        // when
        User user = new AnonymousUser(ipAddress);

        // verify
        assertThat(user.isAnonymous()).isTrue();
        assertThat(user).isInstanceOf(AnonymousUser.class);
    }

    @Test
    void memberTest() {
        // given
        // when
        User user = new Member(UUID.randomUUID(), "password");

        // verify
        assertThat(user.isAnonymous()).isFalse();
        assertThat(user).isInstanceOf(Member.class);
    }

}
