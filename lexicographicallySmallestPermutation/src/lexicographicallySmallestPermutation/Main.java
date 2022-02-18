package lexicographicallySmallestPermutation;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		System.out.println("Enter the number of  test cases:");
		int testCases = scan.nextInt();
		int start = 0,i;
		int lengthOfPremutationArray[] = new int[testCases];
		while(testCases>start) {
			i=0;
			System.out.println("Enter the length of the permutation:");
			lengthOfPremutationArray[start] = scan.nextInt();
			while(lengthOfPremutationArray[start]>i) {
				arr.add(scan.nextInt());
			    i++;
			}			
			start++;
		}
        
		int temp=-1,choice = 0,searchValue=-1;
		int base=0,top=-1;
		start = 0;
        while(testCases>start) {
                top=top+lengthOfPremutationArray[start];                          //working between [0/base to the element]
                for( i = base ;i<=top ; i++) {
                    int n = arr.get(i);
                    if(n > i+1-base && choice ==0) {
                        temp = n;
                        arr.set(i,i+1-base);
                        choice = 1;
                        searchValue = i+1-base;
                 
                        }
                    if(n==searchValue){
                        arr.set(i,temp);
                        choice =0;
                        searchValue = -1;
                        }	
                    arr2.add(arr.get(i));
                    }
		        System.out.println(arr2);
		        base = lengthOfPremutationArray[start]+base;              
                arr2.clear();
            
            start++;
        }
		
	}

}
