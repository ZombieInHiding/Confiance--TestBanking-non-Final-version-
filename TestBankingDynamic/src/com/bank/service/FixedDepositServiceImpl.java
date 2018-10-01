package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Account;
import com.bank.entity.FixedDeposit;
import com.bank.repo.FixedDepoRepo;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class FixedDepositServiceImpl implements FixedDepositService {

	@Autowired
	private FixedDepoRepo fixedDepoRepo;

	@Override
	public double calculateMaturityValue(double principalAmount, double numberOfPeriod) {

		//0.06 denotes 6 % rate of interest and 4 denotes QuarterlyInterest  	
		return principalAmount * Math.pow((1 + (0.06 / 4)), 4 * numberOfPeriod);
	}
	
	@Override
	public String startDateValue() {
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		Format f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(date.getTime());
	}
	
	@Override
	public String endDateValue(int year) {
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		Format f = new SimpleDateFormat("dd/MM/yyyy");
		date.add(Calendar.YEAR, year);
	    return f.format(date.getTime());
	}

	/*@Override
	public double interestEarned(double maturityValueIs, double principalAmount) {
		return maturityValueIs - principalAmount;
	}*/

	
	@Override
	public void createFdAccount(FixedDeposit depositaccount) {
		fixedDepoRepo.createFdAccount(depositaccount);
	}

	@Override
	public Account getAccountNo(String accno) {
		return fixedDepoRepo.getAccountNo(accno);
	}

	

}
