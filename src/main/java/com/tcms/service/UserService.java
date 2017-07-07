package com.tcms.service;

import com.db.model.User;

/**
 * Created by 01 on 七月 04 0004 .
 */
public interface UserService {
    /*根据用户名查询用户密码*/
    User getUser(String userId);
}
