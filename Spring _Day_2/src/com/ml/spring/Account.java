package com.ml.spring;

import java.time.LocalDateTime;
import java.util.Map;

public class Account {

    private long acNo;
    private String acType;
    private double balance;
    private Map<LocalDateTime, Double> deposits;
    private Map<LocalDateTime, Double> withdrawls;

    public Account() {
    }

    protected Account(long acNo, String acType, double balance, Map<LocalDateTime, Double> deposits,
	    Map<LocalDateTime, Double> withdrawls) {
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

    public Map<LocalDateTime, Double> getDeposits() {
	return deposits;
    }

    public void setDeposits(Map<LocalDateTime, Double> deposits) {
	this.deposits = deposits;
    }

    public Map<LocalDateTime, Double> getWithdrawls() {
	return withdrawls;
    }

    public void setWithdrawls(Map<LocalDateTime, Double> withdrawls) {
	this.withdrawls = withdrawls;
    }

    @Override
    public String toString() {
	return "Account [acNo=" + acNo + ", acType=" + acType + ", balance=" + balance + ", deposits=" + deposits
		+ ", withdrawls=" + withdrawls + "]";
    }

}
