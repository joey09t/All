package com.cg.pl;
import com.cg.service.*;
import com.cg.bean.*;
import com.cg.service.*;
public class MyWallet {

	public static void main(String[] args) {
		AccountService service=new AccountService();
		SavingsAccount ob2=new SavingsAccount(105,22222,"kkk",25000);
		service.printStatement(ob2);
		double b1=0.0;
		try
		{
		 b1=service.withdraw(ob2, 5000.00);
			System.out.println("After withdraw"+b1);
		}
		catch(RuntimeException e)
		{
			System.err.println();e.getMessage();
		}
		double tax=service.calculateTax(GST.PCT_5, b1);
		System.out.println(tax);
	}
	
}
