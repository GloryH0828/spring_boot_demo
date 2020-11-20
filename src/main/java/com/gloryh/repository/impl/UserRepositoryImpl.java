package com.gloryh.repository.impl;

import com.gloryh.entity.User;
import com.gloryh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户接口实现类
 *
 * @author 黄光辉
 * @since 2020/9/29
 **/
@Repository
public class UserRepositoryImpl implements UserRepository {
    /* JdbcTemplate 注入即可实现连接数据库*/
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM user",new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User findById(long id) {
        //return jdbcTemplate.queryForObject("SELECT * FROM user WHERE id ="+id,User.class);
        return jdbcTemplate.queryForObject("SELECT * FROM user WHERE id = ?",new Object[]{id},User.class);
    }

    @Override
    public void save(User user) {
        jdbcTemplate.update("INSERT INTO user(username ,password,age) VALUES(?,?,?)",user.getUsername(),user.getPassword(),user.getAge());
    }

    @Override
    public void update(User user) {
        jdbcTemplate.update("UPDATE user SET username = ? ,password = ? , age = ? WHERE id = ?",user.getUsername(),user.getPassword(),user.getAge(),user.getId());
    }

    @Override
    public void deleteById(long id) {
        jdbcTemplate.update("DELETE  FROM user WHERE id = ?",id);
    }
}
