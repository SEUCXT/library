package com.netease.library.mapper;

import com.netease.library.model.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 17858 on 2019-03-03.
 */
@Mapper
public interface RoleMapper {

    Role getRoleById(Long id);

    void addRole(Role role);
}
