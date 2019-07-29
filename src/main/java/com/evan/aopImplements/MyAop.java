package com.evan.aopImplements;

import org.springframework.stereotype.Component;

/**
 * @author v_liwenyang
 */
@Component
public class MyAop {
    public void begin(){
        System.out.println("开启事务");
    }

    public void commit(){
        System.out.println("提交事物");
    }
}
