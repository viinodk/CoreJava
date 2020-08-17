package javaBasicPrograms;

import java.util.Scanner;

public class VerifyPalindrome {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int num = 12623;
		int orig_num = num;
		int rev = 0;
		while(num!=0){
			rev=rev*10 + num%10;
			num = num/10;
			
		}
		if(orig_num == rev){
			System.out.println("number is a palindrome");
		}else{
			System.out.println("number is not a palindrome");
		}
		

	}

}
