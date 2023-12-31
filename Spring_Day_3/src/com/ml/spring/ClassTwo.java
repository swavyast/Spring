package com.ml.spring;

public class ClassTwo {

    private long id;
    private String name;

    public ClassTwo() {
	System.out.println("Default constructor in ClassTwo");
    }

    public ClassTwo(long id, String name) {
	this.id = id;
	this.name = name;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "ClassTwo [id=" + id + ", name=" + name + "]";
    }

}
