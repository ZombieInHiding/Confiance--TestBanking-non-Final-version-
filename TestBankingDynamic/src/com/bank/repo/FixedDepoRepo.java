package com.bank.repo;

import com.bank.entity.Account;
import com.bank.entity.FixedDeposit;

public interface FixedDepoRepo {

	public void createFdAccount(FixedDeposit depositaccount);

	public Account getAccountNo(String accno);
}
