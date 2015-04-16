package com.wzq.mybatis.model;

/**
 * @author: wangzhenqing
 * @data: 15/4/16 下午4:28
 * @Description:
 */
public class Role {
    private int id;
    private String rolename;
    private String alias;

    public Role(int id, String rolename, String alias) {
        this.id = id;
        this.rolename = rolename;
        this.alias = alias;
    }

    public Role() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
