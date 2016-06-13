package com.game.assistance.response;

import com.fasterxml.jackson.databind.deser.Deserializers;

/**
 * Created by wenqing on 2016/6/12 0012.
 */
public class BaseDataResponse<T> extends BaseResponse {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseDataResponse() {
    }

    public BaseDataResponse(T data) {
        this.data = data;
    }

    public BaseDataResponse(int code, String message) {
        super(code, message);
    }

    public BaseDataResponse(int code, String message, T data) {
        super(code, message);
        this.data = data;
    }

    @Override public String toString() {
        return "BaseDataResponse{" +
                "data=" + data +
                "} " + super.toString();
    }
}
