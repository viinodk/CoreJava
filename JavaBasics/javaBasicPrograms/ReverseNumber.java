package javaBasicPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	
	
	/*Author: Viinod Kulkarni
	 * 
	 * Sr. No.	Key							String Buffer															    String Builder
		1		Basic			StringBuffer was introduced with the initial release of Java 						   It was introduced in Java 5
		2	Synchronized				It is synchronized 																It is not synchronized 
		3	Performance 	It is thread-safe. So, multiple threads can’t access at the same time, therefore, it is slow.	It is not thread-safe hence faster than String Buffer 
		4	Mutable 	It is mutable. We can modify string without creating an object 										It is also mutable 
		5	Storage 				Heap																										Heap

	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new integer number: ");
		int num = sc.nextInt();

		// Using Algorithms
		/*
		 * int rev=0; while(num!=0){ rev=rev*10 + num%10; num = num/10; }
		 * System.out.println("reverse number is: "+rev);
		 */
	
	
	//Using StringBuffer
	StringBuffer sb = new StringBuffer(String.valueOf(num));
	StringBuffer rev = sb.reverse();
	System.out.println("reverse number is: "+rev);
		
		
	// Using String Builder
		
		/*StringBuilder s1 = new StringBuilder();
		s1.append(num);
		StringBuilder rev = s1.reverse();
		System.out.println("reverse number is: "+rev);*/
	

}
}
