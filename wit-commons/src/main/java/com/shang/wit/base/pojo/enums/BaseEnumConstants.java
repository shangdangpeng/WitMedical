package com.shang.wit.base.pojo.enums;

import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;

import java.util.Properties;

/**
 * 系统基础信息类 - 枚举信息常量类
 * <p>
 *     本枚举信息常量类只为系统相应枚举准备的
 * </p>
 */
 class BaseEnumConstants {
	 private static Properties props = new Properties();
	 static {
		 try {
			 props.load(BaseEnumConstants.class.getClassLoader().getResourceAsStream("props/enum/enum.properties"));
		 } catch (Exception e){
			 e.printStackTrace();
		 }
	 }

	/**
	 * 系统状态： 启用
	 */
	static final String ENUM_STATUS_ENABLE = props.getProperty("enum.status.enable");

	/**
	 * 系统状态： 禁用
	 */
	static final String ENUM_STATUS_DISABLE = props.getProperty("enum.status.disable");

	/**
	 * <b>系统响应编码：系统响应成功</b>
	 */
	static final Integer ENUM_RESPONSE_CODE_SUCCESS = Integer.parseInt(props.getProperty("enum.response.code.success"));

	/**
	 * <b>系统响应编码：用户未认证</b>
	 */
	static final Integer ENUM_RESPONSE_CODE_UNAUTH = Integer.parseInt(props.getProperty("enum.response.code.unauth"));

	/**
	 * <b>系统响应编码：系统业务处理错误</b>
	 */
	static final Integer ENUM_RESPONSE_CODE_ERROR = Integer.parseInt(props.getProperty("enum.response.code.error"));

	/**
	 * <b>系统响应编码：系统响应异常</b>
	 */
	static final Integer ENUM_RESPONSE_CODE_EXCEPTION = Integer.parseInt(props.getProperty("enum.response.code.exception"));

}
