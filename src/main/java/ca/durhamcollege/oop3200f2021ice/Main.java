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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static int WIDTH = 640;
    public static int HEIGHT = 480;

    @Override           //stage like in theatre
    public void start(Stage primaryStage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        primaryStage.setTitle("Hello!");

        //step 1 - create one or more controls
        Label helloLabel = new Label("Hello, World");
        Label goodByeLabel = new Label("Good Bye!");
        Button clickMeButton = new Button("Click me!");

        //Step 1.1 configure the controls
        Font font = Font.font("Consolas", FontWeight.BOLD, 20);
        clickMeButton.setFont(font);

        //step 1.2 for button controls (or other event type controls) set the event
        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("ClickMe Button Clicked!");

                helloLabel.setText("Clicked");
            }
        });

        //step 2- create a container
        //HBox hbox = new HBox(helloLabel, goodByeLabel);
        //VBox vbox = new VBox(helloLabel, clickMeButton);

        GridPane gridPane = new GridPane();

        gridPane.add(helloLabel, 1,0);
        gridPane.add(goodByeLabel, 1, 1);
        gridPane.add(clickMeButton, 2, 2);


        // step 3d- add layout container to scene
        Scene scene = new Scene(gridPane, WIDTH, HEIGHT);

        // step 4 - add scene to stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {launch(); }
}