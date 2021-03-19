package StringsPrograms;

public class reverseToggleWordInString {
	
	public static String reverseToggle(String str){  
	    String words[]=str.split("\\s");  
	    String reverseToggle="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        String first=sb.substring(0,1);  
	        String afterfirst=sb.substring(1);  
	        reverseToggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return reverseToggle.trim();  
	}  

	public static void main(String[] args) {
		System.out.println(reverseToggleWordInString.reverseToggle("my name is vinod"));  
	    System.out.println(reverseToggleWordInString.reverseToggle("I am pucharatti samudra manthan")); 
		
	}

}
