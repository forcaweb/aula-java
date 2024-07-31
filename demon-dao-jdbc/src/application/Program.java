package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao seller = DaoFactory.createSellerDao();
		seller.insert(new Seller(null, null, null, null, null, null));
	}

}
