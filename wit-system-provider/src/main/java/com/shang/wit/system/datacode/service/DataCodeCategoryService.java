package com.shang.wit.system.datacode.service;


import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码类别业务层接口
 * @author shang
 * @version 1.0.0
 */
public interface DataCodeCategoryService {

	/**
	 * 根据查询对象进行分页查询
	 * @param queryVO
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<DataCodeCategoryVO> getByPage(DataCodeCategoryVO queryVO, PageVO<DataCodeCategoryVO> pageVO)throws Exception;

	/**
	 * 根据编码查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DataCodeCategoryVO getByCode(String code)throws Exception;

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	boolean save(DataCodeCategoryVO vo)throws Exception;

	/**
	 * 根据主键获得视图对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DataCodeCategoryVO getById(String id)throws Exception;
}
