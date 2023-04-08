package com.hznu.personnelmanagement.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zzinory
 * @since 2023-02-18
 */
public class File implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    private static final long serialVersionUID = 1L;

    private Integer fileId;

    private String filePath;

    private String fileName;

    private LocalDateTime fileUploadTime;

    private Integer fileUploadUserId;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public LocalDateTime getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(LocalDateTime fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }
    public Integer getFileUploadUserId() {
        return fileUploadUserId;
    }

    public void setFileUploadUserId(Integer fileUploadUserId) {
        this.fileUploadUserId = fileUploadUserId;
    }

    @Override
    public String toString() {
        return "File{" +
            "fileId=" + fileId +
            ", filePath=" + filePath +
            ", fileName=" + fileName +
            ", fileUploadTime=" + fileUploadTime +
            ", fileUploadUserId=" + fileUploadUserId +
        "}";
    }
}
