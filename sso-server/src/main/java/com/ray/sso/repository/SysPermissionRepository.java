package com.ray.sso.repository;

import com.ray.sso.model.SysPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/8/7 17:12
 */
public interface SysPermissionRepository extends JpaSpecificationExecutor<SysPermission>, JpaRepository<SysPermission, Integer> {
    @Query(value = "SELECT * FROM sys_permission WHERE id IN (:ids)", nativeQuery = true)
    List<SysPermission> findByIds(@Param("ids") List<Integer> ids);
}
