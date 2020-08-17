package javaBasicPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "ABCD";
		String rev = "";
		
		


	//.1. Using string concatenation
		/*
		int len = str.length();
		
		for(int i = len-1;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		System.out.println("reversed string is "+rev);
		*/
	
	
	//. 2. using character array
		/*char a[] = str.toCharArray();
		int len = str.length();
		
		for (int i=len-1;i>=0;i--){
			rev = rev + a[i];
		}
	 System.out.println("reverse numer is "+rev);*/
	 
	 
	 //.3. using String Buffer class
	 
	 StringBuffer sb = new StringBuffer(str);
	 System.out.println("reverse is "+sb.reverse());

	}
}
