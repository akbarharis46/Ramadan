package org.com.ramadan;

import java.util.ArrayList;

public class DataResep {
    private static String[] namaMakanan = {
            "Soto Ayam Lamongan",
            "Tumis Sawi Hijau dengan Ayam",
            "Bihun Siram Capcay Kekinian",
            "Balado Terong Ebi",
            "Nasi Goreng Beras Merah",
            "Cumi Goreng Saus Asam Manis",
            "Es Buah Campur",
            "Kolak Pisang Milk Tea",
            "Bubur Kacang Hijau",
            "Es Cendol Nangka",
            "Jus Mangga Yogurt Beri",
            "Teh Tarik Jelly"

    };

    private static String[] deskripsiMakanan = {
            "Soto ayam Lamongan terkenal dengan kuahnya yang gurih menyegarkan. Menu ini bisa kamu praktikkan di rumah untuk keluarga. Bukan hanya gurih, soto berkuah kuning ini menawarkan kenikmatan tiada tara ketika disandingkan dengan nasi hangat dan sambal. Jika biasanya kamu menyantap soto ayam khas Lamongan di restoran atau pedagang kaki lima, kali ini kita buat sendiri, yuk!",
            "Salah satu resep mudah, sehat, dan nikmat untuk dicoba adalah tumis sawi hijau dengan ayam. Cukup populer di Indonesia, menu ini mudah untuk dimasak. Tidak banyak bahan yang digunakan, kamu pun tidak perlu waktu lama untuk memasaknya. Tumis sawi hijau, tambahkan potongan ayam dan menu ini dijamin membuatmu tidak berhenti mengunyah. Coba masak dengan resep ini, yuk!",
            "Bingung mau menyajikan apa untuk kumpul keluarga? Bihun siram capcay kekian adalah ide yang tepat. Sajian oriental a la restoran dengan memadukan resep capcay kuah dan bihun ini menawarkan kelezatan yang tidak bisa ditolak. Tenang, kamu bisa membuatnya sendiri di rumah sekarang. Bihun siram capcay kekian, sajian Oriental yang meriahkan acara keluargamu. Komplit namun mudah dibuat, yuk kita coba membuatnya hari ini!",
            "Balado terong ebi versi Royco ini berbeda dibandingkan dengan terong balado lain. Mengapa? Terong balado versi Royco tidak digoreng melainkan dipanggang. Selain itu kehadiran ebi yang ditambahkan ke dalam bahan balado membuat rasanya semakin mantap. Tak hanya itu, tambahan teri dan petai pasti akan membuat menu pendamping ini jadi pusat perhatian. Kombinasi balado terong ebi dengan tambahan ikan teri tentu takkan mudah untuk ditolak. Intip resepnya supaya bisa kamu praktikkan untuk minggu ini!",
            "Nasi goreng seringkali jadi guilty pleasure karena jumlah kalorinya bisa membuat badan melar. Padahal, kelezatan makanan khas Indonesia ini sudah terkenal hingga mancanegara. Disajikan hangat dengan telur mata sapi dan kerupuk, bikin nasi goreng susah ditolak! Agar tak merasa bersalah, kamu bisa mengakalinya dengan menggunakan beras merah. Nasi goreng beras merah ini memang asing terdengar, tapi dengan resep khusus kamu bisa menyulapnya jadi sajian menggugah selera.",
            "Resep cumi goreng saus asam manis ini bisa jadis inspirasi kamu sebagai lauk makan malam praktis. Yuk, belanja cumi segar! Layaknya membuat calamari goreng dengan saus tartar, kurang lebih proses Cumi Goreng Saus Asam Manis sama. Hanya saja, saus asam manis nanti akan berperan sebagai penyumbang cita rasa. Selain memotong cumi dalam bentuk bulat-bulat dan menggorengnya hingga kering, siapkan saus asam manis kental dengan buah nanas. Setelah selesai, cukup padukan keduanya deh. Segar rasanya!",
            "Es Buah Campur adalah salah satu takjil segar yang populer di bulan puasa selain kolak pisang. Keduanya seringkali hadir di meja saji buka puasa sebagai pembuka iftar. Namun, tak ada yang saklek untuk bahan utama es buah di bulan puasa. Maka, momen Ramadan dimanfaatkan untuk menyajikan es campur dari buah-buahan yang identik di bulannya. Ya, apalagi kalau bukan blewah dan timun suri yang entah mengapa selalu saja musim.",
            "Kolak pisang adalah salah satu takjil yang wajib ada di meja saji buka puasa. Selain lebih praktis, kolak pisang milk tea memberikan warna baru pada sajian buka puasa di rumah tahun ini. Salah satu tips bikin kolak pisang enak adalah pemilihan pisang sebagai bahan utamanya. Pilih pisang yang sudah matang tapi tidak terlalu empuk supaya tidak lembek saat dimasak. Pisang yang digunakan bisa jenis pisang tanduk, pisang raja, atau pisang nangka. Hindari memilih pisang yang masih mentah atau keras karena cita rasanya masih hambar bahkan sepat.",
            "Semangkuk bubur kacang hijau hangat cocok dijadikan menu takjil atau buka puasa saat Ramadan. Kalori dari gula merah ditambah serat dari kacang hijau, dapat mengembalikan tenaga yang hilang selama berpuasa. Cara membuatnya juga relatif mudah untuk dilakukan di rumah. Tak perlu jauh-jauh ke kafe, kok. Kamu juga bisa bereksplorasi dengan berbagai resepnya.",
            "Ada dua versi bahan pembuat cendol yang digunakan oleh masyarakat Indonesia, yaitu tepung hunkwee dan tepung beras. Di tanah Jawa Barat, minuman yang disajikan bersama santan dan saus gula merah ini dikenal dengan sebutan cendol, sementara Jawa Tengah dan Jawa Timur populer dengan sebutan dawet. Kali ini, kita akan menyajikan resep cendol yang menarik.",
            "Jus mangga dengan yogurt dan beri berikut ini akan bantu penuhi kebutuhan vitamin untuk daya tahan tubuh. Yuk, kita ikuti resepnya berikut ini! Bagi kamu yang tetap ingin menjaga kecukupan vitamin untuk daya tubuh, jus mangga beri ini pas banget dijadikan sebagai salah satu sumber minuman sehat. Perpaduan jus buah mangga segar serta Buavita Mango yang keduanya kaya akan vitamin C, dan dua jenis buah beri yang merupakan sumber antioksidan, yakni stroberi dan blueberry. Belum lagi sumbangan yoghurt yang bikin cita rasanya creamy dan berperan baik untuk sistem pencernaan di dalam tubuh kita.",
            "Berbuka puasa dengan teh tarik jelly tentu akan sangat menyegarkan. Istimewa karena paduan kehadiran teh tarik dan jelly milk tea dari SariWangi Milk Tea Teh Tarik yang menemani cincau hitam. Aku membuat jelly yang cita rasanya unik dari agar-agar bubuk yang dimasak bersama SariWangi Milk Tea Teh Tarik. Masak hingga hampir matang lalu dijadikan jelly isian es teh tarik.",
    };

