package com.bank.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	private Accounts accounts;

	@Column(name = "principal_amount")
	private double principalAmount;

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "maturity_amount")
	private double maturityValue;

	public int getFixedDepositNo() {
		return fixedDepositNo;
	}

	public void setFixedDepositNo(int fixedDepositNo) {
		this.fixedDepositNo = fixedDepositNo;
	}

	public Accounts getAccounts() {
		return accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getMaturityValue() {
		return maturityValue;
	}

	public void setMaturityValue(double maturityValue) {
		this.maturityValue = maturityValue;
	}

}
