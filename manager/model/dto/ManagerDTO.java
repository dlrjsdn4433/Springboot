package com.toiletissue.manager.model.dto;

public class ManagerDTO {

    public String id;
    public String pwd;
    public String role;

    public ManagerDTO(){}

    public ManagerDTO(String id, String pwd, String role) {
        this.id = id;
        this.pwd = pwd;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ManagerDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
