package entities.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final Double FEE_PERCENTAGE = 0.02;
	private static final Double MONTHLY_INTEREST = 0.01; 
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * MONTHLY_INTEREST * months;
	}

}
