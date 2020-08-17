/*
 * NhanNTT13
 * 
 */
package day1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Bai2 {
    public static void main(String[] args){
    int n;
    float sum = 0;
    Scanner sc= new Scanner(System.in);
    DecimalFormat de= new DecimalFormat("#.##");
    do{
        System.out.println("Enter n: ");
        n= sc.nextInt();
    }while(n<1);
    for(int i=1;i<=n;i++){
        sum += (float) 1/i;
    }
    
    System.out.println("Sum=" + de.format(sum));
    
    }
    
}
