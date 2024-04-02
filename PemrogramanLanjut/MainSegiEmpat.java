package PemrogramanLanjut;

import java.util.Scanner;

public class MainSegiEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        

        SegiEmpat segiempat = new SegiEmpat ();
        segiempat.segiEmpat(panjang,lebar);
        double keliling = segiempat.hitungKeliling();
        double luas = segiempat.hitungLuas();
        double diagonal = segiempat.hitungDiagonal();
        
        System.out.println("Keliling: " + keliling);
        System.out.println("Luas: " + luas);
        System.out.printf("Diagonal: %.3f " , diagonal);
    }
}