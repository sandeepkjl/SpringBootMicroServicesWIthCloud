package com.example.payment.model;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
    private int id;
    private String msg;
    private String desc;
    private HttpStatus status;

    public ExceptionResponse() {
    }

    public ExceptionResponse(int id, String msg, String desc, HttpStatus status) {
        this.id = id;
        this.msg = msg;
        this.desc = desc;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", desc='" + desc + '\'' +
                ", status=" + status +
                '}';
    }
}
