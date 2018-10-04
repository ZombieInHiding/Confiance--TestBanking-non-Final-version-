package com.bank.repo;

import java.util.List;

import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;

public interface FixedDepoRepo {

	public void createFdAccount(FixedDeposit depositaccount);

	public Accounts getAccountNo(String accno);
	
	//public String fetch();

	public List<FixedDeposit> displayFixedDeposits(String accno);
	
	//public List displayFixedDeposits();
}
