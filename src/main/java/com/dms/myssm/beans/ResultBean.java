package com.dms.myssm.beans;

import java.io.Serializable;

/**
 * 封装json对象，所有返回结果都使用它
 */
public class ResultBean<T> implements Serializable{

	private static final long serialVersionUID = 1L;

	public static final int NO_LOGIN = -1;

	public static final int SUCCESS = 0;

	public static final int FAIL = 1;

	public static final int NO_PERMISSION = 2;
	public static final String NO_PERMISSION_STR = "当前用户无权操作！";

	private String msg = "success";
	
	private String throwable=""; // 异常信息

	private int code = SUCCESS;

	private T data;

	public ResultBean() {
		super();
	}

	public ResultBean(T data) {
		super();
		this.data = data;
	}

	public ResultBean(Throwable e) {
		super();
		this.msg = e.toString();
		this.code = FAIL;
	}

	public static int getNoLogin() {
		return NO_LOGIN;
	}

	public static int getSuccess() {
		return SUCCESS;
	}

	public static int getFail() {
		return FAIL;
	}

	public static int getNoPermission() {
		return NO_PERMISSION;
	}
	
	public String getMsg() {
		return msg;
	}

	public ResultBean<?> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public int getCode() {
		return code;
	}

	public ResultBean<?> setCode(int code) {
		this.code = code;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResultBean<?> setData(T data) {
		this.data = data;
		return this;
	}

	public String getThrowable() {
		return throwable;
	}

	public void setThrowable(String throwable) {
		this.throwable = throwable;
	}
	
	

}
