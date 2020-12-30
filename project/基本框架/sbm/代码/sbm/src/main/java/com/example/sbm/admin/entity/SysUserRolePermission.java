package com.example.sbm.admin.entity;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * sys_user_role_permission
 */
@Table(name = "sys_user_role_permission")
public class SysUserRolePermission extends BaseEntity {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * 
     */
    @Column(name = "title")
    private String title;

    /**
     * 
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 
     */
    @Column(name = "permission_id")
    private Integer permissionId;

    /**
     * 
     */
    @Column(name = "enable")
    private Integer enable;

    /**
     * 
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 
     */
    @Column(name = "update_tme")
    private Date updateTme;

    /**
     * 
     */
    @Column(name = "createer")
    private String createer;

    /**
     * 
     */
    @Column(name = "updateer")
    private String updateer;


    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private SysRole sysRole;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private  SysPermission sysPermission;


    @Column(name="type")
    private Integer type;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    public SysPermission getSysPermission() {
        return sysPermission;
    }

    public void setSysPermission(SysPermission sysPermission) {
        this.sysPermission = sysPermission;
    }

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return title 
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return role_id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 
     * @param roleId 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 
     * @return permission_id 
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * 
     * @param permissionId 
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 
     * @return enable 
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * 
     * @param enable 
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return update_tme 
     */
    public Date getUpdateTme() {
        return updateTme;
    }

    /**
     * 
     * @param updateTme 
     */
    public void setUpdateTme(Date updateTme) {
        this.updateTme = updateTme;
    }

    /**
     * 
     * @return createer 
     */
    public String getCreateer() {
        return createer;
    }

    /**
     * 
     * @param createer 
     */
    public void setCreateer(String createer) {
        this.createer = createer == null ? null : createer.trim();
    }

    /**
     * 
     * @return updateer 
     */
    public String getUpdateer() {
        return updateer;
    }

    /**
     * 
     * @param updateer 
     */
    public void setUpdateer(String updateer) {
        this.updateer = updateer == null ? null : updateer.trim();
    }
}