package com.lwc.repair3.enums;

import lombok.Getter;

@Getter
public enum OrderLevelEnum {
    LEVEL1(1,"一星级"),
    LEVEL2(2,"两星级"),
    LEVEL3(3,"三星级"),
    LEVEL4(4,"四星级"),
    LEVEL5(5,"五星级"),
    ;
    private Integer level;
    private String  message;

    OrderLevelEnum(Integer level, String message) {
        this.level = level;
        this.message = message;
    }
}
