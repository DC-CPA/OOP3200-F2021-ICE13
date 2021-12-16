
/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 13
 * @date    December 15 sth, 2021
 */


package ca.durhamcollege.oop3200f2021ice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}