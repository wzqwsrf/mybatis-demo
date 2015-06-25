package com.wzq.mybatis.dao;

import com.wzq.mybatis.model.Role;

import java.util.List;

/**
 * @author: wangzhenqing
 * @data: 15/4/16 下午4:34
 * @Description:Roledao方法
 */
public interface RoleDao {

    boolean deleteRole(String rolename);

    boolean addRole(Role role);

    Role getRoleByName(String rolename);

    List<Role> getAllRoles();

    List<Role> getRoleList(int id);
}
