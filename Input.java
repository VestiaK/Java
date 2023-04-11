import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
    System.out.println("Masukan Nilai 1: ");
    int nilai1 = input.nextInt();
    System.out.println("Masukan Nilai 2: ");
    int nilai2 = input.nextInt();
    int nilai3 = nilai1 + nilai2;
    System.out.println("Nilai 1 + Nilai 2 = " + nilai3);
    
    System.out.println("Dikerjakan oleh Kevin Dwi Mahendra + 22201204");
  }
}
