package com.pandabear.recom.user.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@SuperBuilder
@AllArgsConstructor @NoArgsConstructor
public class Member extends User {

    private UUID id;
    private String password;

    @Override
    public boolean isAnonymous() {
        return false;
    }
}
