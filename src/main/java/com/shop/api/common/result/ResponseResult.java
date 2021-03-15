package com.shop.api.common.result;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ResponseResult implements Result {
    SUCCESS("200", "SUCCESS"),
    FAIL("400", "FAIL"),
    BAD_REQUEST("401", "BAD_REQUEST");

    private String code;
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
