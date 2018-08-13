package in.com.mm.framework.dao;

import java.util.ArrayList;

import in.com.mm.framework.pojo.BankAccount;
import in.com.mm.framework.pojo.Customer;



public interface DAO {

	
	void addBankAccount(BankAccount bankAccount);
	void addCustomer(Customer customer);
	
	ArrayList<BankAccount> viewAllAccounts();
	ArrayList<Customer> viewAllCustomers();
	BankAccount searchAccountById(int num);
}
