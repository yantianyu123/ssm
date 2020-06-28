package com.yan.spring03.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author
 * @date 2020/6/27 10:36
 */
@Data
public class User implements Serializable {
    
    private static final long serialVersionUID = 1484256744185442177L;
    
    private Integer id ;
    private String name;
    private Integer money;
    
}
