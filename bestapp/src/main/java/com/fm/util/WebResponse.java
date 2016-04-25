package com.fm.util;

import java.util.Date;

@SuppressWarnings("unused")
public class WebResponse<T> {
	
	private T detail;
	
	private int stu;
	
	private Date responseTime;
	
	private Object extend;
	
	private String msg;
	
	private WebResponse(){}
	
	public WebResponse<T> and(Object extend){
		this.extend = extend;
		return this;
	}
	
	private static <T> WebResponse<T> create(T detail, int stu, String msg, Object extend){
		WebResponse<T> wr = new WebResponse<T>();
		wr.detail = detail;
		wr.stu = stu;
		wr.msg = msg;
		wr.extend = extend;
		wr.responseTime = new Date();
		return wr;
	}
	
	public static <T> WebResponse<T> success(T detail){
		return create(detail, 1, null, null);
	}
	
	public static <T> WebResponse<T> faild(String msg){
		return create(null, 0, msg, null);
	}
}
