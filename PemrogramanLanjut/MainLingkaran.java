package PemrogramanLanjut;

import java.util.Scanner;

public class MainLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan jari-jari lingkaran: ");

        int radius = input.nextInt();
        lingkaran.setJariJari(radius);
        
        double luas = lingkaran.getLuas();
        System.out.printf("Luas lingkaran adalah: %.3f", luas);
    }
}