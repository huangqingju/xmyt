package com.example.sbm.admin.config.shiro;

import com.example.sbm.admin.entity.SysUser;
import com.example.sbm.admin.entity.SysUserRolePermission;
import com.example.sbm.admin.service.sysManager.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 角色权限和对应权限添加
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser sysUser = new SysUser();

        Object obj = SecurityUtils.getSubject().getPrincipal();
        BeanUtils.copyProperties(obj,sysUser);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<SysUserRolePermission> list =  sysUser.getSysUserRolePermission();

        for(SysUserRolePermission sysUserRolePermission :list){
            info.addRole(String.valueOf(sysUserRolePermission.getRoleId()));
            info.addStringPermission(String.valueOf(sysUserRolePermission.getPermissionId()));
        }
        return info;
    }

    /**
     * 身份认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        String name = usernamePasswordToken.getUsername();
        String password = new String(usernamePasswordToken.getPassword());
        SysUser sysUser = new SysUser();
        sysUser.setUsername(name);
        sysUser.setPassword(password);
        sysUser.setEnable(1);
        sysUser.setStatus(1);
        sysUser = sysUserService.querySysUserBySysUser(sysUser);
        if(ObjectUtils.isEmpty(sysUser)){
            throw  new AuthenticationException("用户和密码不匹配");
        }

        return new SimpleAuthenticationInfo(sysUser, password, getName());

    }
}
