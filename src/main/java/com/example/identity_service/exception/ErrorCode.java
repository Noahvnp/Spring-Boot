package com.example.identity_service.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error.", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_NAME_KEY(1001, "Uncategorized Error.", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User existed.", HttpStatus.BAD_REQUEST),
    INVALID_USERNAME(1003, "Username must be at least {min} characters.", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004, "Password must be at least {min} characters.", HttpStatus.BAD_REQUEST),
    EMPTY_FIRSTNAME(1005, "Firstname must be not empty.", HttpStatus.BAD_REQUEST),
    EMPTY_LASTNAME(1006, "Lastname must be not empty.", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1007, "User not existed.", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1008, "Unauthenticated.", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1009, "You do not have permission.", HttpStatus.FORBIDDEN),
    INVALID_DOB(1010, "Your age must be at least {min}.", HttpStatus.BAD_REQUEST),
    ;

    int code;
    String message;
    HttpStatusCode httpStatusCode;
}
