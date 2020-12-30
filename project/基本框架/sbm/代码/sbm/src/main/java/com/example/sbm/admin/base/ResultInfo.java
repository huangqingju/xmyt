package com.example.sbm.admin.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 系统提示信息封装类  你可以增加， 别减
 * @author jcp
 *
 */
public class ResultInfo
{
	public static final int TYPE_RESULT_FAIL = 0;//失败
	public static final int TYPE_RESULT_SUCCESS = 1;//成功
	public static final int TYPE_RESULT_WARN = 2;//警告
	public static final int TYPE_RESULT_INFO = 3;//提示信息
	
	public ResultInfo(){}

	/**
	 * 消息提示类型
	 */
	private int type;
		
	
	/**
	 * 提示代码
	 */
	private int messageCode;

	/**
	 * 提示信息
	 */
	private String message;


	private boolean success;

	private List<?> data;


	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}