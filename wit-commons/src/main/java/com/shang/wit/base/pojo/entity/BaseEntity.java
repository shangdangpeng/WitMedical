package com.shang.wit.base.pojo.entity;

import java.io.Serializable;
/**
 * 系统基础信息类 - 基础实体类
 * <p>
 *    基础信息包含以下属性
 *    1、系统状态：status
 *    2、创建人：createUser
 *    3、创建时间：createTime
 *    4、修改人：updateUser
 *    5、修改时间：updateTime
 *    所有功能实体信息都必须继承于基础实体信息类
 * </p>
 * @author shang
 * @version 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 2607812140696022129L;
	private String status;
	private String createUser;
	private String createTime;
	private String updateUser;
	private String updateTime;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
