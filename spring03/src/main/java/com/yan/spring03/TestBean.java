package com.yan.spring03;

import com.yan.spring03.entity.User;
import com.yan.spring03.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author
 * @date 2020/6/27 2:15
 */
public class TestBean {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

    public static void main(String[] args) {
        TestBean bean = new TestBean();
        
        //bean.test1();
        //bean.test2();
        bean.transactionTest();

    }
    
    //事务测试
    public void transactionTest(){
        UserService userService = context.getBean(UserService.class);
        
        User user1 = new User();
        user1.setId(1);
        user1.setMoney(600);
        
        User user2 = new User();
        user2.setId(2);
        user2.setMoney(400);
        userService.account(user1,user2);
    }
    
    //查询
    public void test2(){
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }

    //添加数据
    public void test1() {
        String sql = "insert into user values(null,?,?)";
        jdbcTemplate.update(sql,"李四",0);
    }
}
