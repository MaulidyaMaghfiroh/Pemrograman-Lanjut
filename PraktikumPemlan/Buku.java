package PraktikumPemlan;

public class Buku {
    private String KategoriBuku, NamaBuku, Penulis, TahunTerbit, Penerbit, ISBN, JumlahHalaman;

    public void setKategori(String KategoriBuku){
        this.KategoriBuku = KategoriBuku;
    }
    public String getKategori(){
        return KategoriBuku;
    }
    public void setNamaBuku(String NamaBuku){
        this.NamaBuku = NamaBuku;
    }
    public String getNamaBuku(){
        return NamaBuku;
    }
    public void setPenulis(String Penulis){
        this.Penulis = Penulis;
    }
    public String getPenulis(){
        return Penulis;
    }
    public void setTahun(String TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }
    public String getTahun(){
        return TahunTerbit;
    }
    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
    public String getPenerbit(){
        return Penerbit;
    }
    public void setISBNBuku(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBNBuku (){
        return ISBN;
    }
    public void setHalaman(String JumlahHalaman) {
        this.JumlahHalaman = JumlahHalaman;
    }
    public String getHalaman(){
        return JumlahHalaman;
    }
    public void tampilkanKategori(){
        System.out.printf("============|KATEGORI BUKU %s|============\n", KategoriBuku);
    }
    public void tampilkan(){
        System.out.printf("1. Nama Buku      : %s \n", getNamaBuku());
        System.out.printf("2. Nama Penulis   : %s \n", getPenulis());
        System.out.printf("3. Tahun Terbit   : %s \n", getTahun());
        System.out.printf("4. Penerbit       : %s \n", getPenerbit());
        System.out.printf("5. ISBN           : %s \n", getISBNBuku());
        System.out.printf("6. Jumlah Halaman : %s \n", getHalaman());
        System.out.println();
    }
}