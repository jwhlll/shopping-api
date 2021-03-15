package com.shop.api.application.exception.advice;

import com.shop.api.application.web.common.model.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.ConnectException;

@RestControllerAdvice
@Slf4j
public class RestControllerExceptionAdvice {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Response> handleException(Exception e) {
        log.error("[Handle Exception]", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Response.fail(e.getMessage()));
    }

    @ExceptionHandler(ConnectException.class)
    protected  ResponseEntity<Response> handleConnectException(ConnectException e) {
        log.error("[Handle handleConnectException]", e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Response.fail(e.getMessage()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Response> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        log.error("[Handle MethodArgumentNotValidException]", e);
        BindingResult bindingResult = e.getBindingResult();
        String msg = bindingResult.getFieldErrors().get(0).getDefaultMessage();
        Response resVo = new Response(String.valueOf(HttpStatus.BAD_REQUEST.value()), HttpStatus.BAD_REQUEST.name(), msg);

        return ResponseEntity.badRequest().body(resVo);
    }
}
