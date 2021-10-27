package com.shang.wit.system.datacode.dao;


import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能数据持久层接口
 * @author shang
 * @version 1.0.0
 */
@Repository
public interface DataCodeCategoryDao {

	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<DataCodeCategory> findListByQuery(DataCodeCategory query)throws Exception;

	/**
	 * 保存对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(DataCodeCategory entity)throws Exception;

	/**
	 * 修改对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(DataCodeCategory entity)throws Exception;
}
