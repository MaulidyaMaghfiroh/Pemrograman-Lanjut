package PemrogramanLanjut;

public class SegiEmpat {
    private double panjang;
    private double lebar;

    public void segiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungDiagonal() {
        return Math.sqrt(panjang * panjang + lebar * lebar);
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    
}