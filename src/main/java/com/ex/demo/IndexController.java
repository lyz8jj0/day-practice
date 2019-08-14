package com.ex.demo;

import com.ex.Demo;
import com.ex.User;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李新宇
 * 2019-08-13 10:05
 */
public class IndexController {


    public static void main(String[] args) {

        User user1 = new User();
        user1.setId("1");
        user1.setUserName("userName1");
        user1.setUserPassword("userPassword1");
        User user2 = new User();
        user2.setId("2");
        user2.setUserName("userName2");
        user2.setUserPassword("userPassword2");

        Demo demo = new Demo<>();
        List<User> result  = new ArrayList<>();
        result.add(user1);
        result.add(user2);
        demo.setList(result);

        System.out.println(demo);

        Type type = ((ParameterizedType)demo.getList().getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        System.out.println(type);



    }
}
