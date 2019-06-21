package com.cg.service;
import com.cg.bean.*;
public class AccountService implements GST,Transaction {
	public double withdraw(Account ob,double amount) {
		double new_balance=ob.getBalance()-amount;
		if(new_balance<1000.00)
		{
			new_balance=ob.getBalance();
			System.out.println("Insufficient");
			
		}
		return new_balance;
	}
	public double deposit(Account ob,double amount)
	{
		return 0;
		
	}
	public double calculateTax(double PCT,double amount)
	{
		return amount*GST.PCT_5;
	}

}
