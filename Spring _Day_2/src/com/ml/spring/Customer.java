package com.ml.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private long cid;
    private String cname;
    private long cphone;
    private String cemail;
    private List<String> emails;
    private Set<Long> phones;
    private Properties myprops;
    private Map<String, Integer> refs;
    private Address address;
    private List<Account> accounts;

    public Customer() {
    }

    protected Customer(long cid, String cname, long cphone, String cemail) {
	this.cid = cid;
	this.cname = cname;
	this.cphone = cphone;
	this.cemail = cemail;
    }

    public long getCid() {
	return cid;
    }

    public void setCid(long cid) {
	this.cid = cid;
    }

    public String getCname() {
	return cname;
    }

    public void setCname(String cname) {
	this.cname = cname;
    }

    public long getCphone() {
	return cphone;
    }

    public void setCphone(long cphone) {
	this.cphone = cphone;
    }

    public String getCemail() {
	return cemail;
    }

    public void setCemail(String cemail) {
	this.cemail = cemail;
    }

    public List<String> getEmails() {
	return emails;
    }

    public void setEmails(List<String> emails) {
	this.emails = emails;
    }

    public Set<Long> getPhones() {
	return phones;
    }

    public void setPhones(Set<Long> phones) {
	this.phones = phones;
    }

    public Properties getMyprops() {
	return myprops;
    }

    public void setMyprops(Properties myprops) {
	this.myprops = myprops;
    }

    public void setProps(Properties myprops) {
	this.myprops = myprops;
    }

    public Map<String, Integer> getRefs() {
	return refs;
    }

    public void setRefs(Map<String, Integer> refs) {
	this.refs = refs;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    public List<Account> getAccounts() {
	return accounts;
    }

    public void setAccounts(List<Account> accounts) {
	this.accounts = accounts;
    }

    @Override
    public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphone=" + cphone + ", cemail=" + cemail + ", emails="
		+ emails + ", phones=" + phones + ", refs=" + refs + ", address=" + address
		+ ", accounts=" + accounts + "]";
    }

}
