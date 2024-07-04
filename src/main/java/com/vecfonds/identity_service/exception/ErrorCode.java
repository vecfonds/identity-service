package com.vecfonds.identity_service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1001, "User existed"),
    INVALID_USERNAME(1003, "Username must be at least 5 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 5 characters!")
    ;

    private int code;
    private String message;
}
