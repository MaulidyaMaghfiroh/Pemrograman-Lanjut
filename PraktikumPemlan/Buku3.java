package PraktikumPemlan;

public class Buku3 {
        String judul, penulis, kategori, sinopsis;
        int tahunterbit;
        double harga, terjual;
    
        Buku3() {
        }
    
        Buku3(Buku3 x) {
            this.copy(x);
        }
    
        public double cek(Buku3 other) {
            double sama = 0.0;
            int total = 5;
    
            if (this.kategori.equals(other.kategori)) {
                sama += 1;
            }
            if (this.judul.equals(other.judul)) {
                sama += 1;
            }
            if (this.penulis.equals(other.penulis)) {
                sama += 1;
            }
            if (this.tahunterbit == other.tahunterbit) {
                sama += 1;
            }
            if (this.sinopsis.equals(other.sinopsis)) {
                sama += 1;
            }
            if (this.harga == other.harga) {
                sama += 1;
            }
            if (this.terjual == other.terjual) {
                sama += 1;
            }
    
            double persentaseKesamaan = (sama / total) * 100;
    
            return persentaseKesamaan;
        }
    
        public double royalti(double harga, double terjual) {
            double royalti = 0.1 * harga * terjual;
            return royalti;
        }
    
        public double presentase(double harga, double terjual) {
            double presentase = royalti(harga, terjual) / (harga * terjual) * 100;
            return presentase;
        }
    
        public double pendapatan(double harga, double terjual) {
            double pendapatan = harga * terjual;
            return pendapatan;
        }
    
        public int hitungKata() {
            String[] kata = sinopsis.split("\\s+");
            return kata.length;
        }
    
        public void setBuku(String kategori, String judul, String penulis, int tahunterbit, String sinopsis, int harga,
                double terjual) {
            this.kategori = kategori;
            this.judul = judul;
            this.penulis = penulis;
            this.tahunterbit = tahunterbit;
            this.sinopsis = sinopsis;
            this.harga = harga;
            this.terjual = terjual;
    
        }
    
        public void copy(Buku3 x) {
            this.kategori = x.kategori;
            this.judul = x.judul;
            this.penulis = x.penulis;
            this.tahunterbit = x.tahunterbit;
            this.sinopsis = x.sinopsis;
            this.harga = x.harga;
            this.terjual = x.terjual;
        }
    
    
        public void printInfo() {
            System.out.println("Kategori: " + kategori);
            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Tahun Terbit: " + tahunterbit);
            System.out.println("Sinopsis: " + sinopsis);
            System.out.println("Berapa kata sinopsisnya : " + hitungKata());
            System.out.println("Harga buku " + judul + " adalah : Rp." + harga);
            System.out.printf("Buku ini dalam bulan ini terjual sebanyak : %.0f\n", terjual);
            System.out.println("Pendapatan dari buku ini adalah Rp." + pendapatan(harga, terjual));
            System.out.printf("Royalti : %.0f%% dari penjualan buku %s adalah Rp.%.1f\n", presentase(harga, terjual), judul,
                    royalti(harga, terjual));
            System.out.println();
        }
    
    }