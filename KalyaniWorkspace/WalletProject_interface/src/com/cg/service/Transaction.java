package com.cg.service;
import com.cg.bean.*;

public interface Transaction {

	public double withdraw(Account ob,double amount);
	public double deposit(Account ob,double amount);
	public default void printStatement(Account ob)
	{
		System.out.println("================");
		System.out.println("AccountHolder"+ob.getAccountHolder());
		System.out.println("Balance is"+ob.getBalance());
		System.out.println("================");
	}
	
}
