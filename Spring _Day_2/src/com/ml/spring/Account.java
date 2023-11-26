package com.ml.spring;

import java.util.Date;
import java.util.Map;

public class Account {

    private long acNo;
    private String acType;
    private double balance;
    private Map<Date, Double> deposits;
    private Map<Date, Double> withdrawls;

    public Account() {
    }

    protected Account(long acNo, String acType, double balance, Map<Date, Double> deposits,
	    Map<Date, Double> withdrawls) {
	this.acNo = acNo;
	this.acType = acType;
	this.balance = balance;
	this.deposits = deposits;
	this.withdrawls = withdrawls;
    }

    public long getAcNo() {
	return acNo;
    }

    public void setAcNo(long acNo) {
	this.acNo = acNo;
    }

    public String getAcType() {
	return acType;
    }

    public void setAcType(String acType) {
	this.acType = acType;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }

    public Map<Date, Double> getDeposits() {
	return deposits;
    }

    public void setDeposits(Map<Date, Double> deposits) {
	this.deposits = deposits;
    }

    public Map<Date, Double> getWithdrawls() {
	return withdrawls;
    }

    public void setWithdrawls(Map<Date, Double> withdrawls) {
	this.withdrawls = withdrawls;
    }

    @Override
    public String toString() {
	return "Account [acNo=" + acNo + ", acType=" + acType + ", balance=" + balance + ", deposits=" + deposits
		+ ", withdrawls=" + withdrawls + "]";
    }

}
