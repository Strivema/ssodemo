package com.ray.sso.service.impl;

import com.ray.sso.model.SysUser;
import com.ray.sso.repository.SysUserRepository;
import com.ray.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ray.Ma
 * @date 2019/8/7 16:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public SysUser getByUsername(String username) {
        return sysUserRepository.findByUsername(username);
    }
}
