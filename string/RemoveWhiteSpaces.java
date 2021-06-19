package string;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		String str = "      Geeks For Greeks   ";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
		
	}

}
