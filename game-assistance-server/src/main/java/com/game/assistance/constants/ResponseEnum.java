package com.game.assistance.constants;

import com.sun.javafx.fxml.expression.Expression;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
public enum ResponseEnum {

    SUCCESS(1, "success"),
    PARAM_ERROR(101001, "param is error: "),
    AUTH_ERROR(101002, "auth error:"),
    SYSTEM_ERROR(109999, "system error: ");

    private int code;
    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

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
}
