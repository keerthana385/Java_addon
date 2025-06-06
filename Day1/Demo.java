package Day1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter age:");
		int a=n.nextInt();
		if(a>=18) {
			System.out.println("You're eligible for voting..");
		}else {
			System.out.println("You are not eligible for voting...");
		}
		
	}

}
