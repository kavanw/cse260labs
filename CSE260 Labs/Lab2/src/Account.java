import java.util.Calendar;

public class Account {
	private int id;
	private double balance, annualInterestRate;
	private java.util.Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 1000;
		annualInterestRate = 4.50;
		dateCreated = Calendar.getInstance().getTime();
	}
	
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		annualInterestRate = 4.50;
		dateCreated = Calendar.getInstance().getTime();
	}
	
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public java.util.Date getDate()
	{
		return dateCreated;
	}
	public void setId(int newId)
	{
		id = newId;
	}
	
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newRate)
	{
		annualInterestRate = newRate;
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	
	public void withdraw(double amount)
	{
		if(balance-amount>=0)
			balance = balance - amount;
		else
			System.out.println("Not enough funds to take out request amount!");
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public String toString()
	{
		String s = "Account ID: " + id + "\n";
		s = s + "Balance: " + balance + "\n";
		s = s + "Annual Interest Rate: " + annualInterestRate + "%" + "\n";
		s = s + "Date Created: " + dateCreated.toString();
		return s;
	}
}
