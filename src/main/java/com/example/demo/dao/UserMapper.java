package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : xujunbao
 * @ClassName com.example.demo.dao
 * @description
 * @Create Date : 2018/8/6
 */
@Repository
public interface UserMapper {
    /**
     * 方式一
     *
    @Select("SELECT * FROM tb_user")
    List<User> selectUserByName(String name);
     */
    List<User> selectUserByName();
}
