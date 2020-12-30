package com.example.sbm.admin.entity;

import com.example.sbm.admin.base.BaseEntity;
import com.example.sbm.admin.common.util.SpringApplicationUtil;
import com.example.sbm.admin.service.sysManager.SysUserRolePermissionService;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * sys_user
 */

@Table(name = "sys_user")
@Entity
public class SysUser extends BaseEntity {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 状态 1有效 0 无效
     */
    @Column(name = "status")
    private Integer status;

    @Column(name ="enable")
    private  Integer enable;


    /**
     * 
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;


    @Transient
    private List<SysUserRolePermission> sysUserRolePermission;











    public List<SysUserRolePermission> getSysUserRolePermission() {
        SysUserRolePermissionService sysUserRolePermissionService = SpringApplicationUtil.getBean(SysUserRolePermissionService.class);
        this.sysUserRolePermission = sysUserRolePermissionService.queryListByUserId(this.getId());
        return sysUserRolePermission;

    }

    public void setSysUserRolePermission(List<SysUserRolePermission> sysUserRolePermission) {
        this.sysUserRolePermission = sysUserRolePermission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 
     * @return login_ip 
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 
     * @param loginIp 
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 
     * @return login_time 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}