package com.yan.spring02.service;

import com.yan.spring02.aop.MathInter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @date 2020/6/26 16:44
 */
public class ProxyBean {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        MathInter mathInter = context.getBean(MathInter.class);
        
        mathInter.add(1,2);
    }
}
