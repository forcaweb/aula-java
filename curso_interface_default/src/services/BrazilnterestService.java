package services;

public class BrazilnterestService implements Interest {
	private Double interestRate;
	
	public BrazilnterestService() {}

	public BrazilnterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
}
