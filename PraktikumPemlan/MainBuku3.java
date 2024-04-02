package PraktikumPemlan;
import java.util.Scanner;

public class MainBuku3 {
public static void main(String[] args) {
            Buku3 teknologi1 = new Buku3();
            Buku3 teknologi2 = new Buku3();
            Buku3 teknologi3 = new Buku3();
            Buku3 teknologi4 = new Buku3();
            Buku3 teknologi5 = new Buku3();
            Buku3 teknologi6 = new Buku3(teknologi5);


            Buku3 filsafat1 = new Buku3();
            Buku3 filsafat2 = new Buku3();
            Buku3 filsafat3 = new Buku3();
            Buku3 filsafat4 = new Buku3();
            Buku3 filsafat5 = new Buku3();

            Buku3 sejarah1 = new Buku3();
            Buku3 sejarah2 = new Buku3();
            Buku3 sejarah3= new Buku3();
            Buku3 sejarah4 = new Buku3();
            Buku3 sejarah5 = new Buku3();

            Buku3 agama1 = new Buku3();
            Buku3 agama2 = new Buku3();
            Buku3 agama3 = new Buku3();
            Buku3 agama4 = new Buku3();
            Buku3 agama5 = new Buku3();

            Buku3 psikologi1 = new Buku3();
            Buku3 psikologi2 = new Buku3();
            Buku3 psikologi3 = new Buku3();
            Buku3 psikologi4 = new Buku3();
            Buku3 psikologi5 = new Buku3();

            Buku3 politik1 = new Buku3();
            Buku3 politik2 = new Buku3();
            Buku3 politik3 = new Buku3();
            Buku3 politik4 = new Buku3();
            Buku3 politik5 = new Buku3();

            Buku3 fiksi1 = new Buku3();
            Buku3 fiksi2 = new Buku3();
            Buku3 fiksi3 = new Buku3();
            Buku3 fiksi4 = new Buku3();
            Buku3 fiksi5 = new Buku3();
            



            


    teknologi1.setBuku("Teknologi", "The Circle","Dave Eggers", 2013, "menjelaskan bagaimana cara membangkitkan pikiran bawah sadar pada diri sendiri.", 35000, 5) ;
    teknologi2.setBuku("Teknologi", "The Circle","Dave Eggers", 2013, "menjelaskan bagaimana cara membangkitkan pikiran bawah sadar pada diri sendiri.", 35000, 5) ;
    teknologi3.setBuku("Teknologi", "The Circle","Dave Eggers", 2013, "menjelaskan bagaimana cara membangkitkan pikiran bawah sadar pada diri sendiri.", 35000, 5) ;
    teknologi4.setBuku("Teknologi", "The Circle","Dave Eggers", 2013, "menjelaskan bagaimana cara membangkitkan pikiran bawah sadar pada diri sendiri.", 35000, 5) ;
    teknologi5.setBuku("Teknologi","The World is Brow","Thomas L.Friedmen", 2005, "memberikan gambaran yang begitu jelas tentang sejarah dunia klasik mulai zaman Yunani hingga Perang Dunia", 60000, 8);
    teknologi6.copy(teknologi5);
    filsafat1.setBuku("Filsafat", "Dunia Sophie"," Jostein Gaarder,", 1996, "mengisahkan terkait sejarah Filsafat mulai dari abad sebelum zaman Socrates, kemudian zaman Socrates, Plato, dan Aristoteles",  50000, 7);
    filsafat2.setBuku("Filsafat","The Prince","Firenze Niccolo", 1532, "Seorang Penguasa yang bijaksana harus membangun kekuasaannya berdasarkan apa yang ia sendiri kuasai",  40000, 8);
    filsafat3.setBuku("Filsafat","The Prince","Firenze Niccolo", 1532, "Seorang Penguasa yang bijaksana harus membangun kekuasaannya berdasarkan apa yang ia sendiri kuasai",  40000, 8);
    filsafat4.setBuku("Filsafat","Madilog","Iljas Hussein", 1943, "bahwa segala sesuatu berawal dari materi MADILOG memaparkan dengan sangat mempesona bahwa Logika di bentuk dalam iklim Dialektik sedangkan keduanya ( Dialektika dan Logika) bergantung pada Material.", 80000, 6);
    filsafat5.setBuku("Filsafat","The Passions of the Soul","Rene Descartes", 1649, "kontribusi terbesarnya dalam debat ini. Buku ini berisi diskusi mendalam tentang cara kerja emosi dan tempatnya dalam kehidupan",100000, 3);
    sejarah1.setBuku("Sejarah","The Secret History of the World","Jonathan Black", 2007, "sejarah dunia yang disembunyikan serta mengupas misteri-misteri dunia yang kontroversial dan sering diperbincangkan seperti Mitologi Yunani dan Mesir Kuno.", 45000, 10);
    sejarah2.setBuku("Sejarah","Pengantar Sejarah Kebudayaan Indonesia","Soekmono", 1973, "mengkaji tentang kebudayaan yang berkembang di Indonesia. Kajian kebudayaan Indonesia dimulai dengan pemahaman terhadap konsep-konsep kebudayaan, perkembangan sejarah kebudayaan Indonesia, dan bagaimana karakteristik kebudayaan Indonesia.", 125000, 9);
    sejarah3.setBuku("Sejarah","Pengantar Sejarah Kebudayaan Indonesia","Soekmono", 1973, "mengkaji tentang kebudayaan yang berkembang di Indonesia. Kajian kebudayaan Indonesia dimulai dengan pemahaman terhadap konsep-konsep kebudayaan, perkembangan sejarah kebudayaan Indonesia, dan bagaimana karakteristik kebudayaan Indonesia.", 125000, 9);
    sejarah4.setBuku("Sejarah","Race et histoire","Claude Levi-Strauss", 1952, "keragaman budaya, tempat peradaban Barat dalam perkembangan sejarah dan peran kebetulan.", 40000, 2);
    sejarah5.setBuku("Sejarah","The History of Sumatra","William Marsden", 1783, "menceritakan tentang karakteristik geografis wilayah Sumatera, mulai dari udara, metereologi, iklim, kondisi tanah dan lain-lain, kondisi penduduk", 25000, 6);
    agama1.setBuku("Agama","Secrets of Divinde Love","A.Helwa", 2020, "Draws upon the spiritual secrets of the Qu'ran, mystical poetry and stories from the world's greatest prophets and spiritual masters to help you reignite your faith, overcome your doubts and deepen your connection with God", 60000, 5);
    agama2.setBuku("Agama","Kun Bil Qur'ani","Saihul Basyir", 2019, "Ditutup dengan kisah-kisah nyata para bintang Al-Qur'an yang sesungguhnya.", 75000, 8);
    agama3.setBuku("Agama","Daily Dose of Light","A.Fuadi", 2015, "penuh dengan ilustrasi yang asyik dan kutipan-kutipan ayat Al-Quran yang bisa jadi mood booster kamu sehari-hari", 30000, 7);
    agama4.setBuku("Agama","Maaf Tuhan, Aku Hampir Menyerah","Alfial Ghazi", 2009, "membahas mengenai lika-liku perjalanan manusia yang tidak selamanya berjalan dengan baik",90000, 8);
    agama5.setBuku("Agama","The Miracle of Ikhlas","Anin DP", 2010, "Buku ini mencoba menguak mukjizat yang tersimpan dalam kekuatan ikhlas. Sedahsyat apa kekuatan ikhlas yang mampu meruntuhkan tembok kedurjanaan.", 35000, 6);
    psikologi1.setBuku("Psikologi","The Art of Choosing","Sheena Iyengar", 2010, "Dalam hidup, memilih sesuatu adalah hal yg harus dihadapi secara sadar. Mulai memilih yang baik dan buruk, pilih barang mewah atau murah",  200000, 7);
    psikologi2.setBuku("Psikologi","The Power of Habit","Charles Duhigg", 2012, " Dahsyatnya kebiasaan. Di dalam Pimtar ini Anda akan mempelajari tentang alasan kebiasaan terbentuk", 90000, 8);
    psikologi3.setBuku("Psikologi","Thinking,Fast and Slow","James Clear", 2011, "Membahas tentang dua sistem kognitif manusia yang membentuk cara berpikir dan bias kognitif", 65000, 4);
    psikologi4.setBuku("Psikologi","Psychology Of Communication","Jalaluddin Rakhmat", 1985, "mengantarkan mahasiswa memahami ruang lingkup psikologi komunikasi, karakteristik manusia komunikan", 90000, 7);
    psikologi5.setBuku("Psikologi","Atomic Habits","James Clear", 2018, "kisah-kisah inspiratif para peraih medali emas Olimpiade, para CEO terkemuka, dan ilmuwan-ilmuwan istimewa yang telah menggunakan sains tentang kebiasaan-kebiasaan kecil untuk tetap produktif, tetap termotivasi, dan bahagia.", 200000, 4);
    politik1.setBuku("Politik","Percakapan Politik","A. Sudiarjo", 2023,"merupakan sebuah refleksi yang mengetengahkan persoalan-persoalan sosial dan politik, baik menyangkut Indonesia maupun dunia.", 125000,15);
    politik2.setBuku("Politik","Mengadvokasi","Hendardi", 2023, "merupakan bunga rampai yang secara khusus disusun untuk merekam pembelaan yang dilakukan oleh Hendardi atas hak-hak sipil-politik sejak dahulu", 105000, 8);
    politik3.setBuku("Politik","Dramaturgi Politik Indonesia","A Muhaimin Iskandar", 2023, "patut dibaca untuk menambah khazanah perkembangan komunikasi politik, khususnya bagi kalangan peminat ilmu politik", 35000, 2);
    politik4.setBuku("Politik","Negara dan Politik Kesejahteraan","Muhamad Sulhan", 2023, "Negara dengan segala sumber daya yang dimiliki harus menjamin kesejahteraan seluruh anak bangsa", 85000,9);
    politik5.setBuku("Politik","Keadaban Politik","Luthfi J.Kurniawan", 2011, " catatan kritis terhadap dekadensi moral politik dan political will yang disajikan dengan ulasan hangat dan tajam.",  250000, 2);
    fiksi1.setBuku("Fiksi","The Song of Achilles","Madeline Miller", 2017, "mengisahkan kembali legenda perang Troya. Namun, pembahasan di novel ini jauh lebih dalam daripada perang Troya itu saja. Novel The Song of Achilles berani merombak citra sang pahlawan legendaris, Achilles, serta mendefinisikan ulang terkait maskulinitasnya", 90000, 8);
    fiksi2.setBuku("Fiksi","The Sea Speaks His Name","Leila Chudori", 2021, "kisah keluarga yang kehilangan, sekumpulan sahabat yang merasakan kekosongan di dada, sekelompok orang yang gemar menyiksa dan lancar berkhianat, sejumlah keluarga yang mencari kejelasan makam anaknya, dan tentang cinta yang tak akan luntur.", 95000, 7);
    fiksi3.setBuku("Fiksi","Hilmy Milan","Nadia Ristivani", 2021, " mengisahkan tentang seorang gadis bernama Helga yang juga merupakan seorang penulis. Di mana ketika ia memiliki kisah patah hati, ia akan menuangkannya dalam bukunya.",  100000, 4);
    fiksi4.setBuku("Fiksi","About You","Tere Liye", 2016, "membagi cerita novelnya ke dalam lima juz, yakni kesabaran, persahabatan, keteguhan hati, cinta, dan memeluk semua rasa sakit.",100000, 9);
    fiksi5.setBuku("Fiksi","The Magician's Nephew","C.S. Lewis", 1995, " novel fantasi yang menceritakan kisah Profesor Digory Kirke si pemilik lemari kayu ajaib.", 120000, 6);

    teknologi1.printInfo();
    teknologi2.printInfo();
    teknologi3.printInfo();
    teknologi4.printInfo();
    teknologi5.printInfo();
    teknologi6.printInfo();
    filsafat1.printInfo();
    filsafat2.printInfo();
    filsafat3.printInfo();
    filsafat4.printInfo();
    filsafat5.printInfo();
    sejarah1.printInfo();
    sejarah2.printInfo();
    sejarah3.printInfo();
    sejarah4.printInfo();
    sejarah5.printInfo();
    agama1.printInfo();
    agama2.printInfo();
    agama3.printInfo();
    agama4.printInfo();
    agama5.printInfo();
    psikologi1.printInfo();
    psikologi2.printInfo();
    psikologi3.printInfo();
    psikologi4.printInfo();
    psikologi5.printInfo();
    politik1.printInfo();
    politik2.printInfo();
    politik3.printInfo();
    politik4.printInfo();
    politik5.printInfo();
    fiksi1.printInfo();
    fiksi2.printInfo();
    fiksi3.printInfo();
    fiksi4.printInfo();
    fiksi5.printInfo();
    double kesamaan = teknologi1.cek(psikologi3);
    System.out.println("Presentase kesamaan buku " + teknologi1.judul + " dan buku " + psikologi3.judul +" adalah " + kesamaan + "%");
}
}