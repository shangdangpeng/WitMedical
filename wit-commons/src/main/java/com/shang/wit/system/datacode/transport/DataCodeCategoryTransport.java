package com.shang.wit.system.datacode.transport;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能传输层接口
 * @author shang
 * @version 1.0.0
 */
@FeignClient(name = "wit-system-provider")
@RequestMapping("/system/datacode/category/trans")
public interface DataCodeCategoryTransport {

}
