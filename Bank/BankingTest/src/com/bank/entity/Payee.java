package com.bank.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "registered_payee")
public class Payee {
	@Column(name="payee_name")
	private String payeeName;
	@Column(name = "payee_ac_no")
	private String payeeAccountNo;
	@Column(name="payer_ac_no")
	private String payerAccountNo;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "registered_payee", joinColumns = { @JoinColumn(name = "payee_ac_no") }, inverseJoinColumns = {
			@JoinColumn(name = "payee_ac_no") })
	private Set<Payee> payees; // Many to many with itself

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeAccountNo() {
		return payeeAccountNo;
	}

	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayerAccountNo() {
		return payerAccountNo;
	}

	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

}
