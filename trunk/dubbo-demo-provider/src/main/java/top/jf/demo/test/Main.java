/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/1
 * @time 11:32
 */
public class Main {
	
	private static Logger logger = LoggerFactory.getLogger (Main.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext (
				"applicationContext.xml");
		context.start();
		String s = "...";
		logger.info ("已启用服务提供者！现在可以进行调用{}",s);
		System.in.read();
	}
}
