package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author : xujunbao
 * @ClassName com.example.demo.entity
 * @description
 * @Create Date : 2018/8/6
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable{


    private Long id;
    private String username;
    private Long age;
}
