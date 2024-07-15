package services;

import java.security.InvalidParameterException;

public interface Interest {
	public Double getInterestRate();
	
	default double payment(double amount, int months) {
		if(months < 1) {
			throw new InvalidParameterException("Meses inválidos");
		}
		return amount * Math.pow(1.0 + getInterestRate()/ 100, months);
	}
}
