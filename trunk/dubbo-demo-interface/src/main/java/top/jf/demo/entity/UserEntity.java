/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/1
 * @time 10:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
	
	private String username;
	
	private String pwd;
	
	private Integer sex;
	
}
