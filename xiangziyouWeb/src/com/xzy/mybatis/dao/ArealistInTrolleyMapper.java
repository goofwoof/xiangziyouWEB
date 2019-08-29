package com.xzy.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.xzy.mybatis.pojo.ArealistInTrolley;
import com.xzy.mybatis.pojo.ArealistInTrolleyExample;

public interface ArealistInTrolleyMapper {
    long countByExample(ArealistInTrolleyExample example);

    int deleteByExample(ArealistInTrolleyExample example);

    int deleteByPrimaryKey(Integer idarealistInTrolley);

    int insert(ArealistInTrolley record);

    int insertSelective(ArealistInTrolley record);

    List<ArealistInTrolley> selectByExample(ArealistInTrolleyExample example);

    ArealistInTrolley selectByPrimaryKey(Integer idarealistInTrolley);

    int updateByExampleSelective(@Param("record") ArealistInTrolley record, @Param("example") ArealistInTrolleyExample example);

    int updateByExample(@Param("record") ArealistInTrolley record, @Param("example") ArealistInTrolleyExample example);

    int updateByPrimaryKeySelective(ArealistInTrolley record);

    int updateByPrimaryKey(ArealistInTrolley record);
}