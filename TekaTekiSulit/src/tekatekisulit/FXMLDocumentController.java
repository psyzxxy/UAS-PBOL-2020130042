/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekatekisulit;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author iGretz
 */
public class FXMLDocumentController implements Initializable {

    private String kunciJawaban, alasanjawaban;
    private int score = 0, totalSalah = 5;
    
    @FXML
    private Button buttonJawab;

    @FXML
    private Label labelSoal;

    @FXML
    private Label labelClue;

    @FXML
    private Label labelHasil;

    @FXML
    private Label labelScor;

    @FXML
    private Label labelNama;

    @FXML
    private Label labelKesempatan;

    @FXML
    private TextField textJawaban;
    
    @FXML
    private ImageView gambarTts;
    private String namaPlayer;

  //  FXMLDocumentController(String namaPlayer) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

   
    
   
    
    @FXML
    void jawabSoalCakLontong(ActionEvent event) {
        //utama jika kunci jawaban sama dengan yang dimasukkan user maka
        String inputan;
        inputan = textJawaban.getText();
        if ( !inputan.isEmpty()) {
            if (kunciJawaban.equalsIgnoreCase(inputan)) {
                score = score + 100;
                labelScor.setText(Integer.toString(score));
                labelHasil.setText("Horrayy BENAR");
                JOptionPane.showMessageDialog(null, "Horrayy Agan Benarr \n \n"
                        + labelSoal.getText() + "\n" + kunciJawaban + "\n\n" + alasanjawaban);
                ClearTeks();
                TampilSoal();
                labelHasil.setText("Horrayy BENAR :D");
            } else {
                if (totalSalah <= 0) { //GAMEOVER
                    JOptionPane.showMessageDialog(null, "Ingatt Anda salah menjawab sebanyak 5 kali, Permainan Selesai..");
                    labelKesempatan.setText(Integer.toString(totalSalah) + "x Kesempatan");
                    ClearTeks();
                } else {
                    totalSalah = totalSalah - 1;
                    score = score - 25;
                    labelScor.setText(Integer.toString(score));
                    labelHasil.setText("MASIH SALAH :P");
                    labelKesempatan.setText(Integer.toString(totalSalah) + "x Kesempatan");
                }
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         

       String namaPlayer = JOptionPane.showInputDialog("Masukkan Nama Anda");
       labelNama.setText(namaPlayer);
        
        ClearTeks();
        TampilSoal();
    }

    public void ClearTeks() {
        labelSoal.setText("");
        labelHasil.setText("");
        labelClue.setText("");
        textJawaban.setText("");
    }

    public void TampilSoal() {
        int SoalKe = FungsiUtama.getAcakAngka();  //random index array = 4
        System.out.println(SoalKe);
        String iniSoal = FungsiUtama.getSoal(SoalKe);
        String iniClue = FungsiUtama.getClue(SoalKe);
        String iniJawaban = FungsiUtama.getJawaban(SoalKe);
        String iniAlasannya = FungsiUtama.getAlasannya(SoalKe);
        //tampilkan soal dg panggil constructor
        FungsiUtama data = new FungsiUtama(iniSoal, iniClue, iniJawaban, iniAlasannya);
        labelSoal.setText(data.soal);
        labelClue.setText(data.klue);
        kunciJawaban = data.jawaban;
        alasanjawaban = data.alasannya;
        labelHasil.setText("");
    }

    public void ClearTeksHasilOnPress() {
        labelHasil.setText("");
    }

}
