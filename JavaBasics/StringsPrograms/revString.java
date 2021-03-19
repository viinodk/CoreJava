package StringsPrograms;

public class revString {
	
	/*By using String Builder / StringBuffer*/
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	/*By Reverse Iteration*/
	public static String reverseStringIterator(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  

	public static void main(String[] args) {
		System.out.println(revString.reverseStringIterator("I am sonoo jaiswal")); 
		System.out.println(revString.reverseString("my name is khan")); 

	}

}
