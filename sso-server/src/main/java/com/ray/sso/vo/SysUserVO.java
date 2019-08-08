package com.ray.sso.vo;

import com.ray.sso.model.SysUser;
import lombok.Data;

import java.util.List;

/**
 * @author Ray.Ma
 * @date 2019/8/7 17:24
 */
@Data
public class SysUserVO extends SysUser {
    private List<String> authorityList;
}
