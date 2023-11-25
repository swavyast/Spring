package com.ml.spring.dayOne;

/**
 * A simple java Class based on singleton design pattern.
 * */
public class ClassOne {
    
    private long id;
    private String name;
    private int value;
    private static final ClassOne classOne;
    
    private ClassOne() {
	System.out.println("Constructor of ClassOne with private visibility");
    }
    
    static {
	classOne=new ClassOne();
    }
    
    public static ClassOne getClassOne() {
	return classOne;
    }

    @Override
    public String toString() {
	return "ClassOne [id=" + id + ", name=" + name + ", value=" + value + "]";
    }

}
