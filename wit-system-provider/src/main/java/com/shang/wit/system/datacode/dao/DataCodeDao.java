package com.shang.wit.system.datacode.dao;

import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据功能数据持久层接口
 * @author shang
 * @version 1.0.0
 */
@Repository
public interface DataCodeDao {
	/**
	 * 根据查询对象查询列表
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<DataCode> findListByQuery(DataCode query)throws Exception;

	/**
	 * 保存对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(DataCode entity)throws Exception;

	/**
	 * 修改对象信息
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(DataCode entity)throws Exception;
}
