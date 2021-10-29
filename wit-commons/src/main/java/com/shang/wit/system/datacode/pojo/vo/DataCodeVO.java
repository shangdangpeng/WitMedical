package com.shang.wit.system.datacode.pojo.vo;

import com.shang.wit.base.pojo.vo.BaseVO;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * 系统功能 - 数据编码功能 - 数据代码信息视图
 * @author shang
 * @version 1.0.0
 */
@ApiModel("数据代码信息视图")
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = -6913708541188377710L;
	@ApiModelProperty(name = "主键")
	private String id;                                //主键
	@ApiModelProperty(name = "所属代码类别")
	private DataCodeCategoryVO dataCodeCategoryVO;   //所属代码类别
	@ApiModelProperty(name = "数据代码名称")
	private String name;                             //数据代码名称
	@ApiModelProperty(name = "数据代码编码")
	private String code;                             //数据代码编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataCodeCategoryVO getDataCodeCategoryVO() {
		return dataCodeCategoryVO;
	}

	public void setDataCodeCategoryVO(DataCodeCategoryVO dataCodeCategoryVO) {
		this.dataCodeCategoryVO = dataCodeCategoryVO;
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
	 *根据实体对象获得视图对象
	 * @param entity
	 * @return
	 */
	public static DataCodeVO getVOFromEntity(DataCode entity){
		DataCodeVO vo = new DataCodeVO();
		//将视图切换为实体
		if(entity != null){
			BeanUtils.copyProperties(entity, vo);
			//判断关联属性是否存在
			if (entity.getDataCodeCategory()!=null){
				//创建 DataCodeCategory 对象
				DataCodeCategoryVO parent = DataCodeCategoryVO.getVOFromEntity(entity.getDataCodeCategory());
				vo.setDataCodeCategoryVO(parent);
			}
			//将继承的属性设置进去
			vo.setStatus(vo.getStatus());
			vo.setCreateUser(entity.getCreateUser());
			vo.setCreateTime(entity.getCreateTime());
			vo.setUpdateUser(entity.getUpdateUser());
			vo.setUpdateTime(entity.getUpdateTime());

		}
		return vo;
	}
}
