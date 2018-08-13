package in.com.mm.model.service;

import java.util.ArrayList;

import in.com.mm.framework.pojo.BankAccount;
import in.com.mm.framework.pojo.Customer;
import in.com.mm.framework.pojo.PaymentGateway;
import in.com.mm.framework.service.Service;
import in.com.mm.model.dao.DAOImpl;


public class ServiceImpl implements Service {
	DAOImpl dao = new DAOImpl();
	
	/* (non-Javadoc)
	 * @see com.moneymoney.framework.service.Service#addBankAccount(com.moneymoney.framework.account.pojo.BankAccount)
	 */
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		System.out.println(bankAccount);
		dao.addBankAccount(bankAccount);
	}
	
	/* (non-Javadoc)
	 * @see com.moneymoney.framework.service.Service#viewAll()
	 */
	@Override
	public ArrayList<BankAccount> viewAllAccounts(){
		return dao.viewAllAccounts();
	}
	
	/* (non-Javadoc)
	 * @see com.moneymoney.framework.service.Service#FundTransfer(com.moneymoney.framework.account.pojo.BankAccount, com.moneymoney.framework.account.pojo.BankAccount, double)
	 */
	@Override
	public boolean FundTransfer(BankAccount sender,BankAccount reciever,double amount) {
		return PaymentGateway.transfer(sender, reciever, amount);
	}

	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}
	
	@Override
	public ArrayList<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return dao.viewAllCustomers();
	}

	@Override
	public BankAccount searchAccountById(int num) {
		// TODO Auto-generated method stub
		return dao.searchAccountById(num);
	}
	
	public String withdraw(int accNo,double amount) {
		BankAccount account = searchAccountById(accNo);
		return account.withdraw(amount);		
	}
	public void deposit(int accNo,double amount) {
		BankAccount account = searchAccountById(accNo);
		account.deposit(amount);		
	}
}
