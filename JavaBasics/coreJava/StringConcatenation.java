package coreJava;

public class StringConcatenation {

	public static void main(String[] args) {

		// "+" sign is concatenation operator
		// println is used to print on the console with a new line
		//print is used to just print on the console 
		int a = 200;
		int b = 100;
		
		double c = 12.33;
		double d = 10.33;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		System.out.println("HelloWorld");
		System.out.println(a);
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		
		System.out.println("addition of a and b is "+(a+b));
		
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
	}

}
