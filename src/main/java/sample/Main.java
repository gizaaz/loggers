package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Image icon = new Image("32.png");
        primaryStage.getIcons().add(icon);
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("BoolCalculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint(primaryStage.getTitle());
        primaryStage.show();
    }


    public static void main(String[] args) {

    }
}
