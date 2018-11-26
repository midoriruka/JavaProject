package com.sijt;

import org.springframework.stereotype.Component;

/**
 * @author sijt
 * @date 2018/11/23 15:39.
 */
@Component("c")
public class Idol {
    private String name="linyoujia";
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
//    public void intrduce(){
//        System.out.println("你的idol："+this.name+"\n他的年龄是："+this.age);
//    }
}
