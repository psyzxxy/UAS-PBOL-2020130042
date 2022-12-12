/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekatekisulit;

import java.util.Random;

/**
 *
 * @author iGretz
 */
public class FungsiUtama extends FormLoginController {
    public FungsiUtama(String namaPlayer){
    }

    //Fields
    public String soal;
    public String klue;
    public String jawaban;
    public String alasannya;

    //Constructor
    public FungsiUtama(String soal1, String klue1, String jawaban1, String alasan1) {
        this.soal = soal1;
        this.klue = klue1;
        this.jawaban = jawaban1;
        this.alasannya = alasan1;
    }
    
    //method
    public static int getAcakAngka() {
        Random ran = new Random();
        int x = ran.nextInt(17);    //banyaknya data
        return x;
    }

    public static String getSoal(int indek) {
        String[] iniSoal = new String[17];
        iniSoal[0] = "20 dibagi 2 dihitung ...";
        iniSoal[1] = "Ada Gula Ada ...";
        iniSoal[2] = "Motor memiliki roda ...";
        iniSoal[3] = "Biasanya orang minum pil karena ...";
        iniSoal[4] = "Dari Bandung ke Surabaya kita menggunakan ...";
        iniSoal[5] = "Masakan enak khas Padang ...";
        iniSoal[6] = "Motor bocor biasanya di ...";
        iniSoal[7] = "Hewan yang nempel di dinding ... ";
        iniSoal[8] = "Dapat bergerak sendiri tanpa disuruh ...";
        iniSoal[9] = "Yang membantu Dokter ...";
        iniSoal[10] = "Sepeda motor bisa berjalan karna rodanya berbentuk ...";
        iniSoal[11] = "Kalau ga kemana-mana namanya ...";
        iniSoal[12] = "Jauh di mata dekat di ...";
        iniSoal[13] = "Api lilin mati jika ditutup gelas karena kurang ...";
        iniSoal[14] = "Kura-kura adalah hewan yang memiliki ... ";
        iniSoal[15] = "Ketika ..... orang biasanya makan";
        iniSoal[16] = "Temannya nobita...";
        return iniSoal[indek];
    }
    
    public static String getClue(int indek) {
        String[] iniClue = new String[17];
        iniClue[0] = "S _ _ _ _ _ H";
        iniClue[1] = "_ E _ _ _";
        iniClue[2] = "_ _ A";
        iniClue[3] = "_ _ _ _ T";
        iniClue[4] = "_ E _ _ _ A";
        iniClue[5] = "_ E _ _ _ N _";
        iniClue[6] = "_ A _ _ _ _";
        iniClue[7] = "C _ _ _ K";
        iniClue[8] = "_ _ B _ _";
        iniClue[9] = "S _ _ _ _ _";
        iniClue[10] = "B _ _ _ _";
        iniClue[11] = "_ _ _ O _";
        iniClue[12] = "_ _ _ I";
        iniClue[13] = "_ _ _ _ _ _ N";
        iniClue[14] = "_ _ M _ _ _ _ _ _";
        iniClue[15] = "_ _ _ A _";
        iniClue[16] = "S _ _ _ _ _ _";
        return iniClue[indek];
    }
    
    public static String getJawaban(int indek) {
        String[] iniJawaban = new String[17];
        iniJawaban[0] = "SEDEKAH";
        iniJawaban[1] = "GELAS";
        iniJawaban[2] = "IYA";
        iniJawaban[3] = "INGAT";
        iniJawaban[4] = "CELANA";
        iniJawaban[5] = "NENDANG";
        iniJawaban[6] = "BANNYA";
        iniJawaban[7] = "CAPEK";
        iniJawaban[8] = "ROBOT";
        iniJawaban[9] = "SEMBUH";
        iniJawaban[10] = "BIASA";
        iniJawaban[11] = "JODOH";
        iniJawaban[12] = "SINI";
        iniJawaban[13] = "KERJAAN";
        iniJawaban[14] = "TEMENCEWE";
        iniJawaban[15] = "MARAH";
        iniJawaban[16] = "SEDIKIT";
        return iniJawaban[indek];
    }
    
    public static String getAlasannya(int indek) {
        String[] iniAlasan = new String[17];
        iniAlasan[0] = "Kan Uang 20 dibagi 2 dihitung sedekah";
        iniAlasan[1] = "Kalau tidak ada di gelas, dimakan semut";
        iniAlasan[2] = "Motor jelas punya roda. kalau ga punya ga bisa jalan dong.";
        iniAlasan[3] = "Bisa vitamin, bisa obat. (???)";
        iniAlasan[4] = "Masa dari Bandung ke Surabaya ga pake CELANA, kan malu... hahahahhahah...";
        iniAlasan[5] = "Karena makanan yang enak pasti rasanya NENDANG. ( ya iyalah...)";
        iniAlasan[6] = "Jadi maunya dimana? di stang??";
        iniAlasan[7] = "Alasannya Cari Sendiri";
        iniAlasan[8] = "Di dibantu dengan gravitasi bumi.";
        iniAlasan[9] = "Kalau yang membantu DOKTER pasti sembuh.";
        iniAlasan[10] = "Kalau gak biasa. Roda bebentuk kubus kan ga biasa itu";
        iniAlasan[11] = "Cieee, kalau JODOH ga kemana-kemana";
        iniAlasan[12] = "Kalau disana jauh, sini aja";
        iniAlasan[13] = "Lilin sudah nyala kenapa dimatiin";
        iniAlasan[14] = "Boleh dong punya temen cewe, jangan posesif gitu dong";
        iniAlasan[15] = "Orang marah apa enggak ya pasti makan";
        iniAlasan[16] = "Ya coba aja itung ada berapa, sedikit kan?";
        return iniAlasan[indek];
    }

   

}
