package application;

import java.util.Date;
import java.util.List;

import exceptions.DBException;
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
		
		System.out.println("========= Test 3: FindAll ==========");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("========= Test 4: Insert ==========");
		Seller newSeller = new Seller(null, "Thais", "thaislima@teste.com", new Date(), 3000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Seller id adicionado = " + newSeller.getId());
		
		System.out.println("========= Test 5: Update ==========");
		seller = sellerDao.findId(2);
		seller.setName("Britão");
		sellerDao.update(seller);
		System.out.println("Update concluido!");
		
		System.out.println("========= Test 6: Delete ==========");
		seller = sellerDao.findId(12);
		if(seller != null) {
			sellerDao.deleteById(seller.getId());
		}else {
			throw new DBException("Seller não existe!");
		}
		
		System.out.println("Delete concluido!");
	}

}
