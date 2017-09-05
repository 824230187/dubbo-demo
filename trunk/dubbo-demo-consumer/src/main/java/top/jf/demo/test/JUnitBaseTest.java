/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.test;

import org.junit.After;
import org.junit.Before;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/2
 * @time 9:58
 */
public class JUnitBaseTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss:SSS");
	private String startTime;
	private String endTime;
	
	@Before
	public void before(){
		startTime = simpleDateFormat.format (new Date ());
		System.out.println ("\n===================开始("+startTime+")===================\n");
	}
	
	@After
	public void after(){
		endTime = simpleDateFormat.format (new Date ());
		System.out.println ("\n===================结束("+endTime+")===================\n");
	}
	
}
