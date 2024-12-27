package com.example.identity_service.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error."),
    INVALID_NAME_KEY(1001, "Uncategorized Error."),
    USER_EXISTED(1002, "User existed."),
    INVALID_USERNAME(1003, "Username must be at least 3 characters."),
    INVALID_PASSWORD(1004, "Password must be at least 4 characters."),
    EMPTY_FIRSTNAME(1005, "Firstname must be not empty."),
    EMPTY_LASTNAME(1006, "Lastname must be not empty."),
    ;

    int code;
    String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
