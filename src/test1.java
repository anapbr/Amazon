// INPUT [1, 0, 0, 0, 0, 1, 0, 0], 1
// OUTPUT[0  1  0  0  1  0  1  0]
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) throws IOException {
		java.io.Reader input = new FileReader("test1.in");
		// java.io.Reader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		String line = reader.readLine();
		
		String[] data = line.replace("[", "").replace("]", "").replace(" ", "").split(",");
		
		int days = Integer.parseInt(data[8]);
		
		int[] status = new int[8];
		
		for (int i = 0; i < 8; ++i) {
			status[i] = Integer.parseInt(data[i]);
		}
		
		System.out.println(Arrays.toString(status));
		
		while (days-- > 0) {
			
			int[] auxStatus = status.clone();

			System.out.println(auxStatus[1]);
			status[0] = (auxStatus[1]==0) ? 0 : 1;
			System.out.println(auxStatus[1]);
			for (int j = 1; j < 7; j++ ) {
				System.out.println("auxStatus[j-1]==auxStatus[j+1]" + auxStatus[j-1] + " "  + auxStatus[j+1]);
				if (auxStatus[j-1]==auxStatus[j+1]) {
					status[j] = 0;
				} else {
					status[j] = 1;
				}
			} 

			status[7] = (auxStatus[7]==0) ? 0 : 1;
			
		}
		
		System.out.println(Arrays.toString(status));
	}

}
