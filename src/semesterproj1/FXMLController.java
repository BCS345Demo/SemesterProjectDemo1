/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproj1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author moaat
 */
public class FXMLController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button Btn2;
    @FXML
    private Label myLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        //
    }    

    @FXML
    private void doSomething(ActionEvent event) {
        myLabel.setText("Moaath Alrajab");
        
    }

    @FXML
    private void doSomething2(ActionEvent event) {
    }
    
}
