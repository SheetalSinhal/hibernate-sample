package entities;

// Supports Customized Auto Primary key Generator
public class Account 
{
	private String accountNumber;
	private String accountHolder;
	private String type;
	private double balance;
	
	public Account() {}
	
	public Account(String accHolder,String accType) 
	{
		this.accountHolder=accHolder;
		this.type=accType;
		balance=0;		
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(String accNum) {
		this.accountNumber=accNum;
	}
	
	public String getAccountHolder() {
		return this.accountHolder;
	}
	
	public void setAccountHolder(String accHolder) {
		this.accountHolder=accHolder;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String accType) {
		type=accType;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double accBalance) {
		this.balance=accBalance;
	}

}
