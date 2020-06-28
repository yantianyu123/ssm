package com.yan.spring01.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author
 * @date 2020/6/25 14:29
 */
public class Teacher implements Serializable {
    
    private String name;
    
    private List<String> clazzs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClazzs() {
        return clazzs;
    }

    public void setClazzs(List<String> clazzs) {
        this.clazzs = clazzs;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", clazzs=" + clazzs +
                '}';
    }
}
