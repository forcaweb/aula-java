package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Diego");
		list.add("Thais");
		list.add("Nicole");
		list.add("Thomas");
		list.add("Noel");
		
		list.remove("Noel");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		System.out.println("Index de Thais: " + list.indexOf("Thais"));
		
		List<String> result = list.stream().filter(x-> x.charAt(0) == 'D').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		String name = list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
