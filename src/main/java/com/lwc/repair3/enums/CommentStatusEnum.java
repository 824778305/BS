package com.lwc.repair3.enums;

import lombok.Getter;

@Getter
public enum CommentStatusEnum {
    NOT_COMMENT(0,"未评论"),
    FINISH_COMMENT(1,"已评论"),
    ;
    private Integer code;
    private String message;

    CommentStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
