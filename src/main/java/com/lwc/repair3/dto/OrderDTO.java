package com.lwc.repair3.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lwc.repair3.enums.OrderStatusEnum;
import com.lwc.repair3.utils.serializer.Date2LongSerializer;
import lombok.Data;
import java.util.Date;

/**
 * 后台管理需要显示的
 */
@Data
public class OrderDTO {

    /**报修id*/
    private String orderId;

    /**保修人名字*/
    private String repairName;

    /**保修人电话*/
    private String repairPhone;

    /**报修人地址*/
    private String repairAddress;

    /**部件名称*/
    private String itemName;

    /**部件图片*/
    private String itemIcon;

    /**维修工人id*/
    private String repairWorkername;

    /**订单评分，1-5分，默认5*/
    private Integer orderLevel ;

    /**订单状态，0新订单，1已处理，3已取消*/
    private Integer OrderStatus = OrderStatusEnum.NEW_ORDER.getCode();


    /**创建时间*/
    @JsonSerialize(using = Date2LongSerializer.class)//本来是毫秒级的，转换成秒级
    private Date createTime;

}
