package com.xhfk.scatter.api.base;

import com.xhfk.scatter.utils.MessageUtils;

/**
 * @ClassName ServiceResponse
 * @Description 业务逻辑层的通用返回
 * @Date 2019/4/8 14:10
 * @Company 图麟科技
 **/
public class ServiceResponse<T> {

    private String code;        //错误编码
    private String message;     //错误描述
    private T data;             //存放数据
    private Boolean success;    // 是否成功

    public ServiceResponse() {
    }

    public ServiceResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ServiceResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private ServiceResponse(String code, String message, T data, Boolean success) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.success = success;
    }

    private ServiceResponse(String code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public static <T> ServiceResponse<T> toSuccess(String code, String message, T data) {
        return new ServiceResponse<>(code, message, data, Boolean.TRUE);
    }

    public static ServiceResponse toSuccess(String code, String message) {
        return new ServiceResponse(code, message, Boolean.TRUE);
    }

    public static <T> ServiceResponse<T> toFailure(String errorCode, String errorMessage, T data) {
        return new ServiceResponse<>(errorCode, errorMessage, data, Boolean.FALSE);
    }

    public static ServiceResponse toFailure(String errorCode, String errorMessage) {
        return new ServiceResponse(errorCode, errorMessage, Boolean.FALSE);

    }

    public static <T> ServiceResponse<T> toMessageSuccess(String messageCode, String message, T data) {
        Message ms = MessageUtils.getInstance().getMessage(messageCode);
        return new ServiceResponse<>(ms.getCode(), message == null ? ms.getMessage() : message, data, Boolean.TRUE);
    }

    public static ServiceResponse toMessageSuccess(String messageCode, String message) {
        Message ms = MessageUtils.getInstance().getMessage(messageCode);
        return new ServiceResponse(ms.getCode(), message == null ? ms.getMessage() : message, Boolean.TRUE);
    }

    public static <T> ServiceResponse<T> toMessageFailure(String errorMessageCode, String errorMessage, T data) {
        Message ms = MessageUtils.getInstance().getMessage(errorMessageCode);
        return new ServiceResponse<>(ms.getCode(), errorMessage == null ? ms.getMessage() : errorMessage, data, Boolean.FALSE);
    }

    public static ServiceResponse toMessageFailure(String errorMessageCode, String errorMessage) {
        Message ms = MessageUtils.getInstance().getMessage(errorMessageCode);
        return new ServiceResponse(ms.getCode(), errorMessage == null ? ms.getMessage() : errorMessage, Boolean.FALSE);

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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
