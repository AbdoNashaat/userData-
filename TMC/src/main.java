import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> personsArray = new ArrayList<>();
		int i,usersIndex;
		String searchedUser;
		while(true) {                                                                //infinite loop for getting new data from the user 
		System.out.println("enter the user name (empty input to exit the loop):");     
		String userName = scanner.nextLine();	                                         
		if(userName.isEmpty())
			break;
		personsArray.add(new Person(userName));
		}                                                                             //   
		for(i =0;i<personsArray.size();i++) {
			System.out.println(personsArray.get(i));
		}
		while(true) {                                                                //infinite loop to get the desired name from the user  
			usersIndex=-1;
			System.out.println("Enter the name of the person u want to work on: (empty to exit the loop)"); 
			searchedUser = scanner.next();                                //Get the name from the user
			if(searchedUser.isEmpty()) {       
				System.out.println("empty?"+searchedUser);//if input is empty, break from the infinite loop
			 	System.out.println("U have entered any empty input and thus exited from the loop");
				break;
			}
			for(i =0;i<personsArray.size();i++) {                                    //Then search with a for loop the arrayList for that name
				if(searchedUser.equals(personsArray.get(i).getName())) {
				    usersIndex = i;
					break;                                                           //If the name was found, break from the for loop
				}
			}
			if(usersIndex==-1) {                                                        
				System.out.println("Sorry that name wasn't found in the data base."); 
			}                                                                             //output if the name was not found.
			else {
				System.out.println("The user "+searchedUser+" was found in the data base.");  //output if the name was found.
				System.out.println(personsArray.get(usersIndex));
			
			while(true) {
				System.out.println("Enter");
				System.out.println("1 to change "+searchedUser+"'s age.");
				System.out.println("2 to change "+searchedUser+"'s weight and height.");
				System.out.println("3 to terminate and search for a new user.");
				int userChoice = scanner.nextInt();
				if(userChoice!=1 && userChoice!=2) {
					System.out.println("You terminated the choices.");
					break;
				}
				switch(userChoice) {
				case 1:
					System.out.println("Enter "+searchedUser+"'s age:");
					personsArray.get(usersIndex).setAge(scanner.nextInt());
					break;
					
				case 2:
					System.out.println("Enter "+searchedUser+"'s weight and height:");
					personsArray.get(usersIndex).setWeightAndHeight(scanner.nextInt(),scanner.nextInt());
					break;

				    }
				System.out.println(personsArray.get(usersIndex));
			    }
			}
			
		}
		
	}
}
