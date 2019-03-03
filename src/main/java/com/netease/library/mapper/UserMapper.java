package com.netease.library.mapper;

import com.netease.library.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 17858 on 2019-03-01.
 */
@Mapper
public interface UserMapper {

    int addUser(User user);

    User getUserById(long id);

    User getUserByUsername(String username);

}
