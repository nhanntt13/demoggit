/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai4 {
    public static void main(String[] args){
    int n,tong=0;
    System.out.println("Nhập m");
    Scanner input = new Scanner(System.in);
    n=input.nextInt();
    while(n>0){
        tong+=n%10;
        n=n/10;
    }
    System.out.println("Tổng các chữ số m là: "+tong);
    }
    
}
