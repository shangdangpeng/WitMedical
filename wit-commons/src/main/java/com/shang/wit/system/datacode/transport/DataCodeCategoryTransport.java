package com.shang.wit.system.datacode.transport;


import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码传输层接口
 * @author shang
 * @version 1.0.0
 */
@FeignClient(name = "wit-system-provider")
@RequestMapping("/system/datacode/category/trans")
public interface DataCodeCategoryTransport {

	/**
	 * 根据查询对象进行分页查询
	 * @param queryPageVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DataCodeCategoryVO> getByPage(@RequestBody QueryPageVO<DataCodeCategoryVO> queryPageVO)throws Exception;

	/**
	 * 根据编码查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DataCodeCategoryVO getByCode(@RequestParam String code)throws Exception;

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DataCodeCategoryVO vo)throws Exception;

	/**
	 * 根据主键获得视图对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DataCodeCategoryVO getById(@RequestParam String id)throws Exception;
}
