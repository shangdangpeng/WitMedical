package com.shang.wit.system.datacode.pojo.vo;

import com.shang.wit.base.pojo.vo.BaseVO;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能类别信息视图
 * @author shang
 * @version 1.0.0
 */
@ApiModel("数据代码功能类别信息视图")
public class DataCodeCategoryVO extends BaseVO {
	private static final long serialVersionUID = -1314978048360658677L;
	@ApiModelProperty(name = "主键")
	private String id;           //主键
	@ApiModelProperty(name = "名称")
	private String name;         //名称
	@ApiModelProperty(name = "编码")
	private String code;         //编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 *根据视图对象获得实体对象
	 * @param vo
	 * @return
	 */
	public static DataCodeCategory getEntityFromVO(DataCodeCategoryVO vo){
		DataCodeCategory entity = new DataCodeCategory();
		//将视图切换为实体
		if(vo != null){
			BeanUtils.copyProperties(vo, entity);
			//将继承的属性设置进去
			entity.setStatus(vo.getStatus());
			entity.setCreateUser(vo.getCreateUser());
			entity.setCreateTime(vo.getCreateTime());
			entity.setUpdateUser(vo.getUpdateUser());
			entity.setUpdateTime(vo.getUpdateTime());

		}
		return entity;
	}
}
