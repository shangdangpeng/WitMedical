package com.shang.wit.system.datacode.service;

import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;

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
}
