package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homepageController implements Initializable {

    @FXML
    private Button generalHealthConsultationButton;

    @FXML
    private Button prescriptionRefillsButton;

    @FXML
    private Button healthCounselingButton;

    @FXML
    private Button nutritionDietaryAdviceButton;

    @FXML
    private Button sexualHealthConsultationButton;

    @FXML
    private Label generalHealthDescriptionLabel;

    @FXML
    private Label prescriptionRefillsDescriptionLabel;

    @FXML
    private Label mentalHealthCounselingDescriptionLabel;

    @FXML
    private Label nutritionDietaryAdviceDescriptionLabel;

    @FXML
    private Label sexualHealthConsultationDescriptionLabel;

    @FXML
    private ImageView specialistImage1;

    @FXML
    private Label specialistName1;

    @FXML
    private ImageView specialistImage2;

    @FXML
    private Label specialistName2;

    @FXML
    private ImageView specialistImage3;

    @FXML
    private Label specialistName3;

    @FXML
    private ImageView specialistImage4;

    @FXML
    private Label specialistName4;

    @FXML
    private ImageView specialistImage5;

    @FXML
    private Label specialistName5;

    @FXML
    private Button nextButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    @FXML
    private void navigatePayment(ActionEvent event) throws IOException {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Payment.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleGeneralHealthConsultation(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/General-Health-Consultation.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handlePrescriptionRefills(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/Prescription-Refills.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void MentalHealthCounseling(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/Mental-Health-Counseling.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleNutritionDietaryAdvice(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/Nutrition-and-Dietary-Advice.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleSexualHealthConsultation(ActionEvent event) throws IOException {
       
        specialistName1.setText("Dr. Emily Rodriguez, MD");
        specialistName2.setText("Dr. Sarah Jones, MD");
        specialistName3.setText("Dr. Emily Patel, PsyD");
        specialistName4.setText("Dr. John Mitchell, RD");
        specialistName5.setText("Dr. James Anderson, MD");
         FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/Sexual-Health-Consultations.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }
}
