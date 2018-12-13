package com.lwc.repair3.bean;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
@Data
public class Msg {

    private int code;//状态码    100成功   200失败
    private String msg;//提示信息
    private Map<String,Object> extend=new HashMap<String,Object>();//用户要返回给浏览器的数据

    public static Msg success(){
        Msg result=new Msg();
        result.setCode(100);
        result.setMsg("处理成功");
        return result;
    }
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(200);
        result.setMsg("处理失败");
        return result;
    }

    public Msg add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }

}
