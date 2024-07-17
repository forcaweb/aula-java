package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		// hashset, TreeSet e linkedhashset
		
		Set<Integer> a = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		Set<Integer> b = new LinkedHashSet<>(Arrays.asList(7, 8, 9, 10, 3, 2, 1));

		// União
		Set<Integer> c = new LinkedHashSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// Interserção
		Set<Integer> d = new LinkedHashSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// Interserção
		Set<Integer> e = new LinkedHashSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
