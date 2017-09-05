/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import top.jf.demo.api.DemoUserApi;
import top.jf.demo.core.result.SimpleResult;
import top.jf.demo.entity.UserEntity;

import java.util.Date;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/1
 * @time 10:48
 */
@Component
public class DemoUserService implements DemoUserApi {
	
	
	
	public String hello (String username) {
		String content = "Hello!This is my first dubbo demo!----"+new Date ()+"-----"+username ;
		return content;
	}
	
	public SimpleResult insertUser () {
		SimpleResult result = new SimpleResult ();
		result.setMessage ("系统错误");
		result.setStatus ("Fail");
		result.setCode ("-1");
		System.out.println ("git test...git test");
		System.out.println ("asdasdadasdadad");
		return result;
	}
	
	public static void main (String[] args) {
		SimpleResult result = new DemoUserService ().insertUser ();
		System.out.println (result);
	}
}
