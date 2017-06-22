package com.csw.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by csw on 2017/6/22.
 * Description:
 */
@Entity
@Table(name = "auth_function", schema = "", catalog = "csw")
public class AuthFunctionEntity extends BaseEntity {

    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "full_name")
    private String fullName;
    private String icon;
    private String url;
    private String target;
    @Column(name = "is_menu")
    private boolean isMenu; //是否为导航菜单
    @Column(name = "delete_mark")
    private boolean deleteMark = false;
    @Column(name = "modify_date")
    private Date modifyDate;
    @Column(name = "modify_user_id")
    private Long modifyUserId;
    @Column(name = "modify_username")
    private String modifyUsername;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean isMenu() {
        return isMenu;
    }

    public void setMenu(boolean menu) {
        isMenu = menu;
    }

    public boolean isDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(boolean deleteMark) {
        this.deleteMark = deleteMark;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getModifyUsername() {
        return modifyUsername;
    }

    public void setModifyUsername(String modifyUsername) {
        this.modifyUsername = modifyUsername;
    }
}
