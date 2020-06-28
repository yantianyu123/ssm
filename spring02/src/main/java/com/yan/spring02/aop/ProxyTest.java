package com.yan.spring02.aop;

/**
 * @author
 * @date 2020/6/26 14:06
 */
public class ProxyTest {

    public static void main(String[] args) {
        ProxyUtil<MathInter> proxyUtil = new ProxyUtil<>(new MathImpl());
        MathInter proxy = proxyUtil.getProxy();
        System.out.println(proxy.getClass().getName());
        proxy.add(1,2);
    }
}
