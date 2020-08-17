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

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		execute();
	}

	public static void execute() {
		int n = Utils.getAnInteger("Please enter a integer number: ", "Enter a valid integer!");
		char[] result = convertDecimalToBinary(n);
		System.out.println(n + " in (10) is ");
		for (int i = result.length - 1; i >= 0; i--)
			System.out.print(result[i]);
		System.out.println(" in (2)!");
	}

	public static char[] convertDecimalToBinary(int n) {
		String s = "";
		do {
			s += n % 2;
			n /= 2;
		} while (n > 0);
		return s.toCharArray();
	}
}