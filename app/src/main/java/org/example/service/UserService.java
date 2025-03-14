package org.example.service;

import org.apache.catalina.User;
import org.example.bean.UserConfig;

public class UserService {

    UserConfig userConfig;

    public UserService(UserConfig userConfig) {
        this.userConfig=userConfig;
    }
}
