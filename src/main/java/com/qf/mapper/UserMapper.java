package com.qf.mapper;


import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User getUser(@Param(value = "username") String username, @Param(value = "password") String password,@Param(value = "cha")String cha);
    Integer findUser(String username);
    String getPassword(String password);
    List<String> getRolesByUsername(String username);
    List<String> getPermissionByRole(List<String> roles);
    User getUser2(String username);
}
