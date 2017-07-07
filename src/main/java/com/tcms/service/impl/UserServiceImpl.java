package com.tcms.service.impl;

import com.db.dao.UserMapper;
import com.db.model.User;
import com.tcms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by 01 on 七月 04 0004 .
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;

    public User getUser(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }


}
