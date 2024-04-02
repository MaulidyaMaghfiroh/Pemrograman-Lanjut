package PemrogramanLanjut;

public class Lingkaran {
    private double r;

    public void setJariJari(int radius) {
        r = radius;
    }

    public double getLuas() {
        return Math.PI * r * r;

    }
}
