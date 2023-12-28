package com.example.test;


import com.example.demotest.DemoTestApplication;
import com.example.demotest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoTestApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testAdd(){
        userService.add();
    }
}
