/*
 * www.jinvovo.com Inc.
 * Copyright (c) 2017 All Rights Reserved
 */
package top.jf.demo.core.result;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA
 * 〈类详细描述〉 <p>
 * 〈功能详细描述〉
 *
 * @author liujf
 * @date 2017/6/2
 * @time 10:40
 */
public class AbstractResult implements Serializable{
	
	@Override
	public String toString () {
		return ToStringBuilder.reflectionToString (this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
