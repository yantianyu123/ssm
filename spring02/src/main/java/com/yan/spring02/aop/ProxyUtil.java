package com.yan.spring02.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author
 * @date 2020/6/26 13:56
 */
public class ProxyUtil<T> {

    private T t;

    public ProxyUtil(T t) {
        this.t = t;
    }

    public T getProxy() {

        return (T) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), t.getClass().getInterfaces(), (proxy, method, args) -> {
            Object result = null;
            try {
                System.out.println("前置通知=======>方法名：" + method.getName());
                result = method.invoke(t, args);
                System.out.println("返回通知=======>方法结果：" + result);
            } catch (IllegalAccessException e) {
                System.out.println("异常通知=======>异常信息：" + e.getMessage());
            } finally {
                System.out.println("后置通知=======>");
            }
            return result;
        });
    }
}
