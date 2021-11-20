package com.example.exe1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * exe程序
 *
 * @author Yanzhao Li
 * @date 2021/10/13
 */
public class ExeApplication extends Application {
    /**
     * start
     *
     * @param stage stage
     * @throws IOException ioexception
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExeApplication.class.getResource("Exe-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 250);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main
     *
     * @param args arg
     */
    public static void main(String[] args) {
        launch();
    }
}