/*
 * NhanNTT13
 */
package day1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai5 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhập số nguyên dương a = ");
        int a=sc.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = sc.nextInt();
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a,b));
        System.out.println("BSCNN của " + a + " và " + b +" là: " + BSCNN(a,b));
    }
    
    public static int USCLN(int a, int b){
        if(b==0) return a;
        return USCLN(b,a % b);
    }
    
    public static int BSCNN(int a,int b){
    return(a*b)/USCLN(a,b);
    } 
    
}
