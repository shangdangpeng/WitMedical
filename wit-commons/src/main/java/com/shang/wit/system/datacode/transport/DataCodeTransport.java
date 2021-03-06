package com.shang.wit.system.datacode.transport;

import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

	/**
	 * 根据对象查询列表
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<DataCodeVO> getList(@RequestBody DataCodeVO queryVO)throws Exception;

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DataCodeVO vo)throws Exception;

	/**
	 * 根据编码查询视图对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DataCodeVO getCode(@RequestParam String code)throws Exception;

	/**
	 * 修改对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DataCodeVO vo)throws Exception;

	/**
	 * 根据主键查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DataCodeVO getId(@RequestParam String id)throws Exception;
}
