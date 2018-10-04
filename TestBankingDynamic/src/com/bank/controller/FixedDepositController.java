package com.bank.controller;


import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.bean.FixedDepoBean;
import com.bank.entity.Accounts;
import com.bank.entity.FixedDeposit;
import com.bank.service.FixedDepositService;

@Controller
public class FixedDepositController {

	@Autowired
	private FixedDepositService fixedDepoService;

	@RequestMapping(value = "fixedDeposit.bank", method = RequestMethod.POST)
	public String createFixedDepo(FixedDepoBean fixedDepoBean, Map model, HttpSession session) {

		Accounts account = new Accounts();
		account = fixedDepoService.getAccountNo("123456789013");
		
		FixedDeposit fixedDeposit = new FixedDeposit();
		fixedDeposit.setAccounts(account);
		fixedDeposit.setPrincipalAmount(fixedDepoBean.getPrincipalAmount());
		fixedDeposit.setStartDate(new Date());
		
		java.sql.Date endDate = fixedDepoService.endDateValue( fixedDepoBean.getTenure());
		fixedDeposit.setEndDate(endDate);
		
		fixedDeposit.setMaturityValue(fixedDepoService.calculateMaturityValue(fixedDepoBean.getPrincipalAmount(), fixedDepoBean.getTenure()));
		
		fixedDepoService.createFdAccount(fixedDeposit);
		
		/*Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		java.util.Date uDate = date.getTime();*/
		
		model.put("principalAmount",fixedDepoBean.getPrincipalAmount());
		model.put("tenure", fixedDepoBean.getTenure());
		model.put("startDate",fixedDepoBean.getStartDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		model.put("endDate",endDate);
		model.put("maturityValue",fixedDepoBean.getMaturityValue());
		model.put("interestEarned",fixedDepoBean.getInterestEarned());
		
		return "Index";
	}
	
	@RequestMapping(value = "fetchFixedDeposits.bank", method = RequestMethod.GET)
	public String getdata( Map model, HttpSession session) {

		String accno = "123456789013";
		List<FixedDeposit> fd = fixedDepoService.displayFixedDeposits(accno);
		model.put("FD",fd);

		return "FetchFixedDeposit";
	}

}
