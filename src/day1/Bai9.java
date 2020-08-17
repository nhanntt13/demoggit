/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;
import java.util.*;
/**
 *
 * @author PC
 */
public class Bai9 {
    public static void main(String[] args){
        int rows = utils.getAninteger("Enter size of rows: ","Please enter a valid integer","Please enter row>0");
        int cols = Utils.getAnInteger("Enter size of col: ","Please enter a valid integer","Please enter col>0");
        int [][] matrix = new int[rows][cols];
        inputMatrix(matrix,rows,cols);
        
        System.out.println("\nMatrix: ");
        outputMatrix(matrix,rows,cols);
        System.out.println();
        
        System.out.println("Sum of multiple of 3 in first row is: " + sumOfMunltipleThreeInFirstRow(matrix,row,cols) +"\n");
        int[] x= getHighestValueOfEachRow(matrix,rows,cols);
        
        System.out.println("Result of X: ");
        for(int i : x){
            System.out.print(i +" ");
        }
        System.out.println("\n");
     }
    
    private static int[] getHighestValueOfEachRow(int[][] matrix, int rows, int cols){
        int[] x= new int[rows];
        for(int i = 0;i<rows;i++){
            int max = matrix[i][0];
            for(int j = 1;j<cols;j++)
                if(max < matrix[i][j])
                    max = matrix[i][j];
            x[i] = max;
        }
        return x;
    }
    
    private static void inputMatrix(int[][] matrix, int rows, int cols){
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                matrix[i][j] = Utils.getAnInteger("Enter a[" + i + "][" + j +"]","Please enter a valid integer");
    }
    
    private static void outputMatrix(int[][] matrix, int rows,)
}
