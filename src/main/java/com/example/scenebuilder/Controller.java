package com.example.scenebuilder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

    @FXML
    void handleButtonAction() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ACWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Second WINDOW");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction1() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MQWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Third WINDOW for MQ");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction2() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ALCircuitWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Fourth WINDOW for AL Circuits");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }

        @FXML
        void handleButtonAction3() {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MBRWindow.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Fifth WINDOW for MBR");
                stage.setScene(new Scene(root1, 300, 275));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();  // Print stack trace for debugging
            }
    }
    @FXML
    void handleButtonAction4() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SixthWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Sixth WINDOW for Input");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction5() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResetWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Seventh WINDOW for Input");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction6() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PCWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Eighth WINDOW for PC");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
        @FXML
        void handleButtonAction7() {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MARWindow.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle(" WINDOW for MAR");
                stage.setScene(new Scene(root1, 300, 275));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();  // Print stack trace for debugging
            }
    }

    @FXML
    void handleButtonAction8() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IBRWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle(" WINDOW for IBR");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction9() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ControlCircuitWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle(" WINDOW for Control Circuit window");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction10() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IRWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle(" WINDOW for IR");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }

}

