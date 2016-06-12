package com.game.assistance.response;

import java.io.Serializable;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
public class BaseResponse implements Serializable {

    private static final long serialVersionUID = 4512719380761786090L;
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BaseResponse() {
    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
