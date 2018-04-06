package com.qpf.orm.test;

import com.qpf.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import qpf.com.orm.UserMapper;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
class spring_myBatis_test {
    @Autowired
    private UserMapper mapper;

    @Test
    public void selectAll(){
        List<User> users = mapper.selectAllUser();
        for(User user : users){
            System.out.println(user);
        }
    }
}
