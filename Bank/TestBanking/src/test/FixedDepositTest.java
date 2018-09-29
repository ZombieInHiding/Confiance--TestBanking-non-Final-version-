package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;
import com.bank.repo.FixedDepoRepo;
import com.bank.repo.FixedDepoRepoImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class FixedDepositTest {
	
	@Autowired
	private FixedDepoRepo fixedDepoRepo;
	
	@Test
	public void testCreateDeposit() {
		
		Accounts acc = new Accounts();
		acc = fixedDepoRepo.add("123456789012");
		fixedDepoRepo.add("123456789012");
		FixedDeposit fixedDeposit = new FixedDeposit();
		fixedDeposit.setFixedDepositNo("123");
		fixedDeposit.setAmount(222);
		fixedDeposit.setMaturity(2);
		fixedDeposit.setAccounts(acc);
		fixedDepoRepo.createFdAccount(fixedDeposit);
		
	}
	

}
