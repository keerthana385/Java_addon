package Day2;

import java.util.Random;
import java.util.Scanner;

public class egOTP {
	static int OTP() {
		Random ran=new Random();
		return 1500 + ran.nextInt(7777);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your phone no:");
		long a=s.nextLong();
		if(a==9345532431L) {
			System.out.println("Your phoneno is verified");
			int otp=OTP();
			System.out.println("Your otp is:" +otp);
		}else {
			System.out.println("Phoneno is incorrect");
		}
	
	}

}
