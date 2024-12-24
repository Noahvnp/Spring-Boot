package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error."),
    INVALID_NAME_KEY(1001, "Uncategorized Error."),
    USER_EXISTED(1002, "User existed."),
    INVALID_USERNAME(1003, "Username must be at least 3 characters."),
    INVALID_PASSWORD(1004, "Password must be at least 4 characters."),
    ;

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
