package programming;

import java.util.Scanner;

public class project1 {
	final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
	botNameAndAge("Aid", 2020);
	nameOfUser();
	ageOfUser();
	countingNumbers();
	question();
	end();
	}

	public static void botNameAndAge(String name, int age) {
		System.out.println("Hello! My name is " + name + ".");
		System.out.println("I was created in " + age + ".");
		
	}

	public static void nameOfUser() {
		System.out.println("Please, remind me of your name.");
		String name = sc.nextLine();
		System.out.println("What a great name " + name + "!");
		System.out.println("Let me guess your age");
	}
	public static void ageOfUser() {
		System.out.println("Tell me the remainder of dividing your age by 3, 5 and 7.");
		
		int age = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		int realAge = (age * 70 + age2 * 21 + age3 * 15) % 105;
		System.out.println("Your age is " + realAge + ": thats's a good time to start programming!");
	
	}	
	
	public static void countingNumbers() {
		System.out.println("Now I will prove to you that I can count to any number you want.");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println(i + "!");
		}
		

	}

	public static void question() {
		System.out.println("Let's test your programming knowledge.");
		System.out.println("Why do we use methods?");
		System.out.println("1. To repeat a statement multiple times");
		System.out.println("2. To decompose a program intop several small subroutines");
		System.out.println("3. To determine the execution time of a program");
		System.out.println("4. To interrupt the execution of a program");
		
		
		while (true) {
			int answer = sc.nextInt();
			if (answer == 2) {
				break;	
			} else {
				System.out.println("Please, try again");
				
			}
		}
	
	}
	public static void end() {
		System.out.println("Congratulations, have a nice day!");
	}


}
