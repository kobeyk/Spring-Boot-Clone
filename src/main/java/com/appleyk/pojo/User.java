package com.appleyk.pojo;

import java.io.Serializable;

/**
 * @Description 用户表
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 12:45 2018-9-27
 */
public class User implements Serializable {

    /**
     * 用户ID
     */
    private Long   uid ;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    public  User(Long uid,String name,Integer age){
        this.uid = uid;
        this.name = name;
        this.age = age;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+",工号："+this.uid+",年龄："+this.age;
    }
}
