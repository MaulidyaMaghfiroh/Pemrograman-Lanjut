package PemrogramanLanjut;

public class Kendaraan {
    private String Merk;
    private String Warna;
    private String PlatNomor;
   
    public void setMerk(String Merk){
        this.Merk = Merk;
    }
    public void setWarna(String Warna){
        this.Warna = Warna;
    }
    public void setPlatNomor(String PlatNomor){
        this.PlatNomor = PlatNomor;
    }
    public void printOut (){
        System.out.println("Merk kendaraan ini " + Merk);
        System.out.println("Warna kendaraan ini " + Warna);
        System.out.println("PlatNomor kendaraan ini " +PlatNomor);
    }

    public String Maju(){
        return (Merk + Warna + PlatNomor + " Maju");
    } 
    public void Mundur(){
        System.out.println(Merk + Warna  + PlatNomor  + " Mundur");
    }
    public void Berhenti(){
        System.out.println(Merk + Warna + PlatNomor + " Berhenti");
    }
    public void Belok(){
        System.out.println(Merk + Warna + PlatNomor + " Belok");
    }
}
