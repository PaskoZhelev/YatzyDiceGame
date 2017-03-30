package model;

import javafx.animation.*;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Pasko on 21-Aug-16.
 */
public class MenuController implements Initializable{

    @FXML
    private ImageView logo;
    @FXML
    private ImageView preloaderImage;

    @FXML
    private ImageView newGameButton;
    @FXML
    private ImageView exitButton;

    @FXML
    private Image mainButton = new Image("model/NewGame.png");
    @FXML
    private Image mainButtonHover = new Image("model/NewGameHover.png");
    @FXML
    private Image mainButtonClick = new Image("model/NewGameClick.png");

    @FXML
    private Image exitButtonImage = new Image("model/Exit.png");
    @FXML
    private Image exitButtonImageHover = new Image("model/ExitHover.png");
    @FXML
    private Image exitButtonImageClick = new Image("model/ExitClick.png");

    @FXML
    public void initialize(URL url, ResourceBundle rb) {

        //shadow for the buttons
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);

        //new game button actions and changing images
        newGameButton.setImage(mainButton);
        newGameButton.setEffect(ds);
        newGameButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                newGameButton.setImage(mainButtonHover);
            }
        });
        newGameButton.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                newGameButton.setImage(mainButtonClick);
            }
        });

        newGameButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                newGameButton.setImage(mainButton);
            }
        });


        //exit button actions and changing images
        exitButton.setImage(exitButtonImage);
        exitButton.setEffect(ds);
        exitButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                exitButton.setImage(exitButtonImageHover);
            }
        });
        exitButton.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                exitButton.setImage(exitButtonImageClick);
            }
        });
        exitButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                Platform.exit();
            }
        });
        exitButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                exitButton.setImage(exitButtonImage);
            }
        });

        //logo fade in effect
        final DoubleProperty opacity = logo.opacityProperty();
        Timeline fadeIn = new Timeline(
                new KeyFrame(new Duration(300), new KeyValue(opacity, 0.0)),
                new KeyFrame(new Duration(900), new KeyValue(opacity, 1.0)));

        //logo transition upside
        TranslateTransition translateTransition =
                new TranslateTransition(Duration.millis(500), logo);
        translateTransition.setFromY(0);
        translateTransition.setToY(-19);
        translateTransition.setCycleCount(1);

        //buttons fade in effect
        Timeline fadeInNewGame = new Timeline(
                new KeyFrame(new Duration(0), new KeyValue(newGameButton.opacityProperty(), 0.0)),
                new KeyFrame(new Duration(300), new KeyValue(newGameButton.opacityProperty(), 1.0)));

        Timeline fadeInExit = new Timeline(
                new KeyFrame(new Duration(0), new KeyValue(exitButton.opacityProperty(), 0.0)),
                new KeyFrame(new Duration(300), new KeyValue(exitButton.opacityProperty(), 1.0)));

        //logo transition upside
        TranslateTransition transtionNewGame =
                new TranslateTransition(Duration.millis(200), newGameButton);
        transtionNewGame.setFromX(-8);
        transtionNewGame.setToX(0);
        transtionNewGame.setCycleCount(1);

        TranslateTransition transitionExit =
                new TranslateTransition(Duration.millis(200), exitButton);
        transitionExit.setFromX(-8);
        transitionExit.setToX(0);
        transitionExit.setCycleCount(1);

        //parallel transition and fade in for buttons
        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                fadeInNewGame,
                fadeInExit,
                transtionNewGame,
                transitionExit

        );
        parallelTransition.setCycleCount(1);


        //first fadein and then transition effect of logo and then button parallel
        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(
                fadeIn,
                translateTransition,
                parallelTransition

        );
        sequentialTransition.setCycleCount(1);
        sequentialTransition.play();
    }

        @FXML
        private void newGameAction (MouseEvent event) throws IOException {
            Parent newgame_parent = FXMLLoader.load(getClass().getResource("menuNewGame.fxml"));
            Scene newgame_scene = new Scene(newgame_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(newgame_scene);
            app_stage.show();
        }


}




