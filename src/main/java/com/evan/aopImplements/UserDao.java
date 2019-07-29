package com.evan.aopImplements;

import org.springframework.stereotype.Component;

/**
 * @author v_liwenyang
 */
@Component
public class UserDao implements IUserDao {

    public void save() {
        System.out.println("保存成功");
    }
}
