package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;
import com.bank.repo.FixedDepoRepo;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class FixedDepositServiceImpl implements FixedDepositService {

	@Autowired
	private FixedDepoRepo fixedDepoRepo;

	@Override
	public double calculateMaturityValue(double principalAmount, double numberOfPeriod) {

		// 0.06 denotes 6 % rate of interest and 1 denotes Annually Interest
		return principalAmount * Math.pow((1 + (0.06 / 1)), 1 * numberOfPeriod);
	}

	@Override
	public java.sql.Date endDateValue(int year) {

		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		date.add(Calendar.YEAR, year);
		date.add(Calendar.DATE, -1);

		java.util.Date uDate = date.getTime();
		java.sql.Date endDate = new java.sql.Date(uDate.getTime());

		return endDate;

	}

	@Override
	public void createFdAccount(FixedDeposit depositaccount) {
		fixedDepoRepo.createFdAccount(depositaccount);
	}

	@Override
	public Accounts getAccountNo(String accno) {
		return fixedDepoRepo.getAccountNo(accno);
	}

	@Override
	public List<FixedDeposit> displayFixedDeposits(String accno) {
		return fixedDepoRepo.displayFixedDeposits(accno);
	}

}
