package PemrogramanLanjut;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan Kendaran1 = new Kendaraan();
        Kendaran1.setMerk("Honda");
        Kendaran1.setWarna(" Putih");
        Kendaran1.setPlatNomor(" N 2325 XX");
        
        Kendaran1.printOut();

        System.out.println(Kendaran1.Maju());
        Kendaran1.Maju();
        Kendaran1.Mundur();
        Kendaran1.Berhenti();
        Kendaran1.Belok();
        


        
        
    }
}
