package com.shang.wit.system.datacode.controller;

import com.shang.wit.base.controller.BaseController;
import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.base.pojo.vo.ResponseVO;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import com.shang.wit.system.datacode.transport.DataCodeTransport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能控制层
 * @author shang
 * @version 1.0.0
 */
@Api(value = "数据代码功能控制层",tags = "系统功能 - 数据编码功能 - 数据代码功能控制层")
@RestController("dataCodeController")
@RequestMapping("/system/datacode")
public class DataCodeController extends BaseController {
	@Autowired
	private DataCodeTransport transport;

	/**
	 * 根据查询对象进行分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据查询对象进行分页查询",tags = "根据查询对象进行分页查询")
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO queryByPage(@PathVariable("pageNum") Integer pageNum,
	                              @PathVariable("pageSize") Integer pageSize,
	                              @RequestBody DataCodeVO queryVO)throws Exception{
		//根据分页信息查询分页对象
		QueryPageVO<DataCodeVO> queryPageVO = new QueryPageVO<DataCodeVO>(queryVO,pageNum,pageSize);
		PageVO<DataCodeVO> pageVO = transport.getByPage(queryPageVO);
		return ResponseVO.getSuccessResponseVO(pageVO);
	}

	/**
	 * 根据对象查询列表
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据对象查询列表",tags = "根据对象查询列表")
	@PostMapping("/list")
	public ResponseVO queryList(@RequestBody DataCodeVO queryVO)throws Exception{
		return null;
	}

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "保存对象",tags = "保存对象")
	@PostMapping("/save")
	public ResponseVO save(@RequestBody DataCodeVO vo)throws Exception {
		return null;
	}

	/**
	 * 修改对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "修改对象",tags = "修改对象")
	@PostMapping("/update")
	public ResponseVO update(@RequestBody DataCodeVO vo)throws Exception {
		return null;
	}

	/**
	 * 根据编码查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据编码查询对象", tags = "根据编码查询对象")
	@PostMapping("/code")
	public ResponseVO queryByCode(@PathVariable("code") String code)throws Exception{
		return null;
	}

	/**
	 * 根据主键查询对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据主键查询对象",tags = "根据主键查询对象")
	@PostMapping("/id")
	public ResponseVO queryById(@PathVariable("id") String id)throws Exception{
		return null;
	}
}
