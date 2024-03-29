package com.cg.service;

import java.util.Map;

import com.cg.bean.Account;
import com.cg.dao.AccountDAO;
import com.cg.dao.AccountDAOImpl;

public class AccountService implements Gst, Transaction{

	AccountDAO dao=new AccountDAOImpl();
	@Override
	public double withdraw(Account ob, double amount) {
		double new_balance=ob.getBalance()-amount;
		if(new_balance<1000.00) {
			new_balance=ob.getBalance();
			System.out.println("Insufficient Balance");
		}
		ob.setBalance(new_balance);
		return new_balance;
	}

	@Override
	public double deposite(Account ob, double amount) {
		// TODO Auto-generated method stub
		double new_balance=ob.getBalance()+amount;
		ob.setBalance(new_balance);
		return new_balance;
	}

	@Override
	public int transferMoney(Account from, Account to, double amount) {
		// TODO Auto-generated method stub
		double w=withdraw(from, amount);
			deposite(to, amount);
			return 1;
		
	}

	public boolean addAccount(Account ob) {
		return dao.addAccount(ob);
	}
	public boolean updateAccount(Account ob) {
		return dao.updateAccount(ob);
	}
	public boolean deleteAccount(Account ob) {
		return dao.deleteAccount(ob);
	}
	public Account findAccount(Long mobileno) {
		return dao.findAccount(mobileno);
	}
	public Map<Long, Account> getAllAccounts(){
		return dao.getAllAccounts();
	}

	@Override
	public double calculateTax(double PCT, double amount) {
		// TODO Auto-generated method stub
		return amount*Gst.PCT_5;
	}

}
