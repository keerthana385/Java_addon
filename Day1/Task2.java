package Day1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter pin:");
		int a=s.nextInt();
		if(a==4321) {
			System.out.println("Enter amount:");
			int b=s.nextInt();
			if(b<=25000) {
				System.out.println("Withdrawn successfully");
			}else {
				System.out.println("insufficient amount");
			}
		}else {
			System.out.println("invalid pin");
		}
	}
}
