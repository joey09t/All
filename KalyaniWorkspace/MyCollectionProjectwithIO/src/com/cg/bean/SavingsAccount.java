package com.cg.bean;

public class SavingsAccount extends Account {

	private double interest;
	private double MIN_BALANCE;
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(int aid, int mobile, String accountHolder, double balance) {
		super(aid, mobile, accountHolder, balance);
		// TODO Auto-generated constructor stub
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest=super.getBalance()*0.04;
	}
	@Override
	public String toString() {
		return "SavingsAccount [interest=" + interest + "]";
	}
	
	
}
