package com.lwc.repair3.bean;

import java.io.Serializable;

public class SMS implements Serializable {
    private Integer id;
    private String name;
    private String tel;

    @Override
    public String toString() {
        return "SMS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public SMS() {
    }

    public SMS(Integer id, String name, String tel) {
        this.id = id;
        this.name = name;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
