package com.zry.timmer.entity;

import java.util.Date;

public class Task {
    private String ID;
    private String title;
    private Date startTime;
    private Date endTime;
    /**
     * 0：正序；1：反序
     */
    private Integer orderBy;
    private String imagePath;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Task() {
    }

    public Task(String ID, String title, Date startTime, Date endTime, Integer orderBy, String imagePath, Integer status) {
        this.ID = ID;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.orderBy = orderBy;
        this.imagePath = imagePath;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", orderBy=" + orderBy +
                ", imagePath='" + imagePath + '\'' +
                ", status=" + status +
                '}';
    }
}
