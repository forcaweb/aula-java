package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("========= Test 1: FindById ==========");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findId(3);
		System.out.println(seller);
		
		System.out.println("========= Test 2: FindByDepartment ==========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	}

}
