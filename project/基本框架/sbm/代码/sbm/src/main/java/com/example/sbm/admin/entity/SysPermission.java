package com.example.sbm.admin.entity;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * sys_permission
 */
@Table(name = "sys_permission")
public class SysPermission extends BaseEntity {
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
    @Column(name = "sort")
    private Integer sort;

    /**
     * 
     */
    @Column(name = "enable")
    private Integer enable;



    @Column(name="type")
    private Integer type;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
     * @return sort 
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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


}