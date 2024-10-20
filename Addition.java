/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nauma
 */
import java.util.Scanner;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Enter Two Numbers");
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt();
       int sum=a+b;
       System.out.println("Sum="+sum);
    }
    
}
