package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class firstpageController implements Initializable {

    @FXML
    private Button registerNowButton;

    @FXML
    private TabPane tabPane;

    @FXML
    private TextArea howItWorksTextArea;

    @FXML
    private TextArea whyChooseUsTextArea;

    @FXML
    private TextArea keyFeaturesTextArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

     @FXML
    private void registerNow(ActionEvent event) throws IOException {
       
       
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    
        } 
    }
