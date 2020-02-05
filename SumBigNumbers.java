package java_string_tutorials;
import java.util.Scanner;

public class SumBigNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String number1 = scan.nextLine();
        String number2 = scan.nextLine();
        
        char[] arr1 = number1.toCharArray();
        char[] arr2 = number2.toCharArray();
        
//        for (int i = 0; i < arr1.length; i++) {
//			if(arr1[i] < 47 && 58 < arr1[i]) {
//				System.out.println("Enter correct first number!");
//			}
//		}
//        for (int i = 0; i < arr2.length; i++) {
//        	if(arr1[i] < 47 && 58 < arr1[i]) {
//				System.out.println("Enter correct second number!");
//			}
//		}

		char[] sum = {};
		int num;
		int numLength = arr1.length - arr2.length;
		System.out.println(numLength);
		if(numLength >= 0) {
			for (int i = arr1.length - 1; 0 <= i; i--) {
				System.out.println(i);
				int num1 = arr1[i] - 48;
				int num2 = arr2[i] - 48;
				num = num1 + num2;
				if (num >= 10) {
					
					char asd = (char) (num % 10);
					sum[0] = asd;
				}
				System.out.println(num);
				
			}
		}
		else {
			
		}
	}
}
