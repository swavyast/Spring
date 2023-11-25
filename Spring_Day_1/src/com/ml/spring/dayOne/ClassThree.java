package com.ml.spring.dayOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

//@Bean		The annotation @Bean is disallowed for this location
//@Scope("singleton")
public class ClassThree {
    
    private long id;
    private String name;
    private int value;
    private String msg;
    
    public ClassThree() {
	System.out.println("Default Constructor of ClassThree with public visibility");
    }
    
    public ClassThree(String msg) {
	
	System.out.println("One parameterised Constructor of ClassThree with public visibility");
	this.msg=msg;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
	return "ClassThree [id=" + id + ", name=" + name + ", value=" + value + ", msg=" + msg + "]";
    }

}
