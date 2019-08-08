package com.ray.sso.repository;

import com.ray.sso.model.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/8/7 17:13
 */
public interface SysUserRoleRepository extends JpaSpecificationExecutor<SysUserRole>, JpaRepository<SysUserRole, Integer> {
    List<SysUserRole> findByUserId(Integer userId);
}
