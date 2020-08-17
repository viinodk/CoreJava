package javaBasicPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//. 1. using third var or temp 
		/*int t;
		t = a;
		a = b;
		b = t;
		System.out.println("a and b after swapping is "+a+" and "+b);*/
		
		//2. using + and - op
		/*a=a+b;
		b=b-a;
		a=a-b;
		System.out.println("a and b after swapping is "+a+" and "+b);*/
		
		//3. using * and / ope
		/*a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a and b after swapping is "+a+" and "+b);*/
		
		//.4. using single statement
		/*b=b+a-(a=b);
		System.out.println("a and b after swapping is "+a+" and "+b);*/
		
		//.5. using xor op
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a and b after swapping is "+a+" and "+b);
		
		

	}

}
