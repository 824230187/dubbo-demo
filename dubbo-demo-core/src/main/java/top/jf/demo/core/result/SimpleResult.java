/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.core.result;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/2
 * @time 10:33
 */

public class SimpleResult extends AbstractResult{
	
	private String status;
	
	private String code;
	
	private String message;
	

	public SimpleResult toSuccess(){
		SimpleResult result = new SimpleResult ();
		result.setCode ("200");
		result.setStatus ("success");
		result.setMessage ("操作成功");
		return result;
	}
	
	public SimpleResult toFail(String message){
		SimpleResult result = new SimpleResult ();
		result.setCode ("999");
		result.setStatus ("fail");
		result.setMessage (message);
		return result;
	}
	
	public String getStatus () {
		return status;
	}
	
	public void setStatus (String status) {
		this.status = status;
	}
	
	public String getCode () {
		return code;
	}
	
	public void setCode (String code) {
		this.code = code;
	}
	
	public String getMessage () {
		return message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
}
