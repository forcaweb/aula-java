package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employers> list = new ArrayList<>();
		
		Integer n = 0;
		
		System.out.print("Digite quantos funcionários vai registrar: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Função: ");
			String func = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();
			Integer id = i+1;
			Employers emp = new Employers(id, name, func, salary);
			list.add(emp);
		}
		
		for(Employers emp : list) {
			System.out.println(emp);
		}
		
		System.out.print("Digite o id do funcionario: ");
		Integer idSalary = sc.nextInt();
		
		Integer pos = position(list, idSalary);
		
		if(pos == null) {
			System.out.println("Funcionario não existe!");
		}else {
			System.out.print("Digite a porcetagem: ");
			Double porcetageSalary = sc.nextDouble();
			list.get(pos).increasentSalary(porcetageSalary);
		}
		
		System.out.println("Lista Atualizada: ");
		
		for(Employers emp : list) {
			System.out.println(emp);
		}
		
		sc.close();

	}
	
	/*public static boolean position(List<Employers> list, int id) {
		Employers emp =	list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
	return emp != null;
	}*/
	
	public static Integer position(List<Employers> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id){
				return i;
			}
		}
		return null;
	}
}
