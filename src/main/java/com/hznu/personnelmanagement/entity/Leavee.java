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
public class Leavee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)

    private Integer id;

    private Integer leaveId;

    private String leaveState;

    private String applicantName;

    private String censorName;

    private Integer censorId;
    public Integer userId;

    private String startTime;

    private String endTime;
    private String leaveReason;

    public String getLeaveReason() {
        return leaveReason;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public String getLeaveState() {
        return leaveState;
    }

    public void setLeaveState(String leaveState) {
        this.leaveState = leaveState;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getCensorName() {
        return censorName;
    }

    public void setCensorName(String censorName) {
        this.censorName = censorName;
    }

    public Integer getCensorId() {
        return censorId;
    }

    public void setCensorId(Integer censorId) {
        this.censorId = censorId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Leave{" +
            ", leaveId=" + leaveId +
            ", leaveState=" + leaveState +
            ", applicantName=" + applicantName +
            ", censorId=" + censorId +
                ", censorName=" + censorName +
            ", startTime=" + startTime +
            ", endTime=" + endTime +
                ", leaveReason=" + endTime +
        "}";
    }
}
