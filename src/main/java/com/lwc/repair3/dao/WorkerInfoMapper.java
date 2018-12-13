package com.lwc.repair3.dao;

import com.lwc.repair3.bean.WorkerInfo;
import com.lwc.repair3.bean.WorkerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkerInfoMapper {
    long countByExample(WorkerInfoExample example);

    int deleteByExample(WorkerInfoExample example);

    int insert(WorkerInfo record);

    int insertSelective(WorkerInfo record);

    List<WorkerInfo> selectByExample(WorkerInfoExample example);

    int updateByExampleSelective(@Param("record") WorkerInfo record, @Param("example") WorkerInfoExample example);

    int updateByExample(@Param("record") WorkerInfo record, @Param("example") WorkerInfoExample example);
}