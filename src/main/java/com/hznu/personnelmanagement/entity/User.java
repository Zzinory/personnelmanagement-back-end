package com.hznu.personnelmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zzinory
 * @since 2023-02-18
 */


public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)

    private Integer id;

    private String userAccount;

    private String userName;

    private String password;

    private Integer role;

    private String position;

    private String entryDate;

    private String quitDate;
    private String birthday;
    private String imgUrl;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    private String hobby;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String  userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    public String getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(String quitDate) {
        this.quitDate = quitDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
            "userAccount=" + userAccount +
            ", userName=" + userName +
            ", password=" + password +
            ", role=" + role +
            ", position=" + position +
            ", entryDate=" + entryDate +
            ", quitDate=" + quitDate +
                ", birthday=" + birthday +
                ", hobby=" + hobby +
                ", imgUrl=" + imgUrl +
        "}";
    }
}
