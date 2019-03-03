package com.netease.library.controller;

import com.netease.library.model.User;
import com.netease.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 17858 on 2019-03-03.
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public User getUser(@RequestParam("userId") Long userId,
                        @RequestParam("roleId") Long roleId) {
        User user = userService.getUserById(userId, roleId);
        return user;
    }
}
