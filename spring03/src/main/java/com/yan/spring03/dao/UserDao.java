package com.yan.spring03.dao;

import com.yan.spring03.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @date 2020/6/27 10:57
 */
@Repository
public class UserDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void updateUser(User user){
        String sql = "update user set money = ? where id = ?";
        jdbcTemplate.update(sql, user.getMoney(), user.getId());
    }
    
}
