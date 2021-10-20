package com.shang.wit.base.util;

import java.util.Properties;

/**
 * 系统常量类- 加载信息类
 * @author shang
 * @version 1.0.0
 */
public class BaseConstants {
	private static Properties props = new Properties();
	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 分页信息：默认当前页码
	 */
	public static final Integer PAGE_NUM =Integer.parseInt(props.getProperty("base.page.num"));

	/**
	 * 分页信息：默认每页显示数量
	 */
	public static final Integer PAGE_SIZE =Integer.parseInt(props.getProperty("base.page.size"));

	/**
	 * <b>加密秘钥信息</b>
	 */
	public static final String SECRET_KEY = props.getProperty("base.secret.key");

	/**
	 * <b>默认用户信息有效时间</b>
	 */
	public static final Long EXPIRE_SECOND = Long.parseLong(props.getProperty("base.expire.second"));
}
