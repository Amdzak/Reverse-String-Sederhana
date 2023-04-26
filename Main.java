//2023/04/26

// Program unutk reverse String

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("\tProgram Reverse String Sederhana");
        System.out.print("Masukan Kata : ");
        String masukan = inputUser.nextLine();

        String reverse = "";

        for (int i = masukan.length() - 1; i >= 0 ; i--) { // masukan.length()-1 berfungsi untuk mengambil banyaknya index yang ada , i>=0 kondisi akan true selama kalimatnya belum habis di kurangi, i-- pengurangan dari banyaknya index menjadi 0
            reverse += masukan.charAt(i); //Memasukan kata terkahir secara terurut menjadi pertama
        }

        System.out.println("Hasil : " + reverse);
    }
}
