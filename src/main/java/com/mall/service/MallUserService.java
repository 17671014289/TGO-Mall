package com.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.entity.MallRole;
import com.mall.entity.MallUser;

import java.util.List;
import java.util.Map;


/**
 * (MallUser)表服务接口
 *
 * @author makejava
 * @since 2023-02-17 16:07:37
 */
// @Service
public interface MallUserService extends IService<MallUser> {

    /**
     * 登录
     *
     * @param username 用户名
     * @return {@link MallUser}
     */
    MallUser login(String username);

    /**
     * 通过用户名查询角色
     *
     * @param mallUsername 商城用户名
     * @return {@link List}<{@link MallRole}>
     */
    List<MallRole> getRolesByUserName(String mallUsername);


    /**
     * 查询用户名字
     *
     * @param mallNickName 用户名
     * @return {@link MallUser}
     */
    boolean queryUserByName(String mallNickName);

    Boolean register(MallUser mallUser);

    /**
     * 查询所有商城用户
     *
     * @param role     角色
     * @param pageNum  页面num
     * @param pageSize 页面大小
     * @param field    场
     * @return {@link Map}<{@link String}, {@link Object}>
     */
    Map<String, Object> queryAllMallUser(String role, Integer pageNum, Integer pageSize, String field);
    Integer updateUserRole(Integer userId, List<Integer> list, Integer start);
}
