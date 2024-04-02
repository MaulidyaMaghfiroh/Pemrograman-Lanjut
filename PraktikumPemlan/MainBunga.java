package PraktikumPemlan;

public class MainBunga {
    public static void main(String[] args) {
        Bunga Bunga1 = new Bunga();
        Bunga1.setNama("Mawar");
        Bunga1.setWarna(" Merah Muda");
        Bunga1.setJenis(" Grandiflora");
        
        Bunga1.printOut();

        System.out.println(Bunga1.Bermekaran());
        Bunga1.Harum();
        Bunga1.Bertangkai();

        Bunga Bunga2 = new Bunga();
        Bunga2.setNama("Tulip");
        Bunga2.setWarna(" Merah");
        Bunga2.setJenis(" Tulip Darwin");
        
        Bunga2.printOut();

        System.out.println(Bunga2.Bermekaran());
        Bunga2.Harum();
        Bunga2.Bertangkai();
        
        Bunga Bunga3 = new Bunga();
        Bunga3.setNama("Anggrek");
        Bunga3.setWarna(" Ungu");
        Bunga3.setJenis(" Phalaenopsis");
        
        Bunga3.printOut();

        System.out.println(Bunga3.Bermekaran());
        Bunga3.Harum();
        Bunga3.Bertangkai();
        
}

}
