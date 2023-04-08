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


public class Overtime implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)

    private Integer id;
    private Integer userId;
    private Integer censorId;

    private String overtime_time;
    private String overtime_reason;
    private String censor_name;
    private String censor_state;
    private String overtime_subsidy;
    private String user_id;
    private String censor_id;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCensorId() {
        return censorId;
    }

    public void setCensorId(Integer censorId) {
        this.censorId = censorId;
    }

    public String getOvertime_time() {
        return overtime_time;
    }

    public void setOvertime_time(String overtime_time) {
        this.overtime_time = overtime_time;
    }

    public String getOvertime_reason() {
        return overtime_reason;
    }

    public void setOvertime_reason(String overtime_reason) {
        this.overtime_reason = overtime_reason;
    }

    public String getCensor_name() {
        return censor_name;
    }

    public void setCensor_name(String censor_name) {
        this.censor_name = censor_name;
    }

    public String getCensor_state() {
        return censor_state;
    }

    public void setCensor_state(String censor_state) {
        this.censor_state = censor_state;
    }

    public String getOvertime_subsidy() {
        return overtime_subsidy;
    }

    public void setOvertime_subsidy(String overtime_subsidy) {
        this.overtime_subsidy = overtime_subsidy;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCensor_id() {
        return censor_id;
    }

    public void setCensor_id(String censor_id) {
        this.censor_id = censor_id;
    }

    @Override
    public String toString() {
        return "salary";
    }
}
