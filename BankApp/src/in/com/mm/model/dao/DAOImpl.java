package in.com.mm.model.dao;

import java.util.ArrayList;

import in.com.mm.framework.dao.DAO;
import in.com.mm.framework.pojo.BankAccount;
import in.com.mm.framework.pojo.Customer;


public class DAOImpl implements DAO {
	private static ArrayList<BankAccount> bankAccountSet;
	private static ArrayList<Customer> customerList;
	static {
		bankAccountSet = new ArrayList<>();
		customerList = new ArrayList<>();
	}
	
	
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		bankAccountSet.add(bankAccount);
	}
	
	
	@Override
	public ArrayList<BankAccount> viewAllAccounts(){
		return bankAccountSet;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer+"cusosdkn");
		customerList.add(customer);
	}


	@Override
	public ArrayList<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

	@Override
	public BankAccount searchAccountById(int num) {
		BankAccount account = null;
		for(BankAccount a : bankAccountSet ) {
			if(a.getAccountNumber() == num) {
				account = a;
			}
		}
		return account;
	}
}
