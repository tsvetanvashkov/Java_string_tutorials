package java_string_tutorials;

import java.util.Scanner;

public class TagContentExtractor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
			String startTag = "</";
			String tag1 = "";
			String tag2 = "";
			String str = "";
			
			if(line.contains(startTag)) {
				while(line.contains(startTag)) {
					tag2 = line.substring(line.indexOf(startTag), line.indexOf('>', line.indexOf(startTag)) + 1);
					tag1 = tag2.replace("/", "");
					if(line.contains(tag1)) {
						str = line.substring(line.lastIndexOf(tag1, line.indexOf(tag2)) + tag1.length(), line.indexOf(tag2));
						if((str.isEmpty() != true) && (str.contains("#") != true) && (tag2.substring(2, tag2.length()-1).isEmpty() != true)) {
							System.out.println(str);
						}
						if((str.isEmpty() == true)) {
							System.out.println("None");
						}
						
						str = tag1.concat(str + tag2);
						//System.out.println(str);
						line = line.replaceFirst(str, "#");
						//System.out.println(tag2);
						//System.out.println(line);
						//System.out.println(line.length());
					}
					else {
						System.out.println("None");
						line = line.replaceFirst(tag2, "#");
					}
				}
			}
			else {
				System.out.println("None");
			}
			if((line.length() == 1) && (tag2.length() == 3)) {
				System.out.println("None");
			}
		/*
			String [] arr = line.split("<");
			for (String str : arr) {
			System.out.println(str);
			}
			
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].indexOf("/") == 0) {
					String tag = arr[i].substring(1, arr[i].length());
					if(arr[i-1].contains(tag)) {
						arr[i-1] = arr[i-1].replaceFirst(tag, "");
						if(arr[i-1].indexOf("/") != 0) {
							System.out.println(arr[i-1]);
						}
					}
					else {
						System.out.println("None");
					}
				}
			}
			*/
			
			/*
			String tag = line.substring(line.indexOf('<') + 1, line.indexOf('>') +1);
			
			if(line.contains("</" + tag)) {
				line = line.replaceFirst("<" + tag, "");
				line = line.replaceFirst("</" + tag, "");
				//System.out.println(line);
			}
			else {
				System.out.println("None");
			}
			*/		
			testCases--;
		}
	}

}
