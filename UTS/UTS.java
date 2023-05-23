
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-18
 */
class datadiri{
    String Nama;
    int NIM;
    String Alamat;
    int umur;
    int tinggi_badan;
}
public class UTS {
    public static void main(String[] args) throws Exception {
        int[] interger = {1,2,10,22,67,24,43,25,16,26};
        String[] namas = {"Dimas","Restu","Kholid","Rijal","Hale"};
    
    datadiri saya;
        saya = new datadiri();
        saya.Nama = "Kevin Dwi Mahendra";
        saya.NIM = 22201204;
        saya.Alamat = "Jl. Roman Turen";
        saya.umur = 19;
        saya.tinggi_badan = 165;
        
        PrintWriter fileout = new PrintWriter("file.txt");
        for (int interger1 : interger)
            fileout.print(interger1 + ", ");
        fileout.println("");
        for (String namas1 : namas)
            fileout.print(namas1 + ", ");
        fileout.println("");
        fileout.print("Nama : " + saya.Nama + " ");
        fileout.print("Nim :" + saya.NIM + " ");
        fileout.print("Alamat :" + saya.Alamat + " ");
        fileout.print("Umur" + saya.umur + " ");
        fileout.print("Tinggi Badan :" + saya.tinggi_badan + " ");
        fileout.close();
        
        File folder = new File("D:\\uts\\file.txt");
        Scanner reader = new Scanner(folder);
            while (reader.hasNextLine()){
                String text = reader.nextLine();
                System.out.println(text);
            }
    }
            
}
