package com.xuxu.pojo;

/*****
 *  @author Monster Xu
 *  返回数据的 pojo
 *****/
public class Result {

    private Boolean falg;

    private String message;

    private Object date;

    public Result() {
    }

    public Result(Boolean falg, String message) {
        this.falg = falg;
        this.message = message;
    }

    public Result(Boolean falg, String message, Object date) {
        this.falg = falg;
        this.message = message;
        this.date = date;
    }

    public Boolean getFalg() {
        return falg;
    }

    public void setFalg(Boolean falg) {
        this.falg = falg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
}
