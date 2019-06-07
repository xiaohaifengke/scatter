package com.xhfk.scatter.domain;

import com.xhfk.scatter.api.base.Message;
import com.xhfk.scatter.utils.MessageUtils;
import com.xhfk.scatter.utils.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A data structure is used as the return values of all JSON based APIs.
 */
@ApiModel(value = "RestResponse", description = "接口响应对象")
public class RestResponse<T> {
    @ApiModelProperty(example = "yhnt2bedco3mp3le9ty5ujngh4kjd6fe", value = "请求传入的32位UUID字符串")
    private String requestId;
    @ApiModelProperty(example = "100000", value = "接口响应码", required = true)
    private String code;
    @ApiModelProperty(example = "接口请求成功", value = "接口响应描述", required = true)
    private String message;
    @ApiModelProperty(example = "返回对象", value = "返回对象", required = true)
    private T data;

    public RestResponse() {
    }

    public RestResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public Map<String, Object> toMap() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("requestId", this.requestId);
        map.put("code", this.code);
        map.put("message", this.message);
        map.put("data", this.data);
        return map;
    }

    public static RestResponse success() {
        return success(null);
    }

    public static RestResponse success(String message) {
        return success(message, null);
    }

    public static <T> RestResponse<T> success(T data) {
        return success("success", data);
    }

    public static <T> RestResponse<T> success(String message, T data) {
        return new RestResponse<>(ResponseCode.RESPONSE_CODE_SUCCESS, message, data);
    }

    public static RestResponse failure() {
        return failure(ResponseCode.RESPONSE_CODE_UNKNOWN_ERROR, null, null);
    }

    public static RestResponse failure(String code) {
        return failure(code, null, null);
    }

    public static RestResponse failure(String code, String message) {
        return failure(code, message, null);
    }

    public static RestResponse failureValidation(String message) {
        return failure(ResponseCode.RESPONSE_CODE_VALIDATION_ERROR, message, null);
    }

    public static <T> RestResponse<T> failureValidation(String message, T data) {
        return failure(ResponseCode.RESPONSE_CODE_VALIDATION_ERROR, message, data);
    }

    public static <T> RestResponse<T> failure(String code, String message, T data) {
        Assert.isTrue(!ResponseCode.RESPONSE_CODE_SUCCESS.equals(code),
            "Invalid response code for failure.");
        return new RestResponse<>(code, message, data);
    }

    /**
     * 异常码获取从message.json
     */
    public static <T> RestResponse<T> toMessageFailure(String errorMessageCode, String errorMessage, T data) {
        Message ms = MessageUtils.getInstance().getMessage(errorMessageCode);
        return new RestResponse<>(ms.getCode(), errorMessage == null ? ms.getMessage() : errorMessage, data);
    }

    public static RestResponse toMessageFailure(String errorMessageCode, String errorMessage) {
        Message ms = MessageUtils.getInstance().getMessage(errorMessageCode);
        return new RestResponse<>(ms.getCode(), errorMessage == null ? ms.getMessage() : errorMessage, Boolean.FALSE);

    }
}
