package com.odianyun.internship.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zfy
 * @create 2021-07-13 11:08
 */
@Component
public class user {
    private String userName;
    private String sex;
    private String mobile;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
