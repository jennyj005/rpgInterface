package com.example.demo9;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HelloController {

    @FXML
    ImageView myImageView;
    @FXML
    ImageView myImageView2;
    @FXML
    Button myButton;
    @FXML
    MenuButton menu;

    Image myImage = new Image(getClass().getResourceAsStream("imageAA.jpg"));
   // Image myImage2 = new Image(getClass().getResourceAsStream("jeu1.fxml"));

    public void onHelloButtonClick() {
        myImageView.setImage(myImage);
        myButton.setVisible(false);
        //myImageView2.setImage(myImage2);

    }
}