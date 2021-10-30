package com.shang.wit.system.datacode.controller;

import com.shang.wit.base.controller.BaseController;
import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.base.pojo.vo.ResponseVO;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import com.shang.wit.system.datacode.transport.DataCodeCategoryTransport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import javax.naming.Name;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能控制层
 * @author shang
 * @version 1.0.0
 */
@Api(value = "数据代码功能控制层",tags = "系统功能 - 数据编码功能 - 数据代码功能控制层")
@RestController("dataCodeCategoryController")
@RequestMapping("/system/datacode/category")
public class DataCodeCategoryController extends BaseController {
	@Autowired
	private DataCodeCategoryTransport transport;

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
	public ResponseVO<DataCodeCategory> queryByPage(@PathVariable("pageNum") Integer pageNum,
	                                                @PathVariable("pageSize") Integer pageSize,
	                                                @RequestBody DataCodeCategoryVO queryVO)throws Exception{
			//根据分页信息查询分页对象
		QueryPageVO<DataCodeCategoryVO> queryPageVO = new QueryPageVO<DataCodeCategoryVO>(queryVO,pageNum,pageSize);
		PageVO<DataCodeCategoryVO> pageVO = transport.getByPage(queryPageVO);
		return ResponseVO.getSuccessResponseVO(pageVO);
	}

	/**
	 * 根据查询对象查询列表
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "根据查询对象查询列表",tags = "根据查询对象查询列表")
	@PostMapping("/list")
	public ResponseVO queryListByQuery(DataCodeCategoryVO queryVO)throws Exception{
		return null;
	}

	/**
	 * 保存对象信息
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = "保存对象信息",tags = "保存对象信息")
	@PostMapping("/save")
	public ResponseVO save(@RequestBody DataCodeCategoryVO vo)throws Exception{
		//校验用户信息
		if (vo.getName() !=null && !"".equals(vo.getName()) && vo.getCode() != null
				&& !"".equals(vo.getCode())){
			//检查编码是否存在
			if (transport.getByCode(vo.getCode()) == null){
				if (transport.save(vo)){
					return ResponseVO.getSuccessResponseVO("保存成功");
				}
				return ResponseVO.getErrorResponseVO("保存失败");
			}
			return ResponseVO.getErrorResponseVO("该类别编码已经被使用");
		}
		return ResponseVO.getErrorResponseVO("请填写类别名称和编码");
	}
}
