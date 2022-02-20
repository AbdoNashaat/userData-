package contestArray;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int testCases = Integer.valueOf(scan.nextLine());
		while(testCases>0) {
			
			
			int size = Integer.valueOf(scan.nextLine());
			
			String raw = scan.nextLine();
			String[] data = raw.split(" ");
			int[] array = new int[size];
			
			for(int i = 0 ; i<size ; i++) {
				array[i] = Integer.valueOf(data[i]);
			}
			
			int count = 0;
			for(int i = 0 ; i<size-2 ; i++) {
				
				int first = array[i];
				int second = array[i+1];
				int third = array[i+2];

				if(second > first && second>third) {
					if(i+4 < size) {
						int fourth = array[i+3];
						int fifth = array[i+4];
						if(fourth > fifth && fourth > third && fourth >= second) {
							array[i+2] = array[i+3];
							count++;
						}
						else {
							array[i+2] = array[i+1];
							count++;
						}
					}
					
					else  {
						array[i+2] = array[i+1];
						count++;
						
					}
				}
			
			}
			
			System.out.println(count);
			for(int i:array) {
				System.out.print(i+" ");
			}
			System.out.println();
			testCases--;
        }
	}
}
