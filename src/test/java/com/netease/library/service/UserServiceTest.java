package com.netease.library.service;

import com.netease.library.mapper.RoleMapper;
import com.netease.library.mapper.UserMapper;
import com.netease.library.model.Role;
import com.netease.library.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by 17858 on 2019-03-03.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    private RoleMapper roleMapper;

    @Test
    public void getUserById() throws Exception {
        when(roleMapper.getRoleById(1l)).thenReturn(buildRole());
        User user = userService.getUserById(1l,2l);
//        Assert.assertEquals(user.toString());

    }


    private Role buildRole() {
        Role role = new Role();
        role.setId(2l);
        role.setRole_name("customer");
        return role;
    }

}