package com.yan.spring02.aop;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author
 * @date 2020/6/26 13:52
 */
@Component
public class MathImpl implements MathInter {
    
    public Integer add(int i, int j) {
        int result = i + j;
        return result;
    }
    
}
