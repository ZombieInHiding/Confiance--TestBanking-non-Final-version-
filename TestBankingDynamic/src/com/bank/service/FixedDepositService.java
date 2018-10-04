package com.bank.service;

import java.sql.Date;
import java.util.List;

import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;

public interface FixedDepositService {

	public double calculateMaturityValue(double principalAmount, double numberOfPeriod);

	/*public double interestEarned(double maturityValueIs, double principalAmount);*/

	public void createFdAccount(FixedDeposit depositaccount);

	public Accounts getAccountNo(String accno);
	
	//public List displayFixedDeposits();
	
	public java.sql.Date endDateValue(int year);
	
	/*public java.util.Date startDateValue();*/
	
	//public String fetch();

	public List<FixedDeposit> displayFixedDeposits(String accno);
}
