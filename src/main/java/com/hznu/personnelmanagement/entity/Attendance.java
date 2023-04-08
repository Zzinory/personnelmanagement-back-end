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
public class Attendance implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Attendance(Integer id) {
//        this.id = id;
//    }

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer attendanceId;

    private String attendanceTime;

    private String exitTime;

    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }
    public String getAttendanceTime() {
        return attendanceTime;
    }

    public void setAttendanceTime(String attendanceTime) {
        this.attendanceTime = attendanceTime;
    }
    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Attendance{" +
            "userId=" + userId +
            ", attendanceId=" + attendanceId +
            ", attendanceTime=" + attendanceTime +
            ", exitTime=" + exitTime +
            ", userName=" + userName +
        "}";
    }
}
