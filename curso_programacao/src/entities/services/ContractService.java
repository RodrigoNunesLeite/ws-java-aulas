package entities.services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private Date newDueDat;
	
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		for(int month = 1; month <= months; month ++) {
			double eachInstallment = contract.getTotalValue() / months;
			
			eachInstallment += 
					onlinePaymentService.interest(eachInstallment, month) + 
					onlinePaymentService.paymentFee(eachInstallment);
			
			dateInstallment(contract.getDate(), month);
			
			Installment installment = new Installment(newDueDat, eachInstallment);
			
			contract.addInstallments(installment);
		}
	}
	
	
	public Date dateInstallment(Date dueDat, int month) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dueDat);
		cal.add(Calendar.MONTH, month);
		newDueDat = cal.getTime();
		return newDueDat;
	}
}
