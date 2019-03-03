package com.netease.library.service.impl;

import com.netease.library.mapper.RoleMapper;
import com.netease.library.mapper.UserMapper;
import com.netease.library.model.Role;
import com.netease.library.model.User;
import com.netease.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 17858 on 2019-03-01.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public void addUser(User user) {
        int n = userMapper.addUser(user);
    }

    @Override
    public User getUserById(Long userId, Long roleId) {
        User user = userMapper.getUserById(userId);
        Role role = roleMapper.getRoleById(roleId);
        user.setRole(role);
        return user;
    }

    @Override
    public User getUseraByUsername(String username) {
        User user = userMapper.getUserByUsername(username);
        return user;
    }
}
