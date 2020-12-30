package com.example.sbm.admin.entity;

import com.example.sbm.admin.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * sys_role
 */
@Table(name = "sys_role")
public class SysRole extends BaseEntity {
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
    @Column(name = "enable")
    private Integer enable;

    /**
     * 
     */
    @Column(name = "sort")
    private String sort;



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
     * @return sort 
     */
    public String getSort() {
        return sort;
    }

    /**
     * 
     * @param sort 
     */
    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }


}