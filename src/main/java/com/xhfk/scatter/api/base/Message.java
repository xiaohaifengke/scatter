package com.xhfk.scatter.api.base;

/**
 * @Description message.json中对应的错误信息对象
 * @Date 9:54 2019/4/11
 * @Param
 * @return
 **/
public class Message {
	private String code;
	private String message;

	public Message() {
	}

	public Message(String code, String msg) {
		this.code = code;
		this.message = msg;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}

}
