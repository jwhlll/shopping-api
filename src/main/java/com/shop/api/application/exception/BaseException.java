package com.shop.api.application.exception;

import com.shop.api.common.result.Result;
import org.springframework.core.NestedRuntimeException;

public abstract class BaseException extends NestedRuntimeException {

    private String code;

    public BaseException(Result result) {
        this(result.getMessage());
        this.code = result.getCode();
    }

    public BaseException(String msg) {
        super(msg);
    }
}
