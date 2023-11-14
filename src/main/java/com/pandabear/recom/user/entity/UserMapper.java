package com.pandabear.recom.user.entity;

import com.pandabear.recom.user.data.Member;
import com.pandabear.recom.util.BaseMapper;

public class UserMapper implements BaseMapper<Member, MemberEntity> {

    @Override
    public Member toModel(MemberEntity entity) {
        return Member.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .roles(entity.getRoles())
                .build();
    }

    @Override
    public MemberEntity toEntity(Member model) {
        return MemberEntity.builder()
                .id(model.getId())
                .username(model.getUsername())
                .password(model.getPassword())
                .roles(model.getRoles())
                .build();
    }
}
