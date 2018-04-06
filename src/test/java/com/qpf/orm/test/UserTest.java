package com.qpf.orm.test;

import com.qpf.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import qpf.com.orm.UserMapper;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserTest {

    private static String resource = "conf.xml";
    private SqlSession session;
    private Logger logger;

    @Before
    public void setUp() throws IOException {
        logger = Logger.getLogger(getClass());
        logger.info("Before");
        //加载MyBatis配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //构建SqlSession工厂logger.info("commit");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //创建执行sql的session
        session = factory.openSession();
    }
    @After
    public void tearDown(){
        logger.info("After");
        //关闭session
        session.close();
    }
    @Test
    public void selectAllUser_(){
        List<User> users = session.selectList("com.qpf.orm.UserMapper_" + ".selectAllUser_");
        for (User user : users){
            logger.info(user);
        }
    }

    @Test
    public void selectAllUser(){
        //获取mapper
        UserMapper mapper = session.getMapper(UserMapper.class);
        //执行mapper函数
        List<User> users = mapper.selectAllUser();
        for(User user : users){
            logger.info(user);
        }
        User user = mapper.selectUserById(1);
        logger.info(user);
        user = mapper.selectUserById(1);
        logger.info(user);

    }

    @Test
    public void updateUser(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        int update = mapper.updateUser(new User(1, "qpf", 17, 1));
        if(update > 0){
            session.commit();
            logger.info("commit");
        }else{
            logger.warn("Failed to update");
        }
    }

    @Test
    public void deleteUser(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        int delete = mapper.deleteUser(new User(3));
        if(delete > 0){
            session.commit();
            logger.info("commit");
        }else{
            logger.warn("Failed to delete");
        }
    }
    @Test
    public void insertUser(){
        UserMapper mapper = session.getMapper(UserMapper.class);
        int insert = mapper.insertUser(new User("cy", 16, 0));
        if(insert > 0){
            session.commit();
            logger.info("commit");
        }else{
            logger.warn("Failed to insert");
        }
    }
}