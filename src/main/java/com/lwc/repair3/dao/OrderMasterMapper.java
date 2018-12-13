package com.lwc.repair3.dao;

import com.lwc.repair3.bean.OrderMaster;
import com.lwc.repair3.bean.OrderMasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMasterMapper {
    long countByExample(OrderMasterExample example);

    int deleteByExample(OrderMasterExample example);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    List<OrderMaster> selectByExample(OrderMasterExample example);

    int updateByExampleSelective(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);

    int updateByExample(@Param("record") OrderMaster record, @Param("example") OrderMasterExample example);
}