package StringsPrograms;

public class removeCharInString {
	 public static String charRemoveAt(String str, int p) {  
         return str.substring(0, p) + str.substring(p + 1);  
      }  

	public static void main(String[] args) {
		String str = "India is my country";  
        System.out.println(charRemoveAt(str, 9));

	}

}
	