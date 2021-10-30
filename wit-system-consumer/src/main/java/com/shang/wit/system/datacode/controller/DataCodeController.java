package com.shang.wit.system.datacode.controller;

import com.shang.wit.base.controller.BaseController;
import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.pojo.vo.QueryPageVO;
import com.shang.wit.base.pojo.vo.ResponseVO;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import com.shang.wit.system.datacode.transport.DataCodeCategoryTransport;
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
	@Autowired
	private DataCodeCategoryTransport dataCodeCategoryTransport;

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
		return ResponseVO.getSuccessResponseVO(transport.getList(queryVO));
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
		//判断用户所填写的信息是否存在
		if (vo.getName()!=null && !"".equals(vo.getName().trim()) && vo.getCode()!=null && !"".equals(vo.getCode().trim())){
			if (vo.getDataCodeCategoryVO()!=null && vo.getDataCodeCategoryVO().getId()!=null){
				//校验所给定的数据编码类别存在
				if (dataCodeCategoryTransport.getById(vo.getDataCodeCategoryVO().getId())!=null){
					if (transport.getCode(vo.getCode())==null){
						if(transport.save(vo)){
							return ResponseVO.getSuccessResponseVO("添加成功");
						}
						return ResponseVO.getErrorResponseVO("添加失败");
					}
					return ResponseVO.getErrorResponseVO("该编码已经被使用");
				}
				return ResponseVO.getErrorResponseVO("未选择有效的数据编码类型");
			}
			return ResponseVO.getErrorResponseVO("未选择对应的数据编码类型");
		}
		return ResponseVO.getErrorResponseVO("未填写有效的名称和编码");
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
		//判断用户所填写的信息是否存在
		if (vo.getName()!=null && !"".equals(vo.getName().trim()) && vo.getCode()!=null && !"".equals(vo.getCode().trim())){
			if (vo.getDataCodeCategoryVO()!=null && vo.getDataCodeCategoryVO().getId()!=null){
				//校验所给定的数据编码类别存在
				if (dataCodeCategoryTransport.getById(vo.getDataCodeCategoryVO().getId())!=null){
					if (transport.getCode(vo.getCode())==null || transport.getCode(vo.getCode()).getId()==vo.getId()){
						if(transport.update(vo)){
							return ResponseVO.getSuccessResponseVO("添加成功");
						}
						return ResponseVO.getErrorResponseVO("添加失败");
					}
					return ResponseVO.getErrorResponseVO("该编码已经被使用");
				}
				return ResponseVO.getErrorResponseVO("未选择有效的数据编码类型");
			}
			return ResponseVO.getErrorResponseVO("未选择对应的数据编码类型");
		}
		return ResponseVO.getErrorResponseVO("未填写有效的名称和编码");
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
		return ResponseVO.getSuccessResponseVO(transport.getCode(code));
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
		return ResponseVO.getSuccessResponseVO(transport.getId(id));
	}
}
