package com.ray.sso.service;

import com.ray.sso.model.SysPermission;

import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/8/7 17:07
 */
public interface PermissionService {
    List<SysPermission> findByUserId(Integer userId);
}
