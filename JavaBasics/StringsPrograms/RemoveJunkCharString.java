package StringsPrograms;

public class RemoveJunkCharString {

	public static void main(String[] args) {
		String astr = "Y^%^*%&*^*(&*(Pankaj";
		astr=astr.replaceAll("[^A-Z,a-z,0-9]", "");
		System.out.println(astr);

	}

}
