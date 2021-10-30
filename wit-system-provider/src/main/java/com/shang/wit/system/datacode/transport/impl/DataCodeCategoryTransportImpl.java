package com.shang.wit.system.datacode.transport.impl;


import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import com.shang.wit.system.datacode.service.DataCodeCategoryService;
import com.shang.wit.system.datacode.transport.DataCodeCategoryTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能传输层接口实现类
 * @author shang
 * @version 1.0.0
 */
@RestController("dataCodeCategoryTransport")
@RequestMapping("/system/datacode/category/trans")
public class DataCodeCategoryTransportImpl implements DataCodeCategoryTransport {
	@Autowired
	private DataCodeCategoryService service;


	/**
	 * 根据查询对象进行分页查询
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	public PageVO<DataCodeCategoryVO> getByPage(QueryPageVO<DataCodeCategoryVO> queryPageVO) throws Exception {
		//分别获得pageVO 和  queryVO
		DataCodeCategoryVO queryVO = queryPageVO.getQueryVO();
		PageVO<DataCodeCategoryVO> pageVO = queryPageVO.getPageVO();
		return service.getByPage(queryVO,pageVO);
	}

	/**
	 * 根据编码查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	public DataCodeCategoryVO getByCode(String code) throws Exception {
		return service.getByCode(code);
	}

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public boolean save(DataCodeCategoryVO vo) throws Exception {
		return service.save(vo);
	}

	/**
	 * 根据主键获得视图对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	public DataCodeCategoryVO getById(String id) throws Exception {
		return service.getById(id);
	}
}
