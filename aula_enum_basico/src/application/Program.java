package application;

import java.util.Date;

import entities.Orders;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Orders order = new Orders(1, new Date(), OrderStatus.PAYMENT_PENDING);
		System.out.println(order);
	}

}
