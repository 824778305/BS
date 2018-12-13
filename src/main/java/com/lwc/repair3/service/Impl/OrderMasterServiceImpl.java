package com.lwc.repair3.service.Impl;

import com.lwc.repair3.converter.OrderMaster2OrderVoConverter;
import com.lwc.repair3.dto.OrderDTO;
import com.lwc.repair3.service.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class OrderMasterServiceImpl implements OrderMasterService {

  /*  @Autowired
    OrderMasterMapper orderMasterMapper;

    @Override
    public List<OrderDTO> findAll() {
        List<OrderMaster> orderMasterList = orderMasterMapper.selectByExample(null);
        List<OrderDTO> orderDTOList = OrderMaster2OrderVoConverter.convert(orderMasterList);
        return orderDTOList;
    }

    public List<OrderMaster> findAll2() {
        List<OrderMaster> orderMasterList = orderMasterMapper.selectByExample(null);
        //List<OrderDTO> orderDTOList = OrderMaster2OrderVoConverter.convert(orderMasterList);
        return orderMasterList;
    }*/

}
