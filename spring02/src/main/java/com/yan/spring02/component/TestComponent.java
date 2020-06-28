package com.yan.spring02.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author
 * @date 2020/6/26 9:33
 */
@Component
public class TestComponent {
    
    @PostConstruct
    public void initData(){
        System.out.println("我是初始化方法");
    }
    
}
