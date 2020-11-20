package com.gloryh.repository;

import com.gloryh.entity.User;

import java.util.List;

/**
 * 用户接口类
 *
 * @author 黄光辉
 * @since 2020/9/29
 **/
public interface UserRepository {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
