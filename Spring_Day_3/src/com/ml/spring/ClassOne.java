package com.ml.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassOne {

    private long id;
    @Autowired
    private ClassTwo two;

    public ClassOne() {
	System.out.println("Default constructor in ClassOne");
    }

    public ClassOne(long id, ClassTwo two) {
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
	System.out.println("Getter method in class one for ClassTwo dependency");
	return two;
    }
    @Qualifier("two")
    public void setTwo(ClassTwo two) {
	System.out.println("Setter method in class one for ClassTwo dependency");
	this.two = two;
    }

    @Override
    public String toString() {
	return "ClassOne [id=" + id + "]";
    }

}
