package com.shang.wit.base.pojo.vo;

import com.shang.wit.base.pojo.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * 系统基础信息类 - 系统响应视图信息
 * <p>
 *   系统响应视图信息包含以下属性
 *     1、响应编码：code<br/>
 *     2、响应数据：data<br/>
 *    所有返回前端数据都必须以本系统响应视图信息返回
 * </p>
 * @author shang
 * @version 1.0.0
 */
@ApiModel("系统基础信息类 - 系统响应视图信息")
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = 5444256662593305636L;
	@ApiModelProperty(name = "系统响应编码",example = "2000")
	private Integer code;
	@ApiModelProperty(name = "系统响应数据")
	private E data;

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * 获得系统响应成功视图信息
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(), ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getRemark());
	}

	/**
	 * 获得系统响应成功视图信息
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccessResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_SUCCESS.getCode(), data);
	}

	/**
	 * 获得系统未认证视图信息
	 * @return
	 */
	public static ResponseVO getUnAuthResponseVO(){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getCode(), ResponseCodeEnum.RESPONSE_CODE_UNAUTH.getRemark());
	}

	/**
	 * 获得系统业务处理错误视图信息
	 * @param data
	 * @return
	 */
	public static ResponseVO getErrorResponseVO(Object data){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_ERROR.getCode(), data);
	}

	/**
	 * 获得系统响应异常视图信息
	 * @param exception
	 * @return
	 */
	public static ResponseVO getExceptionReponseVO(Exception exception){
		return new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_EXCEPTION.getCode(), exception.getMessage());
	}
}
