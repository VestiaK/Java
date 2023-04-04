/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author C-18
 */
public class TipeData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // Variable
        byte variableTipeByte = 15;
        short variableTipeShort = 200;
        int variableTipeInt = 1000;
        long variableTipeLong = 10L;
        float variableTipeFloat = 6.23f;
        double variableTipedouble = 2.5232;

        char variableTipechar = 'C';

        boolean variableTipeboolean = true;
        
    // Output Data
    
        System.out.println("Tipe Data Numerik");
        System.out.println("Byte : " + variableTipeByte);
        System.out.println("Short : " + variableTipeShort);
        System.out.println("Int : " + variableTipeInt);
        System.out.println("Long : " + variableTipeLong);
        System.out.println("Float : " + variableTipeFloat);
        System.out.println("Double : " + variableTipedouble);

        System.out.println("\nTipe Data Karakter");
        System.out.println("char : " + variableTipechar);

        System.out.println("\nTipe Data Boolean ");
        System.out.println("Boolean : " + variableTipeboolean);
    
    // Memasukan nilai dengan variable    
        
        System.out.println("\nMasukan nilai untuk variale byte: ");
        variableTipeByte = input.nextByte();

        System.out.println("\nMasukan nilai untuk variale Short: ");
        variableTipeShort = input.nextShort();

        System.out.println("\nMasukan nilai untuk variale Int: ");
        variableTipeInt = input.nextInt();

        System.out.println("\nMasukan nilai untuk variale Long: ");
        variableTipeLong = input.nextLong();

        System.out.println("\nMasukan nilai untuk variable FLoat: ");
        variableTipeFloat = input.nextFloat();

        System.out.println("\nMasukan nilai untuk variable Double: ");
        variableTipedouble = input.nextDouble();

        System.out.println("\nMasukan nilai untuk variable Char: ");
        variableTipechar = input.next().charAt(0);

        System.out.println("\nMasukan nilai untuk variable Boolean: ");
        variableTipeboolean = input.nextBoolean();

    // Output dari inputan     
        
        System.out.println("\nTipe Data Numerik setelah dimanipulasi");
        System.out.println("Byte: " + variableTipeByte);
        System.out.println("Short: " + variableTipeShort);
        System.out.println("Int: " + variableTipeInt);
        System.out.println("Long: " + variableTipeLong);
        System.out.println("Float: " + variableTipeFloat);
        System.out.println("Double: " + variableTipedouble);
        System.out.println("\nTipe Data Karakter");
        System.out.println("Char: " + variableTipechar);
        System.out.println("\nTipe Data Boolean");
        System.out.println("Boolean: " + variableTipeboolean);

    }
}
