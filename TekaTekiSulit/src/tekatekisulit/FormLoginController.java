/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekatekisulit;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author iGretz
 */
public class FormLoginController implements Initializable {
     

    

    @FXML
    private Button buttonMainGame;

    @FXML
    private ImageView gambarLogo;
    
    @FXML
    private Button buttonExit;

   
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void klikMainGame(ActionEvent event) {
        
       try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();

            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 494, 545);

            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
       
       //new FXMLDocumentController(namaPlayer);
       //FungsiUtama x = new FungsiUtama(namaPlayer);
       
       
    }
     @FXML
    void klikKeluar(ActionEvent event) {
        System.exit(0);
        

    }
    
}
