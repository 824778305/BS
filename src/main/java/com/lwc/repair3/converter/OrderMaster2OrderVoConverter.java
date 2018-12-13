package com.lwc.repair3.converter;

import com.lwc.repair3.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMaster2OrderVoConverter {

   /* public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderVO =new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderVO);
        return orderVO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e ->convert(e)).collect(Collectors.toList());
    }*/
}
