package com.yan.spring02.entity;

import java.io.Serializable;

/**
 * @author
 * @date 2020/6/25 19:08
 */
public class Student implements Serializable {
    
    private Integer id;
    private String name;

    public Student() {
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
    
    public void init(){
        System.out.println("init");
    }
    
    public void destroy(){
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    
}
