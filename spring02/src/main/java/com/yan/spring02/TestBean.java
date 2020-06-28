package com.yan.spring02;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.DruidDataSourceStatManager;
import com.yan.spring02.controller.StudentController;
import com.yan.spring02.dao.StudentDao;
import com.yan.spring02.entity.Student;
import com.yan.spring02.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @author
 * @date 2020/6/25 19:12
 */
public class TestBean {

    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Student student1 = context.getBean("student", Student.class);
        //context.close();
        DruidDataSource datasource = context.getBean("datasource", DruidDataSource.class);
        System.out.println(datasource);

        StudentController studentController = context.getBean(StudentController.class);
        System.out.println(studentController);
        
        StudentService studentService = context.getBean(StudentService.class);
        System.out.println(studentService);

        StudentDao studentDao = context.getBean(StudentDao.class);
        System.out.println(studentDao);
    }
    
}
