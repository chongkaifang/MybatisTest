package com.keafmd.test;

import com.keafmd.dao.IRoleDao;
import com.keafmd.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Keafmd
 *
 * @ClassName: MybatisTest
 * @Description: 测试类，测试crud操作
 * @author: 牛哄哄的柯南
 * @date: 2021-02-08 15:24
 */
public class RoleTest {

    private InputStream in;
    private SqlSession sqlsession;
    private IRoleDao roleDao;

    @Before // 用于在测试方法执行前执行
    public void init() throws Exception {
        //1.读取配置文件,生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        sqlsession = factory.openSession(); //里面写个true，下面每次就不用了写 sqlsession.commit(); 了
        //4.使用SqlSession创建Dao接口的代理对象
        roleDao = sqlsession.getMapper(IRoleDao.class);
    }

    @After // 用于在测试方法执行后执行
    public void destory() throws Exception {
        //提交事务
        sqlsession.commit();
        //6.释放资源
        sqlsession.close();
        in.close();
    }


    /**
     * 查询所有
     *
     * @throws Exception
     */
    @Test
    public void testFindAll() {
        List<Role> roles = roleDao.findAll();
        for (Role role : roles) {
            System.out.println("--------每个角色的信息---------");
            System.out.println(role);
            System.out.println(role.getUsers());

        }
    }

    @Test
    public void testFindAll_1() {
        List<Role> roles = roleDao.findAll_1();
        for (Role role : roles) {
            System.out.println("--------每个角色的信息---------");
            System.out.println(role);
            System.out.println(role.getUsers());

        }
    }

}