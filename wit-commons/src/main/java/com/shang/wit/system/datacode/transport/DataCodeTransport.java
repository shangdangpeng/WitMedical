package com.shang.wit.system.datacode.transport;

import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能传输层接口
 * @author shang
 * @version 1.0.0
 */
@FeignClient(name = "wit-system-provider")
@RequestMapping("/system/datacode/trans")
public interface DataCodeTransport {
	/**
	 * 根据查询视图查询分页信息
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DataCodeVO> getByPage(@RequestBody QueryPageVO<DataCodeVO> queryPageVO)throws Exception;
}
