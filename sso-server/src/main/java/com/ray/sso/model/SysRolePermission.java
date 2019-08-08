package com.ray.sso.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ray.Ma
 * @date 2019/8/7 16:09
 */
@Data
@Entity
@Table(schema = "permission", name = "sys_role_permission")
public class SysRolePermission implements Serializable {
    private static final long serialVersionUID = 7402412601579098788L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permission_id")
    private Integer permissionId;
}
