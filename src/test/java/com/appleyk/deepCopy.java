package com.appleyk;

import com.appleyk.pojo.CookBook;
import org.junit.Test;

/**
 * @Description 对象深度克隆单元测试
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:31 2018-9-27
 */
public class deepCopy {


    @Test
    public  void copy3(){

        CookBook cookBookSrc = ObjectFactory.createCookBook();
        // 我们这里打印下原始食谱信息
        System.out.println("源"+cookBookSrc);

        // 然后我们需要克隆一份食谱，给另外一个人使用
        CookBook cookBookNew = (CookBook) cookBookSrc.deepClone();
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
