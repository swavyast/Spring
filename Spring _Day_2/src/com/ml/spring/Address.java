package com.ml.spring;

public class Address {

    private String street;
    private String locality;
    private String city;
    private String state;
    private String country;
    private int pincode;

    public Address() {
    }

    protected Address(String street, String locality, String city, String state, String country, int pincode) {
	this.street = street;
	this.locality = locality;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
    }

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getLocality() {
	return locality;
    }

    public void setLocality(String locality) {
	this.locality = locality;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    public int getPincode() {
	return pincode;
    }

    public void setPincode(int pincode) {
	this.pincode = pincode;
    }

    @Override
    public String toString() {
	return "Address [street=" + street + ", locality=" + locality + ", city=" + city + ", state=" + state
		+ ", country=" + country + ", pincode=" + pincode + "]";
    }

}
