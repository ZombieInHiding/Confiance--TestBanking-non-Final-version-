package com.bank.repo;

import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;

public interface FixedDepoRepo {

	public void createFdAccount(FixedDeposit depositaccount);
	
	public Accounts add(String accno);
}
