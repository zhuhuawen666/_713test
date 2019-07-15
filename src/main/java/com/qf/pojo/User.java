package com.qf.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String username;
    private String password;
    private String cha;


    public String getCha() {
        return cha;
    }

    public void setCha(String cha) {
        this.cha = cha;
    }

    public User(int uid, String username, String password, int status) {
        this.uid = uid;
        this.username = username;
        this.password = password;

    }

    public User() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int uid, String username, String password, String cha) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.cha = cha;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cha='" + cha + '\'' +
                '}';
    }

}
