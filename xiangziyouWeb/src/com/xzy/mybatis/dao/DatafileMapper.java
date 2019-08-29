package com.xzy.mybatis.dao;

import com.xzy.mybatis.pojo.Datafile;
import com.xzy.mybatis.pojo.DatafileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatafileMapper {
    long countByExample(DatafileExample example);

    int deleteByExample(DatafileExample example);

    int deleteByPrimaryKey(Integer iddatafile);

    int insert(Datafile record);

    int insertSelective(Datafile record);

    List<Datafile> selectByExample(DatafileExample example);

    Datafile selectByPrimaryKey(Integer iddatafile);

    int updateByExampleSelective(@Param("record") Datafile record, @Param("example") DatafileExample example);

    int updateByExample(@Param("record") Datafile record, @Param("example") DatafileExample example);

    int updateByPrimaryKeySelective(Datafile record);

    int updateByPrimaryKey(Datafile record);
}