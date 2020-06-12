package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		java.io.Reader input = new FileReader("test2.in");
		// java.io.Reader input = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(input);
		
		String line = reader.readLine();
		String[] inputs = line.replace("[", "").replace("]", "").replace(" ", "").split(",");
		
		System.out.println(Arrays.toString(inputs));
		
		int qty = Integer.parseInt(inputs[0]);
		int[] divisors = new int[qty];
		
		for (int i = 0; i < qty; ++i) {
			divisors[i] = Integer.parseInt(inputs[i+1]);
		}
		
		Arrays.sort(divisors);
		int gcd = 1;
		for (int i = 2; i <= divisors[0]; ++i) {
			boolean test = true;
			for (int j = 0; j < divisors.length ; ++j) {
				if (divisors[j] % i != 0) {
					test = false;
					break;
				}
			}
			if (test)
				gcd = i;
		}
		
		System.out.println(Arrays.toString(divisors));
		
		System.out.println(gcd);
		
	}

}
