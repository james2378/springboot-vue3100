package com.dao;

import com.entity.LiulanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LiulanjiluView;

/**
 * 浏览记录 Dao 接口
 *
 * @author 
 */
public interface LiulanjiluDao extends BaseMapper<LiulanjiluEntity> {

   List<LiulanjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
