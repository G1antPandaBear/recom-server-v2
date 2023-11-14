package com.pandabear.recom.user.entity;

import com.pandabear.recom.user.constant.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Builder
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity {

    @Id
    private UUID id;

    private String username;

    private String password;

    private Set<Role> roles;
}
