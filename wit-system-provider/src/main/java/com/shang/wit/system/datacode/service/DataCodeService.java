package com.shang.wit.system.datacode.service;

import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;

import java.util.List;

/**
 * 系统功能 - 数据编码功能 - 数据代码功能业务层接口
 * @author shang
 * @version 1.0.0
 */
public interface DataCodeService {
	/**
	 * 根据查询视图查询分页信息
	 * @param queryVO
	 * @param pageVO
	 * @return
	 */
	PageVO<DataCodeVO> getByPage(DataCodeVO queryVO, PageVO pageVO)throws Exception;

	/**
	 * 根据对象查询列表
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	List<DataCodeVO> getList(DataCodeVO queryVO)throws Exception;

	/**
	 * 根据编码查询视图对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DataCodeVO getCode(String code)throws Exception;

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DataCodeVO vo)throws Exception;

	/**
	 * 修改对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean update(DataCodeVO vo)throws Exception;

	/**
	 * 根据主键查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DataCodeVO getId(String id)throws Exception;
}
