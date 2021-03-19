package StringsPrograms;

public class reverseEachWordInString {
	
	public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}

	public static void main(String[] args) {
		System.out.println(reverseEachWordInString.reverseWord("my name is khan"));  
	    System.out.println(reverseEachWordInString.reverseWord("I am sonoo jaiswal"));    

	}

}
