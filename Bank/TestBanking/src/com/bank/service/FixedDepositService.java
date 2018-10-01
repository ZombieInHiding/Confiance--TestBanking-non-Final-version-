package com.bank.service;

import com.bank.entity.Account;
import com.bank.entity.FixedDeposit;

public interface FixedDepositService {

	public double calculateMaturityValue(double principalAmount, double numberOfPeriod);

	/*public double interestEarned(double maturityValueIs, double principalAmount);*/

	public void createFdAccount(FixedDeposit depositaccount);

	public Account getAccountNo(String accno);
	
	public String endDateValue(int year);
	
	public String startDateValue();
}
