package javaBasicPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new integer number: ");
		int num = sc.nextInt();

		// Using Algorithms
		int rev=0;
		while(num!=0){
			rev=rev*10 + num%10;
			num = num/10;
		}
		System.out.println("reverse number is: "+rev);
	
	
	/*//Using StringBuffer
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sb.reverse();
	System.out.println("reverse number is: "+rev);*/
		
		
	// Using String Builder
		
		/*StringBuilder s1 = new StringBuilder();
		s1.append(num);
		StringBuilder rev = s1.reverse();
		System.out.println("reverse number is: "+rev);*/
	

}
}
