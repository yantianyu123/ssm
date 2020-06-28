package com.yan.spring03.service;

import com.yan.spring03.dao.UserDao;
import com.yan.spring03.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * @date 2020/6/27 10:57
 */
@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private UserService userService;

    /**
     * 转账业务
     * @param user1 转账方
     * @param user2 接收方
     */
    @Transactional
    public void account(User user1,User user2){
        //转账
        updateUser(user1);
        //模拟异常
        int i = 1/0;
        //接收
        updateUser(user2);
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
