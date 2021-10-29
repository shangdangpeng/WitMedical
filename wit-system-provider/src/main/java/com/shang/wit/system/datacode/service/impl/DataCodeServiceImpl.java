package com.shang.wit.system.datacode.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.util.IdGenerator;
import com.shang.wit.system.datacode.dao.DataCodeDao;
import com.shang.wit.system.datacode.pojo.entity.DataCode;
import com.shang.wit.system.datacode.pojo.vo.DataCodeVO;
import com.shang.wit.system.datacode.service.DataCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 系统功能 - 数据编码功能 - 数据代码业务层接口实现类
 * @author shang
 * @version 1.0.0
 */
@Service("dataCodeService")
@Transactional
public class DataCodeServiceImpl implements DataCodeService {
	@Autowired
	private DataCodeDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据查询视图查询分页信息
	 * @param queryVO
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<DataCodeVO> getByPage(DataCodeVO queryVO, PageVO pageVO) throws Exception {
		//将查询视图切换为实体
		DataCode query = DataCode.getEntityFromVO(queryVO);
		//开启 pagehelper 分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//进行列表查询
		List<DataCode> list = dao.findListByQuery(query);
		//创建 pageinfo 对象
		PageInfo<DataCode> pageInfo = new PageInfo<DataCode>(list);
		//获得分页查询列表
		List<DataCode> entityList = pageInfo.getList();
		//将数据进行切换
		List<DataCodeVO> voList = new ArrayList<DataCodeVO>();
		if (list != null && !list.isEmpty()){
			for (DataCode entity:list){
				DataCodeVO vo = DataCodeVO.getVOFromEntity(entity);
				voList.add(vo);
			}

		}
		pageVO.setList(voList);
		pageVO.setTotalSize(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
		return pageVO;
	}
}
