package com.qf.service;


import com.qf.pojo.User;

import java.util.List;

public interface UserService {
    User login(String username, String password,String cha);
    User getUser(String username);

    Integer findUser(String username);
    String getPassword(String password);
    List<String> getRolesByUsername(String username);
    List<String> getPermissionByRole(String username);
}
