package in.com.mm.framework.service;

import java.util.ArrayList;

import in.com.mm.framework.pojo.BankAccount;
import in.com.mm.framework.pojo.Customer;


public interface Service {

	void addBankAccount(BankAccount bankAccount);
	void addCustomer(Customer customer);
	ArrayList<BankAccount> viewAllAccounts();
	ArrayList<Customer> viewAllCustomers();
	BankAccount searchAccountById(int num);
	boolean FundTransfer(BankAccount sender, BankAccount reciever, double amount);
}
