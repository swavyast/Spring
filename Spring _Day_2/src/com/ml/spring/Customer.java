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
    private Properties props;
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

    public Customer(long cid, String cname, long cphone, String cemail, List<String> emails, Set<Long> phones, Properties props,
	    Map<String, Integer> refs, Address address, List<Account> accounts) {
	this.cid = cid;
	this.cname = cname;
	this.cphone = cphone;
	this.cemail = cemail;
	//Special Types
	this.emails = emails;
	this.phones = phones;
	this.props = props;
	this.refs = refs;
	this.address = address;
	this.accounts = accounts;
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

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
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
		+ emails + ", phones=" + phones + ", refs=" + refs + ", address=" + address + ", accounts=" + accounts
		+ "]";
    }

}
