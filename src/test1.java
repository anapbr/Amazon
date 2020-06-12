// INPUT[1, 0, 0, 0,0, 1, 0, 0], 1
// OUTPUT[0 1 0 0 1 0 1 0]
package tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		java.io.Reader input = new FileReader("test1.in");
		// java.io.Reader input = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(input);
		
		String line = reader.readLine();
		
		String[] values = line.replace("[", "").replace("]", "").replace(" ", "").split(",");
		
		int iterations = Integer.parseInt(values[8]);
		
		while (iterations-- > 0) {
			
			String[] auxValues = values;
			
			values[0] = (auxValues[1].equals("0"))?"0":"1";
			
			for (int j = 1; j < 6; j++ ) {
				
				if (auxValues[j-1].equals(auxValues[j+1])) {
					values[j] = "0";
				} else {
					values[j] = "1";
				}
			} 

			values[7] = (auxValues[6].equals("0"))?"0":"1";
			
		}
		
		System.out.println(Arrays.toString(values));
	}

}
