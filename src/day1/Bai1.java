/*
 *NhanNTT13
 */
package day1;

import java.util.Scanner;
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.print("n= ");
        n = sc.nextInt();
        for(i=0;i<n;i++){
        for(int j=0;j<=i;j++)
            System.out.print("*");
        System.out.println("");
            }
        
    }
    
}
