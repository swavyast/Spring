package com.ml.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Customer {
    
    private long cid;
    private String name;
    private List<Long> phone;
    private Set<String> email;
    private Map<String, Integer> experiance;
    private Address address;
    private Set<Account> accounts;

}
