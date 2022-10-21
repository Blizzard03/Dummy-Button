/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package dummy.buton;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author mariq
 */
public class ButtonIncreaseedddecreseController implements Initializable {
    private int qty =1;
    @FXML
    private Button decrease;
    @FXML
    private Label numbert;
    @FXML
    private Button increase;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void decreeaseclick(ActionEvent event) {
        numbert.setText(Integer.toString(qty));
        qty--;
        if(qty>0){
            qty-=1;
        }else {
        qty=0;}
    }

    @FXML
    private void inccreeasecclicck(ActionEvent event) {
            numbert.setText(Integer.toString(qty));
        qty++;
    }
    
}
