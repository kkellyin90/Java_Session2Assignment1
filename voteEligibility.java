import java.util.Scanner;
public class voteEligibility {

	public static void main(String[] args) {
		//Write a Java program to allow the user to input his/her age. 
		//Then the program has to show whether the person is eligible to vote or not.
		
		//asking the users age using scanner class; type int
		System.out.println("Enter your age: ");
		Scanner user_input = new Scanner(System.in);
		int age = user_input.nextInt();
		System.out.println("Your age is "+age);
		
		//program to decide voting eligibility
		if (age >= 18){
			System.out.println("You are eligible to vote");
		}
		else{
			System.out.println("You are ineligible to vote");
		}
		
		;
		
		
		

	}

}
