package com.evan.aopImplements;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author v_liwenyang
 */
public class TestDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        IUserDao userDao =(IUserDao) app.getBean("userDao_proxy");
        userDao.save();
    }
}
