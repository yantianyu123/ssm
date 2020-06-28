package com.yan.spring02.service.impl;

import com.yan.spring02.dao.StudentDao;
import com.yan.spring02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @date 2020/6/26 9:24
 */
@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    StudentDao studentDao;
    
}
