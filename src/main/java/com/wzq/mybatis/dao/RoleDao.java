package com.wzq.mybatis.dao;

import com.wzq.mybatis.model.Role;
import com.wzq.mybatis.model.User;

import java.util.List;

/**
 * @author: wangzhenqing
 * @data: 15/4/16 下午4:34
 * @Description:
 */
public interface RoleDao {

    public boolean deleteRole(String rolename);

    public boolean addRole(Role role);

    public Role getRoleByName(String rolename);

    public List<Role> getAllRoles();

    public List<Role> getRoleList(int id);
}
