/**
 * @authors  Katherine Bellman - 100325825
 * @file    OOP3200 - Fall 2021 - Java ICE 13
 * @date    December 15th, 2021
 */

package ca.durhamcollege.oop3200f2021ice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override           //stage like in theatre
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Hello!");


        //step 1 - create one or more controls
        Label imageLabel = new Label("Processing code.....!");

        Button clickMeButton = new Button("Click me!");

        //Step 1 for images - load the image from file
        FileInputStream imagePath = new FileInputStream("src/main/java/ca/durhamcollege/oop3200f2021ice/LagrangePAS.png");
        Image codeWindow = new Image(imagePath); //loads object in memory

        // step 2 for images - set up an imageView to "contain it"
        ImageView codeImageView = new ImageView(codeWindow);
        codeImageView.setFitWidth(400);
        codeImageView.setPreserveRatio(true);

        FileInputStream errorWindow = new FileInputStream("src/main/java/ca/durhamcollege/oop3200f2021ice/errorWindow.png");
        Image errWindow = new Image(errorWindow);

        //Step 1.1 configure the controls
        // Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        //clickMeButton.setFont(font);

        class ButtonClickHandler implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent event)
            {
                imageLabel.setText("Error!");
                codeImageView.setImage(errWindow);
            }
        }
        clickMeButton.setOnAction(new ButtonClickHandler() );

        //step 1.2 for button controls (or other event type controls) set the event

    /*    clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                imageLabel.setText("Error!");
                codeImageView.setImage(errWindow);
            }
        });
*/
        // step 2- create a container

        HBox hbox1 = new HBox(10,imageLabel);
       // hbox1.setAlignment(Pos.CENTER);

        hbox1.setStyle("-fx-alignment: center");

        HBox hbox2 = new HBox(10, codeImageView);
       // hbox2.setAlignment(Pos.CENTER);

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(6,8);

        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(10));

        gridPane.add(hbox1, 0,0);
        gridPane.add(hbox2, 0, 1);
        gridPane.add(codeImageView, 0,2);
        gridPane.add(clickMeButton, 2, 2);

    // grid pane style is set first, and then the hbox
        gridPane.setStyle("-fx-border-color: black; -fx-font-size: 20px; -fx-font-family: Consolas;");

        // step 3d- add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // step 4 - add scene to stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {launch(); }
}