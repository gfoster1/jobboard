package com.job.board.jobs.model.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Job extends JobKey {
    private float salary;

    private Date dateposted;

    private String type;
    private String title;
    private String status;
    private String location;
    private String description;

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}