    private static String[] ResepMakanan = {
            "1 ekor (700 g) ayam kampung\n" + "2.5 L air\n" + "5 lembar daun jeruk\n" + "1 sdt garam\n" + "1 sdt gula pasir\n" + "2 sdm Bango Kecap Manis Light\n" + "2 batang serai, memarkan\n" + "2 cm lengkuas, memarkan\n" + "2 sdm minyak, untuk menumis\n" + "300 ml minyak, untuk menggoreng",
            "500 g fillet dada ayam, potong dadu\n" + "200 g sawi hijau, potong 4 cm\n" + "6 sdm Bango Kecap Manis Pedas\n" + "½ buah bawang bombay, cincang halus\n" + "2 siung bawang putih, iris halus\n" + "2 butir bawang merah, iris halus\n" + "1 buah tomat, buang biji, potong dadu kecil\n" + "1 sdt garam\n" + "½ sdt merica putih bubuk\n" + "100 ml kaldu ayam\n" + "2 sdm minyak, untuk menumis",
            "200 g bihun, goreng hingga matang dan kering\n" + "200 g udang, kupas, buang kepala\n" + "200 g kekian goreng, iris-iris\n" + "100 g brokoli, petiki kuntumnya\n" + "100 g jagung putren, belah 4\n" + "3 batang caisim, potong 3 cm\n" + "2 batang daun bawang, iris serong\n" + "1 buah wortel, kupas, iris serong\n" + "1 buah bawang bombay, cincang halus\n" + "2 siung bawang putih, cincang halus\n" + "2 sdm Bango Kecap Manis\n" + "1 sdm saus tiram\n" + "1 sdm saus tomat\n" + "2 sdm tepung maizena, larutkan dengan 2 sdm air\n" + "1 sdt minyak wijen\n" + "½ sdt garam\n" + "½ sdt merica putih bubuk\n" + "500 ml air\n" + "2 sdm minyak, untuk menumis",
            "5 buah terong, belah 2\n" + "100 g cabai merah keriting\n" + "1 sdt Royco Kaldu Ayam\n" + "½ sdt ebi, rendam air hangat, tiriskan\n" + "75 g teri medan tawar, goreng\n" + "5 butir bawang merah\n" + "1 butir kemiri\n" + "2 cm lengkuas, memarkan\n" + "1 buah tomat, buang biji\n" + "¼ sdt terasi udang\n" + "¼ sdt garam\n" + "¼ sdt gula pasir\n" + "1 cm kunyit\n" + "1 papan petai, goreng setengah matang",
            "1.5 piring nasi merah matang\n" + "45 g paha ayam, suwir\n" + "3 butir bakso sapi, iris\n" + "1 butir telur ayam\n" + "1 buah cabai merah, buang bijinya, iris serong\n" + "2 butir bawang merah\n" + "2 siung bawang putih\n" + "½ batang daun bawang\n" + "1 sdm Bango Kecap Manis Light\n" + "1 sdt merica putih bubuk\n" + "1 sachet Royco Kaldu Sapi\n" + "3 sdm minyak",
            "6 butir bawang merah\n" + "2 buah daun bawang\n" + "20 margarin\n" + "10 g Royco Kaldu Ayam\n" + "¼ gelas (Amerika) sambal botol\n" + "¼ gelas (Amerika) madu\n" + "1 gelas (Amerika) nanas",
            "150 g blewah\n" + "150 g nanas\n" + "150 g lidah buaya siap santap\n" + "150 g timun suri\n" + "150 g semangka\n" + "800 ml Buavita Mango",
            "100 g ubi merah, potong merah\n" + "100 g kolang kaling\n" + "200 g gula merah, sisir\n" + "2 buah pisang tanduk, potong serong \n" + "1500 ml air",
            "250 gr kacang hijau kering\n" + "250 gram gula merah\n" + "50 gram gula pasir\n" + "3 lembar daun pandan diikat\n" + "250 ml santan kental\n" + "1/2 sdt vanili\n" + "2 cm jahe",
            "150g cendol siap pakai\n" + "150 g buah nangka, potong dadu\n" + "es batu, secukupnya\n" + "150 g gula merah\n" + "100 g gula pasir\n" + "5sdm Bango Kecap Manis\n" + "200 ml air\n" + "1 lembar daun pandan",
            "200 g daging buah mangga\n" + "150 g yogurt, bagi menjadi 2 bagian\n" + "400 ml Buavita Mango\n" + "100 g stroberi\n" + "70 g blueberry\n" + "es batu",
            "6 sachet SariWangi Milk Tea Teh Tarik\n" + "400 ml air panas\n" + "200 g cincau hitam siap santap, serut memanjang\n" + "7 g agar-agar bubuk\n" + "500 ml air\n" + "8 sachet SariWangi Milk Tea Teh Tarik\n" + "Es batu",
    };

    private static String[] gambarMakanan = {
            "https://www.masakapahariini.com/wp-content/uploads/2019/11/shutterstock_1469046305-780x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/11/shutterstock_408552802-647x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/11/Bihun-Siram-Capcay-Udang-620x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/05/shutterstock_1145804015-780x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/07/nasi-merah-goreng_edited-780x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/01/cumi-goreng-saus-asam-manis-750x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2020/04/shutterstock_1084926026-780x440.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2020/04/kolak-pisang-1-510x306.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/05/bubur-kacang-hijau-2_edited-768x512.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2019/05/ES-CENDOL-NANGKA-KECAP-MANIS-WITH-PRODUCT-510x306.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2020/03/jus-mangga-yogurt-beri-5-510x306.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2020/04/Teh-Tarik-Jelly-780x440.jpg",



    };

    static ArrayList<Resep> getListData() {
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Resep resep = new Resep();
            resep.setNama_makanan(namaMakanan[position]);
            resep.setDeskripsi_makanan(deskripsiMakanan[position]);
            resep.setPhoto(gambarMakanan[position]);
            resep.setResep(ResepMakanan[position]);
            list.add(resep);
        }
        return list;
    }
}
