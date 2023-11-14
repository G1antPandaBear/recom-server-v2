package com.pandabear.recom.user.data;

import com.pandabear.recom.user.constant.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

@Getter
@SuperBuilder
@AllArgsConstructor @NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class User implements Serializable {
    private String username;

    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public abstract boolean isAnonymous();
}
