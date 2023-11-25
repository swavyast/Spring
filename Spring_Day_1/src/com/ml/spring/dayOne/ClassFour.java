package com.ml.spring.dayOne;

public class ClassFour {

    private long id;
    private String msg;
    private int value;

    public ClassFour(long id, String msg, int value) {
	this.id = id;
	this.msg = msg;
	this.value = value;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public int getValue() {
	return value;
    }

    public void setValue(int value) {
	this.value = value;
    }

    @Override
    public String toString() {
	return "ClassFour [id=" + id + ", msg=" + msg + ", value=" + value + "]";
    }

}
