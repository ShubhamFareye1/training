package com.fareye.training.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class ToDo {

    private LocalDate dueDate;

    private LocalDate createdAt;

    private Date modifiedAt;

    private String body;

    private String title;

    private String status;

    private User user;

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        LocalDateTime now = LocalDateTime.now();
        this.dueDate = dueDate;
    }


    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        LocalDate now = LocalDate.now();
        this.createdAt = now;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
