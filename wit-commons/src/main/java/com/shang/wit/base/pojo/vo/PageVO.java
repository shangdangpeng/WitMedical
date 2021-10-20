package com.shang.wit.base.pojo.vo;

import com.shang.wit.base.util.BaseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 系统基础信息类 - 分页视图信息
 * <p>
 *    分页视图信息包含以下属性
 *     1、当前页码：pageNum<br/>
 *     2、每页显示数量：pageSize<br/>
 *     3、分页列表：list<br/>
 *     4、总条数：totalSize<br/>
 *     5、总页数：totalPage<br/>
 *    所有功能实体信息都必须继承于基础实体信息类
 * </p>
 * @author shang
 * @version 1.0.0
 */
@ApiModel("系统基础信息类 - 分页视图信息")
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -2593651137778312771L;
	@ApiModelProperty(name = "当前页码", example = "1")
	private Integer pageNum;                        // 当前页码
	@ApiModelProperty(name = "每页显示数量", example = "10")
	private Integer pageSize;                       // 每页显示数量
	@ApiModelProperty(name = "分页列表")
	private List<E> list;                           // 分页列表
	@ApiModelProperty(name = "总条数", example = "100")
	private Long totalSize;                         // 总条数
	@ApiModelProperty(name = "总页数", example = "10")
	private Integer totalPage;                      // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
