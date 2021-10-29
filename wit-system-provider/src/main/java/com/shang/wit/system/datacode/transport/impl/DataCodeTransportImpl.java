package com.shang.wit.system.datacode.transport.impl;

import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import com.shang.wit.system.datacode.service.DataCodeService;
import com.shang.wit.system.datacode.transport.DataCodeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码传输层接口实现类
 * @author shang
 * @version 1.0.0
 */
@RestController("dataCodeTransport")
@RequestMapping("/system/datacode/trans")
public class DataCodeTransportImpl implements DataCodeTransport {
	@Autowired
	private DataCodeService service;

	/**
	 * 根据查询视图查询分页信息
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<DataCodeVO> getByPage(@RequestBody QueryPageVO<DataCodeVO> queryPageVO) throws Exception {
		//提取queryPageVO中的 pagevo 和  queryvo
		DataCodeVO queryVO = queryPageVO.getQueryVO();
		PageVO pageVO = queryPageVO.getPageVO();
		return service.getByPage(queryVO,pageVO);
	}
}
