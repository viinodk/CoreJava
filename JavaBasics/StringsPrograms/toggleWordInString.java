package StringsPrograms;

public class toggleWordInString {
	
	public static String toggle(String str){  
	    String words[]=str.split("\\s");  
	    String toggle="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return toggle.trim();  
	}  

	public static void main(String[] args) {
		System.out.println(toggleWordInString.toggle("my name is vinod"));  
	    System.out.println(toggleWordInString.toggle("I am pucharatti samudra manthan"));   

	}

}
