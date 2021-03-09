package com.job.board.jobs.model.pojo;

import lombok.Data;

@Data
public class Login {
    private Integer id;

    private String username;

    private String password;

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}