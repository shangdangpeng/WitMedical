package com.shang.wit.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 系统基础信息类 - 分页查询视图信息
 * <p>
 *    分页视图信息包含以下属性
 *     1、查询视图queryVO
 *     2、分页视图pageVO
 *    所有功能实体信息都必须继承于基础实体信息类
 * </p>
 * @author shang
 * @version 1.0.0
 */
@ApiModel("系统基础信息类 - 分页查询视图信息")
public class QueryPageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -4971721335249466454L;
	@ApiModelProperty(name = "查询视图")
	private E queryVO;
	@ApiModelProperty(name = "分页视图")
	private PageVO<E> pageVO;

	public QueryPageVO(){}
	public QueryPageVO(E queryVO,PageVO<E> pageVO){
		this.queryVO=queryVO;
		this.pageVO=pageVO;
	}
	public QueryPageVO(E queryVO, Integer pageNum, Integer pageSize) {
		this.queryVO = queryVO;
		this.pageVO = new PageVO<E>(pageNum, pageSize);
	}

	public E getQueryVO() {
		return queryVO;
	}

	public void setQueryVO(E queryVO) {
		this.queryVO = queryVO;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}
