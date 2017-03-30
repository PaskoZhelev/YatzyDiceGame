package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
      /* Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());  */
        primaryStage.setTitle("Yahtzee");

        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();
        primaryStage.getIcons().add(
                new Image("model/LogoIcon.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}
