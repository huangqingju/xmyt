package com.example.sbm.admin.entity;

import com.example.sbm.admin.base.BaseEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

/**
 * db_category
 */
@Table(name = "db_category")
public class Category extends BaseEntity {
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
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 是否 显示 1 是，0否
     */
    @Column(name = "display")
    private Integer display;

    /**
     * 
     */
    @Column(name = "sort")
    private Integer sort;


    @Column(name="level")
    private Integer level;

    /**
     * 1 有效 0 无效
     */
    @Column(name = "enable")
    private Integer enable;

    @Transient
    private String parTitle;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return display 是否 显示 1 是，0否
     */
    public Integer getDisplay() {
        return display;
    }

    /**
     * 
     * @param display 是否 显示 1 是，0否
     */
    public void setDisplay(Integer display) {
        this.display = display;
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

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getParTitle() {
        return parTitle;
    }

    public void setParTitle(String parTitle) {
        this.parTitle = parTitle;
    }
}