package com.example.sbm.admin.base;


import javax.persistence.Column;
import java.util.Date;

public class BaseEntity {

    /**
     * 创建时间，不予许更新
     */
    @Column(updatable = false ,name = "create_time")
    private Date createTime;

    /**
     *
     */
    @Column(name = "update_tme")
    private Date updateTme;

    /**
     * 创建人,不予许更新
     */
    @Column(updatable =  false, name = "createer")
    private String createer;

    /**
     * 更新人
     */
    @Column(name = "updateer")
    private String updateer;
















    /**
     *
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @param createTime 创建时间
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
     * @return createer 创建人
     */
    public String getCreateer() {
        return createer;
    }

    /**
     *
     * @param createer 创建人
     */
    public void setCreateer(String createer) {
        this.createer = createer == null ? null : createer.trim();
    }

    /**
     *
     * @return updateer 更新人
     */
    public String getUpdateer() {
        return updateer;
    }

    /**
     *
     * @param updateer 更新人
     */
    public void setUpdateer(String updateer) {
        this.updateer = updateer == null ? null : updateer.trim();
    }

}
