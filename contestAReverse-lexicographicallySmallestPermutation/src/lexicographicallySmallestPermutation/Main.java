package lexicographicallySmallestPermutation;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sss");
		int testCases = Integer.valueOf(scan.nextLine());
		while(testCases>0){
		    int length = Integer.valueOf(scan.nextLine());
		    String raw = scan.nextLine();
		    String[] data = raw.split(" ");
		    int[] array = new int[length];
		    for(int i = 0 ; i<length ; i++){
		        array[i] = Integer.valueOf(data[i]);
		    }
		    for(int i = 0 ; i<length ; i++){
		        if(array[i] != i+1){
		             for(int j = length-1; j>i ; j--){
		                 if(array[j] == i+1){
		                     for(int k=i; k<j; k++,j--){
		                     int x = array[k];
		                     array[k] = array[j];
		                     array[j] = x;
		                     }
		                     break;
		                 }
		                 
		             } 
		         break;    
		        }
		        
		    }
		    for(int i = 0 ; i<length ; i++){
		        System.out.print(array[i]+" ");
		    }
		    System.out.println();
		    testCases--;
		}
	}
}
