package com.yan.spring01.test;

import com.yan.spring01.entity.Person;
import com.yan.spring01.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @date 2020/6/25 11:32
 */
public class TestBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Person person1 = context.getBean("person", Person.class);
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person1 == person2);

        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
