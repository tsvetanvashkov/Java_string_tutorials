package java_string_tutorials;
import java.util.Scanner;

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String search = sc.next();
        int output = 0;
        text = text.toLowerCase();
        for (int i = 0; i <= text.length() - search.length(); i++) {
			if(search.equals(text.substring(i, i + search.length()))) {
				output++;
			}
		}
        System.out.println(output);
        
        sc.close(); 
	}

}
