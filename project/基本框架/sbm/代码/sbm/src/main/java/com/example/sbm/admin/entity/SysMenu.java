package com.example.sbm.admin.entity;



import javax.persistence.*;
import java.util.List;

/**
 * sys_menu
 */


@Table(name = "sys_menu")
public class SysMenu {
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
    @Column(name = "menu_name")
    private String menuName;

    /**
     * app 模块使用的
     */
    @Column(name = "app_href")
    private String appHref;

    /**
     * 资源类别类型 admin 和 app 模块 都用使用
     */
    @Column(name = "res_code")
    private Integer resCode;

    /**
     * admin 模块系统需要的
     */
    @Column(name = "admin_data_id")
    private Integer adminDataId;

    /**
     * admin 模块系统需要的
     */
    @Column(name = "admin_data_text")
    private String adminDataText;

    /**
     * admin 模块系统需要的
     */
    @Column(name = "admin_data_url")
    private String adminDataUrl;

    /**
     * 
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 排序值
     */
    @Column(name = "sorted")
    private Integer sorted;

    /**
     * 1 显示  0 不显示
     */
    @Column(name = "display")
    private Integer display;

    /**
     * 1 有效  0无效
     */
    @Column(name="enable")
    private Integer enable;

    /**
     * 1 系统固定菜单   2 业务菜单   0  菜单父节点
     */

    @Column(name="type")
    private Integer type;



    @Transient
    private List<SysMenu> childMenu;


    public List<SysMenu> getChildMenu() {
        return childMenu;
    }

    public void setChildMenu(List<SysMenu> childMenu) {
        this.childMenu = childMenu;
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
     * @return menu_name 
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 
     * @param menuName 
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 
     * @return app_href app 模块使用的
     */
    public String getAppHref() {
        return appHref;
    }

    /**
     * 
     * @param appHref app 模块使用的
     */
    public void setAppHref(String appHref) {
        this.appHref = appHref == null ? null : appHref.trim();
    }

    /**
     * 
     * @return res_code 资源类别类型 admin 和 app 模块 都用使用
     */
    public Integer getResCode() {
        return resCode;
    }

    /**
     * 
     * @param resCode 资源类别类型 admin 和 app 模块 都用使用
     */
    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    /**
     * 
     * @return admin_data_id admin 模块系统需要的
     */
    public Integer getAdminDataId() {
        return adminDataId;
    }

    /**
     * 
     * @param adminDataId admin 模块系统需要的
     */
    public void setAdminDataId(Integer adminDataId) {
        this.adminDataId = adminDataId;
    }

    /**
     * 
     * @return admin_data_text admin 模块系统需要的
     */
    public String getAdminDataText() {
        return adminDataText;
    }

    /**
     * 
     * @param adminDataText admin 模块系统需要的
     */
    public void setAdminDataText(String adminDataText) {
        this.adminDataText = adminDataText == null ? null : adminDataText.trim();
    }

    /**
     * 
     * @return admin_data_url admin 模块系统需要的
     */
    public String getAdminDataUrl() {
        return adminDataUrl;
    }

    /**
     * 
     * @param adminDataUrl admin 模块系统需要的
     */
    public void setAdminDataUrl(String adminDataUrl) {
        this.adminDataUrl = adminDataUrl == null ? null : adminDataUrl.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return sorted 排序值
     */
    public Integer getSorted() {
        return sorted;
    }

    /**
     * 
     * @param sorted 排序值
     */
    public void setSorted(Integer sorted) {
        this.sorted = sorted;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}