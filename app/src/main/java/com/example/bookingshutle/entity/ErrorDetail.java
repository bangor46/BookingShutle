package com.example.bookingshutle.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "ERROR_DETAIL")
public class ErrorDetail implements Serializable {
    @ColumnInfo(name = "ID")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "STATUS")
    private int status;

    @ColumnInfo(name = "MESSAGE")
    private String message;

    @ColumnInfo(name = "DETAIL_MESSAGE")
    private Object detailMessage;

    @ColumnInfo(name = "EXECUTION_TIME")
    private int executionTime;

    @ColumnInfo(name = "DETAIL_INFO")
    private Object detailInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(Object detailMessage) {
        this.detailMessage = detailMessage;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    public Object getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(Object detailInfo) {
        this.detailInfo = detailInfo;
    }

    @Override
    public String toString() {
        return "ErrorDetail{" +
                "id=" + id +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", detailMessage=" + detailMessage +
                ", executionTime=" + executionTime +
                ", detailInfo=" + detailInfo +
                '}';
    }
}
