package com.maxplus1.demo.config.shiro.rbac;


import java.util.List;

public interface IRoleService {

    /**
     * 用户已授权的角色
     * @param userId
     * @return
     */
    List<Role> getUserRoleList(Long userId);
}
