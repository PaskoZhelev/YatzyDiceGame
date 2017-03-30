package model;


import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.*;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class MenuNewGameController implements Initializable{
    @FXML
    private JFXTextField playerOneName;
    @FXML
    private JFXTextField playerTwoName;
    @FXML
    private JFXToggleButton botPlayer;

    @FXML
    private ImageView mainMenuButton;
    @FXML
    private ImageView playButton;
    @FXML
    private ImageView logo;

    @FXML
    private Image mainMenuButtonImage = new Image("model/MainMenu.png");
    @FXML
    private Image mainMenuButtonHoverImage = new Image("model/MainMenuHover.png");
    @FXML
    private Image mainMenuButtonClickImage = new Image("model/MainMenuClick.png");

    @FXML
    private Image playButtonImage = new Image("model/Play.png");
    @FXML
    private Image playButtonImageHover = new Image("model/PlayHover.png");
    @FXML
    private Image playButtonImageClick = new Image("model/PlayClick.png");

    private String[] botNames = {"Bob", "Ron", "Matilda", "Angela"};

    public static String nameOne;
    public static String nameTwo;
    public static boolean isBot;

    @FXML
    Label fillName;


    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);

        TranslateTransition translateTransition =
                new TranslateTransition(Duration.millis(500), logo);
        translateTransition.setFromY(0);
        translateTransition.setToY(-40);
        translateTransition.setCycleCount(1);
        translateTransition.play();

        //main menu button actions and hovers
        mainMenuButton.setEffect(ds);
        mainMenuButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                mainMenuButton.setImage(mainMenuButtonHoverImage);
            }
        });
        mainMenuButton.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                mainMenuButton.setImage(mainMenuButtonImage);
            }
        });

        mainMenuButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                mainMenuButton.setImage(mainMenuButtonClickImage);
            }
        });

        //play button actions and changing images
        playButton.setImage(playButtonImage);
        playButton.setEffect(ds);
        playButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                playButton.setImage(playButtonImageHover);
            }
        });
        playButton.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                playButton.setImage(playButtonImageClick);
            }
        });

        playButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                playButton.setImage(playButtonImage);
            }
        });



        botPlayer.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                playerTwoName.setText("");
                if (botPlayer.isSelected()) {
                    playerTwoName.setText(getBotName());
                    playerTwoName.setDisable(true);
                }
                else {
                    playerTwoName.setText("");
                    playerTwoName.setDisable(false);
                }
            }
        });

        //max 10 letters for text fields
        addTextLimiter(playerOneName,10);
        addTextLimiter(playerTwoName,10);

    }
    @FXML
    public String getPlayerOneName() {
        String name = playerOneName.getText();
        return name;
    }
    @FXML
    public String getPlayerTwoName() {
        String name = playerTwoName.getText();
        return name;
    }
    @FXML
    public String getBotName() {
        Random rand = new Random();
        int n = rand.nextInt(4);

        String nameBot = botNames[n];
        return nameBot;
    }
    @FXML
    private void mainMenuAction (MouseEvent event) throws IOException {
        Parent mainmenu_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene mainmenu_scene = new Scene(mainmenu_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(mainmenu_scene);
        app_stage.show();
    }
    @FXML
    private void playAction (MouseEvent event) throws IOException {
        nameOne = playerOneName.getText();
        nameTwo = playerTwoName.getText();
        if ((nameOne.isEmpty()) || (nameTwo.isEmpty())) {
            fillName.setOpacity(1);
        }
        else {
            if (botPlayer.isSelected()) {
                isBot = true;
            }
            else {
                isBot = false;
            }
            //Create Players
            Parent play_parent = FXMLLoader.load(getClass().getResource("Game.fxml"));
            Scene play_scene = new Scene(play_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(play_scene);
            play_scene.getStylesheets().add("model/styles.css");
            app_stage.show();
        }
    }

    public static void addTextLimiter(final TextField tf, final int maxLength) {
        tf.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
                if (tf.getText().length() > maxLength) {
                    String s = tf.getText().substring(0, maxLength);
                    tf.setText(s);
                }
            }
        });
    }

}
