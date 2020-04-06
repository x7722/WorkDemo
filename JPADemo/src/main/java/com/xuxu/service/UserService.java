package com.xuxu.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.xuxu.dao.UserDao;
import com.xuxu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*****
 *  @author Monster Xu
 *  用户服务层
 *****/
@Service
public class UserService {

    //注入dao
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }


    /**
     * 添加用户
     * @param user
     */
    public void add(User user) {
        userDao.save(user);
    }
}
