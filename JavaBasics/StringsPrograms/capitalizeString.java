package StringsPrograms;

public class capitalizeString {
	
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  

	public static void main(String[] args) {
		System.out.println(capitalizeString.capitalizeWord("my name is baba creations"));  
	    System.out.println(capitalizeString.capitalizeWord("I am sonoo jaiswal"));
	}

}
