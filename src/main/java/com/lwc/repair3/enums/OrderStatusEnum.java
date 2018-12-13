package com.lwc.repair3.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW_ORDER(1,"新下单"),
    handle_order(2,"处理中"),
    finish_order(3,"已完成"),
    cancel_order(4,"已取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
