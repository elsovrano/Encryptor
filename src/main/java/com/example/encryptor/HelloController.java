package com.example.encryptor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    @FXML
    private Button btnAdd;
    private ImageView ivIcon;
    private Label caption;


    @FXML
    private void acceptFile(ActionEvent event) {

        try {

            Window window = ((Node) (event.getSource())).getScene().getWindow();
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                    new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                    new FileChooser.ExtensionFilter("Microsoft Word Documents", "*.docx"),
                    new FileChooser.ExtensionFilter("Video Files", "*.mp4", "*.mkv"),
                    new FileChooser.ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            File selectedFile = fileChooser.showOpenDialog(window);
            event.consume();

            if(selectedFile!=null) {

                caption.setText(selectedFile.getName());
            }


        } catch (Exception e) {
            String errorMessage = e.getMessage();


        }
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}