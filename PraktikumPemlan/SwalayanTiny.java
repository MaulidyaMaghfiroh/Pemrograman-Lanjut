package PraktikumPemlan;

import java.util.Scanner;

public class SwalayanTiny {
    Scanner input = new Scanner(System.in);
    private String nama, nomorpelanggan, nomor[];
    private int pembelian, pem, total, saldo, topsaldo,pin, ulang, nopel,totalsaldo; 
    int[] saldoAtm = new int[]{1500000, 2000000,2500000}; 
    public SwalayanTiny() {
     }
    public SwalayanTiny(int pn, String pelanggan) {
    nomorpelanggan = pelanggan;
    pin = pn;
}
public int getnopel(){
    nomor = nomorpelanggan.split("");
    nopel = Integer.parseInt(nomor[0] + "" + nomor[1]);
    return nopel;
}
public int getsaldo(){
    getnopel();
    if(nopel==38){
    saldo=saldoAtm[0];}
    else if(nopel==56){
    saldo=saldoAtm[1];}
    else if(nopel==74){
    saldo=saldoAtm[2];}
    return saldo;
}
    public String Login(int pn) {
        getnopel();
        if (nopel == 38 && pin == 123456) {
        System.out.println("Nama: Maulidya I'tikaf Maghfiroh");
        System.out.println("Nomer pelanggan: " + nomorpelanggan);
        System.out.println("Jenis Kartu: Pelanggan kartu Silver");
    } else if (nopel == 56 && pin == 789101) {
        System.out.println("Nama: Kevin");
        System.out.println("Nomer pelanggan: " + nomorpelanggan);
        System.out.println("Jenis Kartu: Pelanggan kartu Gold");
    } else if (nopel == 74 && pin == 567898) {
        System.out.println("Nama: Angel");
        System.out.println("Nomer pelanggan: " + nomorpelanggan);
        System.out.println("Jenis Kartu: Pelanggan kartu Platinum");
    } else {
        int i = 0;
        while (!(pn == pin) && i <2 || pn == pin)
         {System.out.print("Maaf, pin anda salah.\nSilahkan ulangi :");
         ulang = input.nextInt();
         if (nopel == 38 && ulang == 123456) {
            System.out.println("Nama: Maulidya I'tikaf Maghfiroh");
            System.out.println("Nomer pelanggan: " + nomorpelanggan);
            System.out.println("Jenis Kartu: Pelanggan kartu Silver");
            saldo=saldoAtm[0];
            break;
        }else if (nopel == 56 && ulang == 789101) {
            System.out.println("Nama: Kevin");
            System.out.println("Nomer pelanggan: " + nomorpelanggan);
            System.out.println("Jenis Kartu: Pelanggan kartu Gold");
            saldo=saldoAtm[1]; 
            break;
        } else if (nopel == 74 && ulang == 567898){
            System.out.println("Nama: Angel");
            System.out.println("Nomer pelanggan: " + nomorpelanggan);
            System.out.println("Jenis Kartu: Pelanggan kartu Platinum");
            saldo=saldoAtm[2];break; 
        }if (i == 1 && pn != pin) {
            System.out.println("User ID anda diblok");
            System.out.println("===========================================================");
            System.exit(0);
        }
        i++;
    }}return nomorpelanggan;
        }
        public int totalPembelian(int pembelian) {
            System.out.println("Total Pembelian :Rp " + pembelian);
            return pembelian;
        }
        public int getCashBack(int pembelian) {
            getnopel();
            getsaldo();
            if(saldo>=pembelian){
                if (nopel == 38) {
                    if (pembelian >= 1000000) {
                        pem = pembelian * 5 / 100;
                        saldo -= pembelian;
                        total = saldo + pem;
                    } else {
                        pem = 0;
                        saldo -= pembelian;
                        total = saldo + pem;
                    }
                    System.out.println("Uang kembalian ke saldo: Rp " + pem);
                } 
                else if (nopel == 56) {
                    if (pembelian >= 1000000) {
                        pem = pembelian * 7 / 100;
                        saldo -= pembelian;
                        total = saldo + pem;
                    } else {
                        pem = pembelian * 2 / 100;saldo -= pembelian;
                        total = saldo + pem;
                    }
                    System.out.println("Uang kembalian ke saldo: Rp " + pem);
                } else if (nopel == 74) {
                    if (pembelian >= 1000000) {
                        pem = pembelian * 10 / 100;
                        saldo -= pembelian;total = saldo + pem;
                    } else {
                        pem = pembelian * 5 / 100;
                        saldo -= pembelian;total = saldo + pem;
                    }
                    System.out.println("Uang kembalian ke saldo: Rp " + pem);
                }
            }else {
                System.out.println("Maaf transaksi andadibatalkan");
                System.out.println("Silahkan Top Up terlebihdahulu");
            }
            return total;
        }
        public int getTopUp(int nominal) {
            getnopel();getsaldo();
            if (nopel == 38) {
                topsaldo = saldo + nominal;
                saldoAtm[0] = topsaldo;System.out.println("Total saldo: Rp " + topsaldo);
            } else if (nopel == 56) {
                topsaldo = saldo + nominal;
                saldoAtm[1] = topsaldo;
                System.out.println("Total saldo: Rp " + topsaldo);
            } else if (nopel == 74) {
                topsaldo = saldo + nominal;
                saldoAtm[2] = topsaldo;
                System.out.println("Total saldo: Rp " + topsaldo);
            }
            return topsaldo;
        }
    }
