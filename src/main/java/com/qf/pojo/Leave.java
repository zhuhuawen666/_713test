package com.qf.pojo;

import java.sql.Date;

public class Leave {
    private int lid;
    private User user;
//    private Date startDate;
//    private Date endDate;
    private String reason;
    private int state;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String resson) {
        this.reason = resson;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "lid=" + lid +
                ", user=" + user +
                ", reason='" + reason + '\'' +
                ", state=" + state +
                '}';
    }
}
