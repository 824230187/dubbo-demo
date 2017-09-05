/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.api;

import top.jf.demo.core.result.SimpleResult;
import top.jf.demo.entity.UserEntity;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/1
 * @time 10:20
 */
public interface DemoUserApi {
	
	String hello(String username);
	
	SimpleResult insertUser();
	
}
