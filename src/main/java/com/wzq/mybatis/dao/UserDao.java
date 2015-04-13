package com.wzq.mybatis.dao;

import com.wzq.mybatis.model.User;

import java.util.List;

/**
 * @author: wangzhenqing
 * @data:
 * @Description:
 */
public interface UserDao {

    public User getUserByName(String username);

    public boolean modifyUser(String username, String password);

    public boolean deleteUser(String username);

    public boolean addUser(User user);

    public List<User> getAllUsers();

}