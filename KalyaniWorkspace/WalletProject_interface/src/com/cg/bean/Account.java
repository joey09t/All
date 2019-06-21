package com.cg.bean;

public abstract class Account {
private int aid;
private int mobile;
private String accountHolder;
private double balance;
public Account()
{
}

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
public String getAccountHolder() {
	return accountHolder;
}
public void setAccountHolder(String accountHolder) {
	this.accountHolder = accountHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Account(int aid, int mobile, String accountHolder, double balance) {
	super();
	this.aid = aid;
	this.mobile = mobile;
	this.accountHolder = accountHolder;
	this.balance = balance;
}

@Override
public String toString() {
	return "Account [aid=" + aid + ", mobile=" + mobile + ", accountHolder=" + accountHolder + ", balance=" + balance
			+ "]";
}

}
