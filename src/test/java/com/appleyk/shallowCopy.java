package com.appleyk;

import com.appleyk.pojo.CookBook;
import com.appleyk.pojo.User;
import org.junit.Test;

/**
 * @Description 对象浅拷贝单元测试
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:01 2018-9-27
 */
public class shallowCopy {


    /**
     * 对象之间的引用
     * Object a = new Object();
     * Object b = a;
     */
    @Test
    public  void copy1(){

        CookBook cookBookSrc = ObjectFactory.createCookBook();
        // 我们这里打印下原始食谱信息
        System.out.println("源"+cookBookSrc);

        // 然后我们需要复制一份食谱，给另外一个人使用
        CookBook cookBookNew = cookBookSrc;
        // 由于上述是对象之间的直接"赋值"或"复制"，因此，新的食谱在内存中的地址引用其实和原始食谱是一样的
        System.out.println("新"+cookBookNew);

        System.out.println("新食谱不做修改之前======================新食谱修改之后");
        cookBookNew.getUser().setAge(27);
        cookBookNew.setMemu("豫菜食谱大全");
        System.out.println("源"+cookBookSrc);
        System.out.println("新"+cookBookNew);
        System.out.println("源 == 新:"+(cookBookSrc.equals(cookBookNew)));
    }

    /**
     * 对象之间的克隆
     * Object a = new Object();
     * Object b = a;
     */
    @Test
    public  void copy2(){

        CookBook cookBookSrc = ObjectFactory.createCookBook();
        // 我们这里打印下原始食谱信息
        System.out.println("源"+cookBookSrc);

        // 然后我们需要克隆一份食谱，给另外一个人使用
        CookBook cookBookNew = (CookBook) cookBookSrc.clone();
        // 由于上述是对象之间的直接"赋值"或"复制"，因此，新的食谱在内存中的地址引用其实和原始食谱是一样的
        System.out.println("新"+cookBookNew);

        System.out.println("新食谱不做修改之前======================新食谱修改之后");
        cookBookNew.getUser().setAge(27);
        cookBookNew.setMemu("豫菜食谱大全");
        System.out.println("源"+cookBookSrc);
        System.out.println("新"+cookBookNew);
        System.out.println("源 == 新:"+(cookBookSrc.equals(cookBookNew)));
    }

}
