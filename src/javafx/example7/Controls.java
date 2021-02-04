package javafx.example7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controls extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("controls.fxml"));

        primaryStage.setTitle("Controls Example");
        primaryStage.setScene(new Scene(root, 850, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
