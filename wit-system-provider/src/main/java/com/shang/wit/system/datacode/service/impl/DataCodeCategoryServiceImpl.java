package com.shang.wit.system.datacode.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shang.wit.base.pojo.vo.PageVO;
import com.shang.wit.base.util.IdGenerator;
import com.shang.wit.system.datacode.dao.DataCodeCategoryDao;
import com.shang.wit.system.datacode.pojo.entity.DataCodeCategory;
import com.shang.wit.system.datacode.pojo.vo.DataCodeCategoryVO;
import com.shang.wit.system.datacode.service.DataCodeCategoryService;
import com.sun.corba.se.spi.orb.DataCollector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 智慧医疗信息平台 - 系统功能 - 数据编码功能 - 数据代码功能业务层接口实现类
 * @author shang
 * @version 1.0.0
 */
@Service("dataCodeCategory")
@Transactional
public class DataCodeCategoryServiceImpl implements DataCodeCategoryService {
	@Autowired
	private DataCodeCategoryDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * 根据查询对象进行分页查询
	 * @param queryVO
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<DataCodeCategoryVO> getByPage(DataCodeCategoryVO queryVO, PageVO<DataCodeCategoryVO> pageVO) throws Exception {
		//将视图对象转换为实体对象
		DataCodeCategory query = DataCodeCategory.getEntityFromVO(queryVO);
		//开启 pagehelper  分页查询过滤器
		PageHelper.startPage(pageVO.getPageNum(),pageVO.getPageSize());
		//获得查询列表
		List<DataCodeCategory> list = dao.findListByQuery(query);
		//根据列表创建pageinfo 对象
		PageInfo<DataCodeCategory> pageInfo=new PageInfo<DataCodeCategory>(list);
		//提取数据
		List<DataCodeCategory> entityList = pageInfo.getList();
		//将实体列表转为视图列表
		List<DataCodeCategoryVO> voList = new ArrayList<DataCodeCategoryVO>();
		if (entityList != null && !entityList.isEmpty()){
			for (DataCodeCategory entity:entityList){
				voList.add(DataCodeCategoryVO.getVOFromEntity(entity));
			}
		}

		pageVO.setList(voList);
		pageVO.setTotalSize(pageInfo.getTotal());
		pageVO.setTotalPage(pageInfo.getPages());
		return pageVO;
	}

	/**
	 * 根据编码查询对象
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public DataCodeCategoryVO getByCode(String code) throws Exception {
		DataCodeCategory query = new DataCodeCategory();
		query.setCode(code);
		List<DataCodeCategory> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()){
			return DataCodeCategoryVO.getVOFromEntity(list.get(0));
		}
		return null;
	}

	/**
	 * 保存对象
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(DataCodeCategoryVO vo) throws Exception {
		DataCodeCategory entity = DataCodeCategory.getEntityFromVO(vo);
		//设定主键
		entity.setId(idGenerator.createId());
		if (dao.save(entity)>0){
			return true;
		}

		return false;
	}

	/**
	 * 根据主键获得视图对象
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public DataCodeCategoryVO getById(String id) throws Exception {
		DataCodeCategory query = new DataCodeCategory();
		query.setId(id);
		List<DataCodeCategory> list = dao.findListByQuery(query);
		if (list !=null && !list.isEmpty()){
			return DataCodeCategoryVO.getVOFromEntity(list.get(0));
		}
		return null;
	}
}
