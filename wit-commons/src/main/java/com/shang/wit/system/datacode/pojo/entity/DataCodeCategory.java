package com.shang.wit.system.datacode.pojo.entity;

import com.shang.wit.base.pojo.entity.BaseEntity;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import org.springframework.beans.BeanUtils;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能类别信息实体
 * @author shang
 * @version 1.0.0
 */
public class DataCodeCategory extends BaseEntity {
	private static final long serialVersionUID = 4115457240422145495L;
	private String id;           //主键
	private String name;         //名称
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
	 * @param entity
	 * @return
	 */
	public static DataCodeCategoryVO getVOFromEntity(DataCodeCategory entity){
		DataCodeCategoryVO vo = new DataCodeCategoryVO();
		//将视图切换为实体
		if(entity != null){
			BeanUtils.copyProperties(entity,vo);
			//将继承的属性设置进去
			vo.setStatus(entity.getStatus());
			vo.setCreateUser(entity.getCreateUser());
			vo.setCreateTime(entity.getCreateTime());
			vo.setUpdateUser(entity.getUpdateUser());
			vo.setUpdateTime(entity.getUpdateTime());

		}
		return vo;
	}
}
