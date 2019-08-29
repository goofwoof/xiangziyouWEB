package com.xzy.mybatis.dao;

import com.xzy.mybatis.pojo.Catroutehistory;
import com.xzy.mybatis.pojo.CatroutehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatroutehistoryMapper {
    long countByExample(CatroutehistoryExample example);

    int deleteByExample(CatroutehistoryExample example);

    int deleteByPrimaryKey(Integer idcatroutehistory);

    int insert(Catroutehistory record);

    int insertSelective(Catroutehistory record);

    List<Catroutehistory> selectByExample(CatroutehistoryExample example);

    Catroutehistory selectByPrimaryKey(Integer idcatroutehistory);

    int updateByExampleSelective(@Param("record") Catroutehistory record, @Param("example") CatroutehistoryExample example);

    int updateByExample(@Param("record") Catroutehistory record, @Param("example") CatroutehistoryExample example);

    int updateByPrimaryKeySelective(Catroutehistory record);

    int updateByPrimaryKey(Catroutehistory record);
}