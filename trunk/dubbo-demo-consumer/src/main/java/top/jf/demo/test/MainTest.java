/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import top.jf.demo.service.DemoUserService;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/1
 * @time 14:26
 */
@ContextConfiguration(locations = {"classpath:/applicationContext-consumer.xml","classpath:/spring-jdbc.xml"})
public class MainTest extends JUnitBaseTest{
	
    @Autowired
	private DemoUserService demoUserService;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext (
				"applicationContext-consumer.xml");
		context.start ();
		DemoUserService bean = (DemoUserService)context.getBean ("demoUserService");
//		demoUserService.hello ("123");
		
		System.out.println ("\n===================开始===================\n");
		System.out.println ("调用服务成功！Consumer------------->"+bean.hello ("CC"));
		System.out.println ("\n===================结束===================\n");
		context.destroy ();
	}
	
	@Test
	public void hello(){
		System.out.println ("Consumer------------->"+demoUserService.hello ("LJF"));
	}
	
	
}
