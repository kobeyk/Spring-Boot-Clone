package com.appleyk;

import com.appleyk.pojo.CookBook;
import com.appleyk.pojo.User;

/**
 * @Description
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:52 2018-9-27
 */
public class ObjectFactory {

    /**
     * 创建一个食谱对象（实例化类）
     * @return
     */
    public static CookBook createCookBook(){
        CookBook cookBook = new CookBook();
        cookBook.setMemu("Appleyk'食谱大全");
        cookBook.setUser(new User(1001L,"appleyk",18));
        return  cookBook;
    }
}
