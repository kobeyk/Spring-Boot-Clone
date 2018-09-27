package com.appleyk.pojo;

import com.appleyk.utils.DateUtils;


import java.io.*;
import java.util.Date;

/**
 * @Description -- 食谱类
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:03 2018-9-27
 */
public class CookBook implements  Cloneable,Serializable {

    // 食谱名称
    private String memu;
    // 食谱创建时间
    private Date   ctime;
    // 用户信息
    private User user;

    public  CookBook(){
        ctime = new Date();
    }

    public String getMemu() {
        return memu;
    }

    public void setMemu(String memu) {
        this.memu = memu;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString(){
        return "食谱名称："+this.memu+",食谱作者信息：--【"+user+"】 --- "+DateUtils.dateTostring(this.ctime);
    }

    /**
     * 对象之间的浅克隆【只负责copy对象本身，不负责深度copy其内嵌的成员对象】
     * @return
     */
    @Override
    public Object clone() {
        try{
            return  (CookBook) super.clone();
        }catch (CloneNotSupportedException ex){
            System.out.println(ex.getClass()+":"+ ex.getMessage());
        }
        return  null;
    }

    /**
     * 实现对象间的深度克隆【从外形到内在细胞，完完全全深度copy】
     * @return
     */
    public Object deepClone(){

        // Anything 都是可以用字节流进行表示，记住是任何！
        CookBook cookBook = null;
        try{

           ByteArrayOutputStream baos = new ByteArrayOutputStream();
           ObjectOutputStream oos = new ObjectOutputStream(baos);
           // 将当前的对象写入baos【输出流 -- 字节数组】里
           oos.writeObject(this);

           // 从输出字节数组缓存区中拿到字节流
           byte[] bytes = baos.toByteArray();

           // 创建一个输入字节数组缓冲区
           ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
           // 创建一个对象输入流
           ObjectInputStream ois = new ObjectInputStream(bais);
           // 下面将反序列化字节流 == 重新开辟一块空间存放反序列化后的对象
            cookBook = (CookBook) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getClass()+":"+e.getMessage());
        }
        return  cookBook;
    }

}
