/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author C-18
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Variable
        
      int nilaiA = 10;
      int nilaiB = 20;
      double desimal1 = 1.4d;
      double desimal2 = 5.204d;
      boolean isPlus = true;
       
//Output variable
       
      System.out.println("Nilai A : " + nilaiA);
      System.out.println("Nilai B : " + nilaiB);
      System.out.println("Nilai Double 1 : " + desimal1);
      System.out.println("Nilai Double 2 : " + desimal2);
      System.out.println("Boolean : " + isPlus + "\n");
      
//input
      
      Scanner input = new Scanner(System.in);  
      System.out.println("Masukan nilai baru dari nilai A : ");
      nilaiA = input.nextInt();  
      System.out.println("Masukan nilai baru dari nilai B : ");
      nilaiB = input.nextInt();   
      System.out.println("Masukan nilai baru dari nilai Double 1 : ");
      desimal1 = input.nextDouble();  
      System.out.println("Masukan nilai baru dari nilai Double 2 : ");
      desimal2 = input.nextDouble();   
      System.out.println("Masukan nilai baru dari Boolean : ");
      isPlus = input.nextBoolean();  
      
      
      
      System.out.println("Nilai A baru :" + nilaiA);
      System.out.println("Nilai B baru :" + nilaiB); 
      System.out.println("Nilai Desimal 1 baru :" + desimal1);
      System.out.println("Nilai Desimal 2 baru :" + desimal2);  
      System.out.println("Nilai B baru :" + isPlus); 
    }
    
}
