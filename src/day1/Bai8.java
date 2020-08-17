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

import java.util.ArrayList;
import java.util.Scanner; 
import org.jcp.xml.dsig.internal.dom.Utils;

public class Bai8 {
    public static void main(String[] args) {
		int size = Utils.getAnInteger("Enter Integer Array size: ", "Please enter a valid integer",
				"Please enter size > 0");
		int intArray[] = new int[size];
		inputArray(intArray);
		System.out.println("Sum of even positive number in Array is: " + sumOfPositiveNumber(intArray));
		System.out.println();
		checkExistNumber(intArray);
		sortArrayInAscending(intArray);
		intArray = inputNewValueToArray(intArray);
		System.out.println("New array after insert new value: ");
		for (int i : intArray)
			System.out.print(i + " ");
		System.out.println();
	}

	private static int[] inputNewValueToArray(int[] intArray) {
		// TODO Auto-generated method stub
		int result[] = new int[intArray.length + 1];
		for (int i = 0; i < intArray.length; i++)
			result[i] = intArray[i];
		int newValue = Utils.getAnInteger("Enter new value: ", "Please enter a valid integer");
		for (int i = 0; i < result.length; i++) {
			if (newValue <= result[i]) {
				for (int j = result.length - 1; j > i; j--) {
					result[j] = result[j - 1];
				}
				result[i] = newValue;
				break;
			}
		}

		return result;
	}

	private static void inputArray(int[] intArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Utils.getAnInteger("Enter a[" + i + "]: ", "Please enter a valid integer");
		}
	}

	private static int sumOfPositiveNumber(int[] intArray) {
		// TODO Auto-generated method stub
		int result = 0;
		for (int i : intArray) {
			if (i % 2 == 0 && i >= 0)
				result += i;
		}

		return result;
	}

	private static void checkExistNumber(int[] intArray) {
		// TODO Auto-generated method stub
		int n = Utils.getAnInteger("Enter n: ", "Please enter a valid integer");
		ArrayList<Integer> pos = new ArrayList<Integer>();
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == n)
				pos.add(i);
		}

		if (pos.isEmpty())
			System.out.println(n + " does not exist in array!");
		else {
			System.out.print(n + " exist in position: ");
			for (int i = 0; i < pos.size(); i++)
				System.out.print(pos.get(i) + " ");
		}
		System.out.println("\n");
	}

	private static void sortArrayInAscending(int[] intArray) {
		// TODO Auto-generated method stub
		for (int i = 0; i < intArray.length - 1; i++)
			for (int j = i + 1; j < intArray.length; j++)
				if (intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}

		System.out.println("Sort in Ascending: ");
		for (int i : intArray)
			System.out.print(i + " ");
		System.out.println("\n");
	}
    
}
