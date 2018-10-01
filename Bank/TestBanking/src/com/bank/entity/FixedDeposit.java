package com.bank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fixed_deposit")
@SequenceGenerator(name = "seqgen", sequenceName = "fd_seq") // Using database generated sequence
public class FixedDeposit {
	@Id
	@GeneratedValue(generator = "seqgen")
	@Column(name = "fdeposit_no")
	private int fixedDepositNo;

	@OneToOne
	@JoinColumn(name = "account_no")
	private Account accounts;

	@Column(name = "principal_amount")
	private double principalAmount;

	@Column(name = "start_date")
	private String startDate;

	@Column(name = "end_date")
	private String endDate;

	public int getFixedDepositNo() {
		return fixedDepositNo;
	}

	public void setFixedDepositNo(int fixedDepositNo) {
		this.fixedDepositNo = fixedDepositNo;
	}

	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/*
	 * @ Column(name = "maturity_amount") private double maturityAmount;
	 * 
	 * @Column(name = "interest_earned") private double interestEarned;
	 * 
	 * @Column(name="account_no") private String accountNo;
	 */

	/*
	 * public String getAccounts() { return accountNo; } public void
	 * setAccounts(String accountNo) { this.accountNo = accountNo; } public void
	 * setMaturityAmount(double maturityAmount) { this.maturityAmount =
	 * maturityAmount; } public double getInterestEarned() { return interestEarned;
	 * } public void setInterestEarned(double interestEarned) { this.interestEarned
	 * = interestEarned; } public double getMaturityAmount() { return
	 * maturityAmount; }
	 */

}
