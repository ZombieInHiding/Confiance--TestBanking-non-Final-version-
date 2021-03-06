package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class FixedDeposit {
	@Id
	@Column(name = "fdeposit_no")
	private String fixedDepositNo;
	private double amount;
	private int maturity;
	@OneToOne
	@JoinColumn(name = "account_no")
	private Accounts accounts;

	public String getFixedDepositNo() {
		return fixedDepositNo;
	}

	public void setFixedDepositNo(String fixedDepositNo) {
		this.fixedDepositNo = fixedDepositNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = 1000;
	}

	public int getMaturity() {
		return maturity;
	}

	public void setMaturity(int maturity) {
		this.maturity = maturity;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

}
