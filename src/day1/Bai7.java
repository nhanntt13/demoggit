/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author PC
 */
import day1.utils.Utils;
public class Bai7 {
    public static void main(String[] args) {
		String s;
		s = input();
		reverseString(s);
		convertToUpperCase(s);
		convertToLowerCase(s);
		getOccuringChar(s);
		getSubString(s);
	}

	static String input() {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
		String result = Utils.getString("Enter a String: ", "String is required!");
		return result;
	}

	static void reverseString(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(s);
		stringBuilder.reverse();
		System.out.println("String reverse: " + stringBuilder);
	}

	static void convertToUpperCase(String s) {
		s.toUpperCase();

		System.out.println("Convert to Upper case: " + s);
	}

	static void convertToLowerCase(String s) {

		s.toLowerCase();

		System.out.println("Convert to Lower case: " + s);
	}

	static void getOccuringChar(String str) {
		// Create an array of size 256 i.e. ASCII_SIZE
		int count[] = new int[256];

		int len = str.length();

		// Initialize count array index
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		// Create an array of given String size
		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				// If any matches found
				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	static void getSubString(String s) {
		System.out.print("Enter n: ");
		int n = Utils.getAnInteger("Please enter a integer number: ", "Enter a valid integer!");
		System.out.print("Enter m: ");
		int m = Utils.getAnInteger("Please enter a integer number: ", "Enter a valid integer!");
		System.out.println("Sub String of " + s + " from " + n + " to " + m + " is: " + s.substring(n, m));
	}

}
    
