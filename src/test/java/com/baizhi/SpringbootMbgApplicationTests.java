package com.baizhi;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMbgApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void test(){
        List<User> list=userMapper.selectAll();
        System.out.println(list);
    }

    @Test
    public void test1(){
        User user=new User();
        user.setId(10001);
        User user2=userMapper.selectByPrimaryKey(user);
        System.out.println(user2);
    }

    @Test
    public void test2(){
        User user=new User();
        user.setName("mingming");
        List<User> users =userMapper.select(user);
        System.out.println(users);

    }

    @Test
    public void test3(){


    }
}
