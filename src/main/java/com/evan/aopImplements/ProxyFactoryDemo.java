package com.evan.aopImplements;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author v_liwenyang
 */
public class ProxyFactoryDemo {
    private static Object target;
    private static MyAop myAop_;

    public static Object getProxyInstanceDemo(Object object, MyAop myAop) {
        target = object;
        myAop_ = myAop;
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
                        myAop_.begin();
                        Object invoke = method.invoke(target, args);
                        myAop_.commit();
                        return invoke;
                    }
                }
        );
    }
}
