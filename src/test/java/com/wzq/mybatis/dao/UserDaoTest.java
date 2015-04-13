package com.wzq.mybatis.dao;

import com.wzq.mybatis.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * @author: wangzhenqing
 * @data: 2015年04月13日16:11:58
 * @Description:UserDao测试
 */
public class UserDaoTest {

    private Log log = LogFactory.getLog(this.getClass());

    private SqlSessionFactory sqlSessionFactory;

    private Reader reader;

    private SqlSession session;

    private UserDao userDao;

    @Before
    public void init() throws Exception {
        reader = Resources.getResourceAsReader("Configuration.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        session = sqlSessionFactory.openSession();
        userDao = session.getMapper(UserDao.class);
    }

    @After
    public void close() throws Exception{
        if (session != null){
            session.close();
        }
        if (reader != null){
            reader.close();
        }
    }

    @Test
    public void testGetUserByName() throws Exception {
        log.info("testGetUserByName");
        printUserInfo();
        log.info("testGetUserByName");

    }

    @Test
    public void testModifyUser() throws Exception {
        log.info("testModifyUser");
        boolean result = userDao.modifyUser("zhenqing.wang", "abc");
        session.commit();
        printUserInfo();
        log.info("testModifyUser: " + result);

    }

    @Test
    public void testDeleteUser() throws Exception {
        log.info("testDeleteUser");
        boolean result = userDao.deleteUser("zhenqing.wang");
        session.commit();
        printUserInfo();
        log.info("testDeleteUser: " + result);

    }

    @Test
    public void testAddUser() throws Exception {
        log.info("testAddUser");
        User user = new User(2,"zhenqing.wang","123");
        boolean result = userDao.addUser(user);
        session.commit();
        printUserInfo();
        log.info("testAddUser: " + result);


    }

    @Test
    public void testGetAllUsers() throws Exception {
        log.info("testGetAllUsers");
        List<User> userList = userDao.getAllUsers();
        int size = userList.size();
        log.info("testGetAllUsers size:" + size);
        log.info("testGetAllUsers username="+(size != 0 ? userList.get(0).getUsername() : "null"));

    }

    private void printUserInfo(){
        User user = userDao.getUserByName("zhenqing.wang");
        if (user != null){
            log.info("username=" + user.getUsername() + ",password=" + user.getPassword());
        }else{
            log.error("user is null");
        }
    }
}