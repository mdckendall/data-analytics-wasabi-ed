import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Student{
	String firstName, lastName;

	public Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString(){
		return this.firstName + " " + this.lastName;
	}
}

class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);

		while(fileScanner.hasNextLine()){
			arrayList.add(fileScanner.nextLine());
		}
		
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		while(userInput != 5){ 
			System.out.println("Press 1 to learn about salary.");
			System.out.println("Press 2 to learn about the job.");
			System.out.println("Press 3 to learn about demand.");
			System.out.println("Press 4 to view current students.");
			System.out.println("Press 5 to quit.");
			userInput = scanner.nextInt();
			if(userInput == 1){
				System.out.println("$98,345 average salary in South Florida!");
			}else if(userInput == 2){
				System.out.println("US News - 100 Best Jobs!");
			}else if(userInput ==3){
				System.out.println("Top 10 Forbes In-Demand Jobs!");
			}else if(userInput == 4){
				System.out.println("Current Students:");
				for(String s : arrayList){
					System.out.println(s);
				}
			}else if(userInput == 5){
				break;
			}
			
		};
	}
}