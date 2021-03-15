package com.shop.api.application.web.common.model;

import com.shop.api.common.result.ResponseResult;
import com.shop.api.common.result.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response<T> {
    private String code;
    private String msg;
    private T data;

    public Response(Result result) {
        this.code = result.getCode();
        this.msg = result.getMessage();
        this.data = null;
    }

    public static Response success() {
        return of(ResponseResult.SUCCESS.getCode(), ResponseResult.SUCCESS.getMessage(),null);
    }

    public static <T> Response success(T data) {
        return of(ResponseResult.SUCCESS.getCode(), ResponseResult.SUCCESS.getMessage(), data);
    }

    public static Response fail() {
        return of(ResponseResult.FAIL.getCode(), ResponseResult.FAIL.getMessage(), null);
    }

    public static Response fail(Object data) {
        return of(ResponseResult.FAIL.getCode(), ResponseResult.FAIL.getMessage(), data);
    }

    private static <T> Response of(String code, String msg, T data) {
        return new Response<T>(code, msg, data);
    }
}
