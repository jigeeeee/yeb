package com.kinoki.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kinoki.server.pojo.Admin;
import com.kinoki.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhoubin
 * @since 2021-12-13
 */
public interface IAdminService extends IService<Admin> {

    //登录之后返回token
    RespBean login(String username, String password, HttpServletRequest request);

    //根据用户名获取用户
    Admin getAdminByUserName(String username);
}
