package com.yan.spring01.entity;

import java.io.Serializable;

/**
 * @author
 * @date 2020/6/25 14:07
 */
public class Student implements Serializable {
    
    private String name;
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
