package com.shang.wit.system.datacode.transport.impl;


import com.shang.wit.system.datacode.service.DataCodeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能传输层接口实现类
 * @author shang
 * @version 1.0.0
 */
@RestController("dataCodeCategoryTransport")
@RequestMapping("/system/datacode/category/trans")
public class DataCodeCategoryTransportImpl {
	@Autowired
	private DataCodeCategoryService service;
}
