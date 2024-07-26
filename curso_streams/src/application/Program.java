package application;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		Stream<Long> st1 = Stream.iterate(new Long[] {0L, 1L}, r -> new Long[] {r[1], r[0]+r[1]}).map(r->r[0]);
		System.out.println(Arrays.toString(st1.limit(10).toArray()));
	}

}
