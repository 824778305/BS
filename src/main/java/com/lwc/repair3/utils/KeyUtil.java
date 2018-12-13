package com.lwc.repair3.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成唯一的逐渐
     * 格式：  时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(100);
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
