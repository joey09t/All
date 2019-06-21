package com.cg.bean;

public class Account implements Comparable<Account> {
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

@Override
public int compareTo(Account arg0) {
	// default sorting based on account number
	int diff=this.getAid()-arg0.getAid();
	if(diff>0)
	{
		return 1;
	}
	else if(diff<0)
	{
		return -1;
	}
	else
		return 0;

}

}
