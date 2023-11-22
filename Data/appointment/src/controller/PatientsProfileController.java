package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.io.IOException;

public class PatientsProfileController {

    @FXML
    private TextField nameField;

    @FXML
    private Button patients;
    @FXML
    private DatePicker dateOfBirthPicker;

    @FXML
    private CheckBox maleCheckBox;

    @FXML
    private CheckBox femaleCheckBox;

    @FXML
    private TextField placeOfBirthField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField zipCodeField;

    @FXML
    private CheckBox singleCheckBox;

    @FXML
    private CheckBox marriedCheckBox;

    @FXML
    private TextField emailField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField contactNumberField;

    @FXML
    private TextField emergencyNumberField;

    @FXML
    private Button nextButton;

    public void setName(String newName) {
        nameField.setText(newName);
    }

    public void navigateHomepage(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String dateOfBirth = (dateOfBirthPicker.getValue() != null) ? dateOfBirthPicker.getValue().toString() : "Not specified"; 
        String gender = maleCheckBox.isSelected() ? "Male" : femaleCheckBox.isSelected() ? "Female" : "Not specified";
        String placeOfBirth = placeOfBirthField.getText();
        String address = addressField.getText();
        String zipCode = zipCodeField.getText();
        String maritalStatus = singleCheckBox.isSelected() ? "Single" : marriedCheckBox.isSelected() ? "Married" : "Not specified";
        String email = emailField.getText();
        String age = ageField.getText();
        String contactNumber = contactNumberField.getText();
        String emergencyNumber = emergencyNumberField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/homepage.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

