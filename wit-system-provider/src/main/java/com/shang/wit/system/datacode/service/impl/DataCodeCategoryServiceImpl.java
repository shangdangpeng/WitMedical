package com.shang.wit.system.datacode.service.impl;

import com.shang.wit.system.datacode.dao.DataCodeCategoryDao;
import com.shang.wit.system.datacode.service.DataCodeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能业务层接口实现类
 * @author shang
 * @version 1.0.0
 */
@Service("dataCodeCategory")
@Transactional
public class DataCodeCategoryServiceImpl implements DataCodeCategoryService {
	@Autowired
	private DataCodeCategoryDao dao;
}
