package com.lwc.repair3.bean;

import java.io.Serializable;

public class RSAData implements Serializable{
    private String data;
    private String encryptkey;

    public RSAData() {
    }

    public RSAData(String data, String encryptkey) {
        this.data = data;
        this.encryptkey = encryptkey;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEncryptkey() {
        return encryptkey;
    }

    public void setEncryptkey(String encryptkey) {
        this.encryptkey = encryptkey;
    }

    @Override
    public String toString() {
        return "RSAData{" +
                "data='" + data + '\'' +
                ", encryptkey='" + encryptkey + '\'' +
                '}';
    }
}
