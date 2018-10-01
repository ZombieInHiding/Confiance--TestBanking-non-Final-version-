package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bank.entity.Account;
import com.bank.entity.FixedDeposit;
import com.bank.service.FixedDepositService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appctx.xml")
public class FixedDepositTest {

	@Autowired
	private FixedDepositService fixedDepoService;

	@Test
	public void testCreateDeposit() {

		Account account = new Account();
		account = fixedDepoService.getAccountNo("123456789012");

		FixedDeposit fixedDeposit = new FixedDeposit();
		fixedDeposit.setAccounts(account);
		fixedDeposit.setPrincipalAmount(20000);
		//fixedDeposit.setTenure(2);
		
		String startDate = fixedDepoService.startDateValue();
		fixedDeposit.setStartDate(startDate);
		
		String endDate = fixedDepoService.endDateValue(2);
		fixedDeposit.setEndDate(endDate);
			
		/*double maturityAmount = fixedDepoService.calculateMaturityValue(15000, 2);
		fixedDeposit.setMaturityAmount(maturityAmount);
		double interestEarned = fixedDepoService.interestEarned(maturityAmount, 15000);
		fixedDeposit.setInterestEarned(interestEarned);*/
		
		fixedDepoService.createFdAccount(fixedDeposit);

	}
	
	@Test
	public void testMaturity() {
		// to be executed on the fly 
		double maturityAmount = fixedDepoService.calculateMaturityValue(20000, 2);
		System.out.println(maturityAmount);
		
	}

}
