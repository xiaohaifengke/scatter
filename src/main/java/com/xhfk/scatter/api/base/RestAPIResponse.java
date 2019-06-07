package com.xhfk.scatter.api.base;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xhfk.scatter.Constant;

import java.io.Serializable;
import java.util.UUID;

public class RestAPIResponse implements Serializable {
    private static final long serialVersionUID = -5021964284964089157L;

    private ObjectNode data;
    private String errorCode;
    private String errorMessage;
    private Boolean success;
    private String requestId;

    // success response
    public RestAPIResponse(ObjectNode json) {
        this.success = true;
        this.data = json;
    }

    // failure response
    public RestAPIResponse(String errorCode, String errorMessage) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.requestId = UUID.randomUUID().toString();
    }

    public ObjectNode getData() {
        return data;
    }

    public void setData(ObjectNode data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        ObjectNode node = this.data;
        ObjectMapper mapper = new ObjectMapper();
        if (!success) {
            node = mapper.createObjectNode();

            node.put("request_id", this.requestId);
            node.put("error_code", this.errorCode);
            node.put("error_message", this.errorMessage);
        } else if (node == null) {
            node = mapper.createObjectNode();
        } else if (node.has(Constant.CORE_SERVICE_SUCCESS_FLAG)) {
            node.remove(Constant.CORE_SERVICE_SUCCESS_FLAG);
        }

        return node.toString();
    }
}
