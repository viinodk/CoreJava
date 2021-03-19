package StringsPrograms;

public class revStringWhole {
	
	/*By using String Builder / StringBuffer*/
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	public static void main(String a[])
	{
		System.out.println(revString.reverseStringIterator("Kiran")); 
	}

}
