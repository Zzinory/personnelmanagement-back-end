package com.hznu.personnelmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class Affair implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private static final long serialVersionUID = 1L;

    private Integer affairId;

    private String affairName;

    @TableField("affair_Drafter")
    private String affairDrafter;

    private Integer drafterId;

    private String affairContent;

    private Integer affairState;

    public Integer getAffairId() {
        return affairId;
    }

    public void setAffairId(Integer affairId) {
        this.affairId = affairId;
    }
    public String getAffairName() {
        return affairName;
    }

    public void setAffairName(String affairName) {
        this.affairName = affairName;
    }
    public String getAffairDrafter() {
        return affairDrafter;
    }

    public void setAffairDrafter(String affairDrafter) {
        this.affairDrafter = affairDrafter;
    }
    public Integer getDrafterId() {
        return drafterId;
    }

    public void setDrafterId(Integer drafterId) {
        this.drafterId = drafterId;
    }
    public String getAffairContent() {
        return affairContent;
    }

    public void setAffairContent(String affairContent) {
        this.affairContent = affairContent;
    }
    public Integer getAffairState() {
        return affairState;
    }

    public void setAffairState(Integer affairState) {
        this.affairState = affairState;
    }

    @Override
    public String toString() {
        return "Affair{" +
            "affairId=" + affairId +
            ", affairName=" + affairName +
            ", affairDrafter=" + affairDrafter +
            ", drafterId=" + drafterId +
            ", affairContent=" + affairContent +
            ", affairState=" + affairState +
        "}";
    }
}
