    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carlo
 */
public class loginController implements Initializable {

    @FXML
    private TextField usernameField,mytextfield;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Button signUpButton,regform,create;


    @FXML
    private Hyperlink alreadyhaveAccount,createAccount;

    @FXML
    private javafx.scene.control.Button reg_signupBtn,mybutton;

    @FXML
    private PasswordField log_password,reg_password,reg_confirm_password,mypasswordfield;

    @FXML
    private javafx.scene.control.TextField log_username,reg_username;

    @FXML
    private AnchorPane main_form,login_form,signup_form;

    @FXML
    private TextField reg_email,reg_user;

    @FXML
    private Button switchToWeb;
    
    @FXML
    private Button SwitchToMobile;
    
    @FXML
    private AnchorPane main_mob_form;


    
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    private Alert alert;

    
    public void loginAccount(){
        
        String selectData = "SELECT username, password FROM id WHERE username = '"
                + mytextfield.getText() + "' and password = '" + mypasswordfield.getText() + "'";
        
        connect = database.connectDB();
        
        try{
            
            if(mytextfield.getText().isEmpty()|| mypasswordfield.getText().isEmpty() ){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else{
                prepare = connect.prepareStatement(selectData);
                result = prepare.executeQuery();
                
                if(result.next() ){
                    
                    data.username = mytextfield.getText();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully login");
                    alert.showAndWait();                    
                    
                    mybutton.getScene().getWindow().hide();
                    
                    Parent root = FXMLLoader.load(getClass().getResource("/view/patients-profile.fxml"));
                    
                    Stage stage = new Stage();
                    stage.setTitle("Patients Profile");
                    
                    Scene scene = new Scene(root); 
                    stage.setScene(scene);
                    stage.show();
                    
                }else{
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Incorrect Username/Password");
                    alert.showAndWait();
                }
                         
               
            }
            
            
            
        }catch(Exception e){e.printStackTrace();}
        
    }

   

    
    public void registerAccount(){
        String insertData = "INSERT INTO id(username,email, password,confirmpassword, date) VALUES(?,?,?,?,?)";
        
        connect = database.connectDB();
        
        try{
            
            if(reg_user.getText().isEmpty() ||reg_password.getText().isEmpty() || reg_email.getText().isEmpty() || reg_confirm_password.getText().isEmpty() ){
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blank fields");
                alert.showAndWait();
            }else{
                String checkUsername = "SELECT username FROM id WHERE username = '" 
                        + reg_user.getText() + "'";
                
                prepare = connect.prepareStatement(checkUsername);
                result = prepare.executeQuery();
                
                if(result.next()){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText(reg_user.getText() + "was already taken");
                    alert.showAndWait();
                }else{
                    String checkEmail = "SELECT email FROM id WHERE email = '"
                            + reg_email.getText() + "'";
                    
                    prepare = connect.prepareStatement(checkEmail);
                    result = prepare.executeQuery();
                }if(result.next()){
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText(reg_email.getText() + "was already taken");
                    alert.showAndWait();
                }else{
                    if(reg_password.getText().length() < 8){
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Invalid Password, atleast 8 characters needed");
                        alert.showAndWait();
                    }if(!reg_confirm_password.getText().equals(reg_password.getText())){
                        alert = new Alert(AlertType.ERROR);
                        alert.setTitle("Error Message");
                        alert.setHeaderText(null);
                        alert.setContentText("wrong Password");
                        alert.showAndWait();
                    }
                else{
                        prepare = connect.prepareStatement(insertData);
                        prepare.setString(1, reg_user.getText());
                        prepare.setString(2, reg_email.getText());
                        prepare.setString(3,reg_password.getText());
                        prepare.setString(4,reg_confirm_password.getText());

                        Date date = new Date();
                        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                        prepare.setString(5, String.valueOf(sqlDate));
                        
                        prepare.executeUpdate();
                        
                        alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Successfully create a new account");
                        alert.showAndWait();
                        
                        reg_user.setText("");
                        reg_email.setText("");
                        reg_password.setText("");
                        reg_confirm_password.setText("");
                        
                        
                        create.setVisible(false);
                        regform.setVisible(true);
                        
                    }
                    
                }
            }
                
                
            
           
            
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    public void SwitchForm(ActionEvent event) throws IOException {
       

        Stage newStage = new Stage();
        newStage.setTitle("");
        Parent root = null;

        if (event.getSource() == regform) {
            alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("");
                alert.showAndWait();
                    
                regform.getScene().getWindow().hide();
                    
                root = FXMLLoader.load(getClass().getResource("/view/sign-up.fxml"));
                    
                Stage stage = new Stage();
                stage.setTitle("");
                    
                Scene scene = new Scene(root); 
                stage.setScene(scene);
                stage.show();
           
        } else{
                if (event.getSource() == create){ 
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("");
                alert.showAndWait();
                    
                create.getScene().getWindow().hide();
                    
                root = FXMLLoader.load(getClass().getResource("/view/login"));
                    
                Stage stage = new Stage();
                stage.setTitle("");
                    
                Scene scene = new Scene(root); 
                stage.setScene(scene);
                stage.show();
            }
         
        }
        if (root != null) {
            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        }
    }
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}