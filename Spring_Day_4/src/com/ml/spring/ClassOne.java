package com.ml.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClassOne {

    private long id;
    @Autowired(required = true)
    @Qualifier("someName")
    private ClassTwo two;

    public ClassOne() {
	System.out.println("Default constructor in ClassOne");
    }

    public long getId() {
	return id;
    }

    public ClassTwo getTwo() {
	System.out.println("Getter method in class one for ClassTwo dependency");
	return two;
    }

    @Override
    public String toString() {
	return "ClassOne [id=" + id + "]";
    }

}