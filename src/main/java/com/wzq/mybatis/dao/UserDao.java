package com.wzq.mybatis.dao;

import com.wzq.mybatis.model.User;

import java.util.List;

/**
 * @author: wangzhenqing
 * @data: 2015-06-25 16:08:35
 * @Description:userdao方法
 */
public interface UserDao {

    User getUserByName(String username);

    boolean modifyUser(String username, String password);

    boolean deleteUser(String username);

    int addUser(User user);

    List<User> getAllUsers();

    List<User> getUserList(int id);
}
