package com.yan.spring01.entity;

import java.io.Serializable;

/**
 * @author
 * @date 2020/6/25 11:22
 */
public class Person implements Serializable {
    
    private static final long serialVersionUID = -4494634252431562233L;
    
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
