/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import day1.utils.Utils;

public class Bai3 {
	public static void main(String[] args) {
		execute();
	}

	public static void execute() {
		int n = 0;
		n = Utils.getAnInteger("Please enter a integer number: ", "Enter a valid integer!");

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			int temp = 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				temp *= j;
			}

			sum += 1.0 * 1 / (temp);
		}

		System.out.println("Result: " + sum);
	}
}