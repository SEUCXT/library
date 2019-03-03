package com.netease.library.service;

import com.netease.library.model.User;

/**
 * Created by 17858 on 2019-03-01.
 */
public interface UserService {

    void addUser(User user);

    User getUserById(Long userId, Long roleId);

    User getUseraByUsername(String username);
}
