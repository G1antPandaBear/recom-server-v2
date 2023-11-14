package com.pandabear.recom.user.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@AllArgsConstructor @NoArgsConstructor
public class AnonymousUser extends User {

    private String ipAddress;

    @Override
    public boolean isAnonymous() {
        return true;
    }
}
