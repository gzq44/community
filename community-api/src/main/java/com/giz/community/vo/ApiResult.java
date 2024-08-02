package com.giz.community.vo;

/**
 * 统一返回结果对象
 *
 * @author gzq44
 * @date 2024/07/28 22:06
 **/
public class ApiResult<T> {
    private int status;
    private String message;
    private T data;

    public ApiResult() {}

    public ApiResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(200, "Success", data);
    }

    public static <T> ApiResult<T> error(int status, String message) {
        return new ApiResult<>(status, message, null);
    }
}
