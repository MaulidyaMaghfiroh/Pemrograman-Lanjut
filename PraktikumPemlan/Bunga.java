package PraktikumPemlan;

public class Bunga {
    private String Nama;
    private String Warna;
    private String Jenis;
   
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setWarna(String Warna){
        this.Warna = Warna;
    }
    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }
    public void printOut (){
        System.out.println("Nama Bunga ini adalah " + Nama);
        System.out.println("Warna Bunga ini adalah " + Warna);
        System.out.println("Jenis Bunga ini adalah " + Jenis);
    }

    public String Bermekaran(){
        return (Nama + Warna + Jenis + " Bermekaran");
    } 
    public void Harum(){
        System.out.println( Nama + Warna  + Jenis  + " Harum");
    }
    public void Bertangkai(){
        System.out.println(Nama + Warna + Jenis + " Bertangkai");
    }
    
}

