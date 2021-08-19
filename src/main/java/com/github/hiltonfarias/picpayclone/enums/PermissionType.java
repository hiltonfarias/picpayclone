package com.github.hiltonfarias.picpayclone.enums;

public enum PermissionType {
    USER("ROLE_USER"), ADMINISTRATOR("ROLE_ADMIN");
    private final String code;

    PermissionType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
