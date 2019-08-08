package com.ray.sso.service;

import com.ray.sso.model.SysUser;

/**
 * @author Ray.Ma
 * @date 2019/8/7 16:02
 */
public interface UserService {
    SysUser getByUsername(String username);

}
