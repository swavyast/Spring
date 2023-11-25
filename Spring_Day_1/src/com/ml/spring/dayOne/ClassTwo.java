package com.ml.spring.dayOne;

public class ClassTwo {
    
    private long id;
    private String name;
    private int value;
    
    public ClassTwo() {
	
	System.out.println("Constructor of ClassTwo with public visibility");
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
	return "ClassTwo [id=" + id + ", name=" + name + ", value=" + value + "]";
    }
    
}
