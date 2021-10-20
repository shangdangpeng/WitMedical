package com.shang.wit.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * 系统基础信息类 - 基础视图类
 * <p>
 *    基础视图信息包含以下属性
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
@ApiModel("系统基础信息类 - 基础视图类")
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 4873403212998279691L;
	@ApiModelProperty(name = "系统状态：0-禁用，1-启用",example = "1")
	private String status;
	@ApiModelProperty(name = "创建人")
	private String createUser;
	@ApiModelProperty(name = "创建时间")
	private String createTime;
	@ApiModelProperty(name = "修改人")
	private String updateUser;
	@ApiModelProperty(name = "修改时间")
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
