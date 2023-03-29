package com.example.dsa_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;


    @Override
    public void start(Stage primaryStage) throws Exception {
        stg = primaryStage;
        Parent rt=FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Tickets for Trade Show");                 //Title of application
        primaryStage.setScene(new Scene(rt,600,400));
        primaryStage.show();
    }

    public void newWindow(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
        Parent root1=(Parent) fxmlLoader.load();
        Stage stage=new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}