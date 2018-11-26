package com.sijt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author sijt
 * @date 2018/11/26 10:11.
 */
@Component("p")
public class Product {
    private int id;
    private String name="name";
    @Autowired
    private Idol idol;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Idol getIdol(){
        return idol;
    }
    public void setIdol(Idol idol){
        this.idol=idol;
    }
}
