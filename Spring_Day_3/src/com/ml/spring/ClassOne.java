package com.ml.spring;

public class ClassOne {

    private long id;
    private ClassTwo two;

    public ClassOne() {
	System.out.println("Default constructor in ClassOne");
    }

    protected ClassOne(long id, ClassTwo two) {
	this.id = id;
	this.two = two;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public ClassTwo getTwo() {
	return two;
    }

    public void setTwo(ClassTwo two) {
	this.two = two;
    }

    @Override
    public String toString() {
	return "ClassOne [id=" + id + "]";
    }

}
