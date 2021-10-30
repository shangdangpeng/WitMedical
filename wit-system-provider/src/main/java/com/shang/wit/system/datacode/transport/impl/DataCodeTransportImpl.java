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

import java.util.List;


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

	/**
	 * 根据对象查询列表
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	public List<DataCodeVO> getList(DataCodeVO queryVO) throws Exception {
		return service.getList(queryVO);
	}

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(DataCodeVO vo) throws Exception {
		return service.save(vo);
	}

	/**
	 * 根据编码查询视图对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DataCodeVO getCode(String code) throws Exception {
		return service.getCode(code);
	}

	/**
	 * 修改对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public boolean update(DataCodeVO vo) throws Exception {
		return service.update(vo);
	}

	/**
	 * 根据主键查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DataCodeVO getId(String id) throws Exception {
		return service.getId(id);
	}
}
