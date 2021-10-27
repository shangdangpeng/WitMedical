package com.shang.wit.system.datacode.controller;

import com.shang.wit.base.controller.BaseController;
import com.shang.wit.system.datacode.transport.DataCodeCategoryTransport;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Name;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能控制层
 * @author shang
 * @version 1.0.0
 */
@Api(value = "数据代码功能控制层",tags = "系统功能 - 数据编码功能 - 数据代码功能控制层")
@Controller("dataCodeCategoryController")
@RequestMapping("/system/datacode/category")
public class DataCodeCategoryController extends BaseController {
	@Autowired
	private DataCodeCategoryTransport transport;
}
