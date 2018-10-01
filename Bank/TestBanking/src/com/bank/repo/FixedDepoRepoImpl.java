package com.bank.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.Account;
import com.bank.entity.FixedDeposit;

@Repository
public class FixedDepoRepoImpl implements FixedDepoRepo {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void createFdAccount(FixedDeposit depositaccount) {
		Session session = sessionFactory.getCurrentSession();
		session.save(depositaccount);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public Account getAccountNo(String accno) {
		Session session = sessionFactory.getCurrentSession();
		// To fetch account no from Accounts Entity
		Account accNo = (Account) session.load(Account.class, accno);

		return accNo;
	}

}
