package com.example.igrica;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;



public class HangmanMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HangmanMain.class.getResource("HANGMAN.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 605, 400);
        stage.setTitle("HANGMAN");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
    }

    public static void main(String[] args) {
        launch();
    }
}