package com.keafmd.dao;

import com.keafmd.domain.Role;

import java.util.List;

/**
 * Keafmd
 *
 * @ClassName: IRoleDao
 * @Description:
 * @author: 牛哄哄的柯南
 * @date: 2021-02-12 19:01
 */

public interface IRoleDao {

    /**
     * 查询所有角色
     *
     * @return
     */
    List<Role> findAll();

    /**
     * @author chongkaifang
     * @desc 查询所有角色
     * @date 2021/11/28 19:49
     * @return List<Role>
     */
    List<Role> findAll_1();
}
