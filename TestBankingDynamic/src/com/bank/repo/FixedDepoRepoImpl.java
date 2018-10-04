package com.bank.repo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.Accounts;
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
	public Accounts getAccountNo(String accno) {
		Session session = sessionFactory.getCurrentSession();
		// To fetch account no from Accounts Entity
		Accounts accNo = (Accounts) session.load(Accounts.class, accno);
		return accNo;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List <FixedDeposit> displayFixedDeposits(String accno) {
		Session session = sessionFactory.getCurrentSession();
		Accounts acc = (Accounts) session.get(Accounts.class, accno);
		
		 List <FixedDeposit> fd = new ArrayList<FixedDeposit>(acc.getFixedDeposit());
	
		return fd;
	}
}
