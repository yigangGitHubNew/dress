package com.coming.look.utils.webchat;

import java.io.Serializable;
import java.util.UUID;

public class RestResponse<T> implements Serializable {
    public static final String OK = "ok";
    public static final String LoginTimeout = "LoginTimeout";
    public static final String ERROR = "error";
    private static final long serialVersionUID = 4843066638830850455L;
    private String id;
    private String code;
    private String message;
    private T data;

    public RestResponse() {
        this.id = UUID.randomUUID().toString();
    }

    public RestResponse(String code, String message) {
        this();
        this.code = code;
        this.message = message;
    }

    public RestResponse(String code, String message, T data) {
        this();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RestResponse(T data) {
        this();
        this.code = OK;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RestResponse [id=" + id + ", code=" + code + ", message=" + message + ", data=" + data + "]";
    }

}
