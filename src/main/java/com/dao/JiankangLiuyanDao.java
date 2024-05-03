package com.dao;

import com.entity.JiankangLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangLiuyanView;

/**
 * 健康知识评论 Dao 接口
 *
 * @author 
 */
public interface JiankangLiuyanDao extends BaseMapper<JiankangLiuyanEntity> {

   List<JiankangLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
