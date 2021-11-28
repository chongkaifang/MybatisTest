package com.keafmd.dao;

import com.keafmd.domain.User;

import java.util.List;

/**
 * Keafmd
 *
 * @ClassName: IUserDao
 * @Description: 用户的持久层接口
 * @author: 牛哄哄的柯南
 * @date: 2021-02-06 19:29
 */

public interface IUserDao {
    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     *
     * @return
     */
    List<User> findAll();

    List<User> findByRole(Integer rid);
}
