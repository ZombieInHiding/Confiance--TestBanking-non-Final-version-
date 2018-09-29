package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bank.entity.FixedDeposit;
import com.bank.repo.FixedDepoRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class FixedDepositTest {
	
	@Autowired
	private FixedDepoRepo fixedDepoImpl;
	
	@Test
	public void testCreateDeposit() {
		FixedDeposit fixedDeposit = new FixedDeposit();
		fixedDeposit.setFixedDepositNo("123");
		fixedDeposit.setAmount(222);
		fixedDeposit.setMaturity(2);
		//fixedDeposit.setAccounts();
		fixedDepoImpl.createFdAccount(fixedDeposit);
		
	}
	

}
