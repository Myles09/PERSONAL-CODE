package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PaymentController implements Initializable {
    @FXML
    private Label paymentLabel;

    @FXML
    private Label accountNumberLabel;

    @FXML
    private TextField accountNumberField;

    @FXML
    private Label accountHolderLabel;

    @FXML
    private TextField accountHolderField;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailField;

    @FXML
    private Label totalToPayLabel;

    @FXML
    private Button payButton;

    private Alert alert;

    @FXML
    private void initialize() {
        
    }

    /**
     * 
     */
    @FXML
    private void handlePayButton(ActionEvent event) {             
        // String AN =accountNumberField.getText();
        // String AH = accountHolderField.getText();
        // String email = emailField.getText();
        alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Health link");
                    alert.setHeaderText(null);
                    alert.setContentText("Thank you for your payment");
                    alert.showAndWait();

                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Health Link");
                    alert.setHeaderText(null);
                    alert.setContentText("We will email the result of your consultation within 3 to 5 working hours!");
                    alert.showAndWait();
              
         int doctorFee = 600; 
         int serviceFee = 300; 
        int totalToPay = doctorFee + serviceFee;
        totalToPayLabel.setText("₱" + totalToPay);
          
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
       

    }
   

}
