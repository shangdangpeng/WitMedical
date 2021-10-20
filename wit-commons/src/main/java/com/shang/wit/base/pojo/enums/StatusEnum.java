package com.shang.wit.base.pojo.enums;

/**
 * 系统基础信息类 - 系统状态枚举信息
 * @author shang
 * @version 1.0.0
 */
public enum StatusEnum {
	STATUS_ENABLE(BaseEnumConstants.ENUM_STATUS_ENABLE,"启用"),
	STATUS_DISABLE(BaseEnumConstants.ENUM_STATUS_DISABLE,"禁用"),
	;
	private String code;
	private String remark;

	private StatusEnum(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
