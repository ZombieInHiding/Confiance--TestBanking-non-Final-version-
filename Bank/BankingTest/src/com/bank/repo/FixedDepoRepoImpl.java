package com.bank.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bank.entity.FixedDeposit;

@Repository
public class FixedDepoRepoImpl implements FixedDepoRepo {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void createFdAccount(FixedDeposit depositaccount) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(depositaccount);
		
	}

	
}
