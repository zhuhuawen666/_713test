package com.qf.service;

import com.qf.mapper.UserMapper;

import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password,String cha) {
        User user = userMapper.getUser(username,password,cha);
        return user;
    }

    @Override
    public User getUser(String username) {
        return userMapper.getUser2(username);
    }


    @Override
    public Integer findUser(String username) {
        return userMapper.findUser(username);
    }

    @Override
    public String getPassword(String password) {

        return userMapper.getPassword(password);
    }

    @Override
    public List<String> getRolesByUsername(String username) {
        return userMapper.getRolesByUsername(username);
    }

    @Override
    public List<String> getPermissionByRole(String username) {
        List<String> roles = userMapper.getRolesByUsername(username);
        List<String> permissions = userMapper.getPermissionByRole(roles);
        return permissions;
    }


}
