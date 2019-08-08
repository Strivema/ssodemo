package com.ray.sso.repository;

import com.ray.sso.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Ray.Ma
 * @date 2019/8/7 16:06
 */
public interface SysUserRepository extends JpaSpecificationExecutor<SysUser>, JpaRepository<SysUser,Integer> {
    SysUser findByUsername(String username);
}
