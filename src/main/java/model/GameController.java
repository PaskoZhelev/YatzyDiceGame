package model;

import javafx.animation.*;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    //TODO two pairs not correct

    @FXML
    public Label display1Ones;
    @FXML
    public Label display1Twos;
    @FXML
    public Label display1Threes;
    @FXML
    public Label display1Fours;
    @FXML
    public Label display1Fives;
    @FXML
    public Label display1Sixes;
    @FXML
    public Label display1Sum;
    @FXML
    public Label display1Bonus;
    @FXML
    public Label display1Pair;
    @FXML
    public Label display1TwoPairs;
    @FXML
    public Label display1ThreeOfaKind;
    @FXML
    public Label display1FourOfaKind;
    @FXML
    public Label display1SmallStraight;
    @FXML
    public Label display1LargeStraight;
    @FXML
    public Label display1FullHouse;
    @FXML
    public Label display1Chance;
    @FXML
    public Label display1Yatzy;
    @FXML
    public Label display1Total;

    @FXML
    public Label display2Ones;
    @FXML
    public Label display2Twos;
    @FXML
    public Label display2Threes;
    @FXML
    public Label display2Fours;
    @FXML
    public Label display2Fives;
    @FXML
    public Label display2Sixes;
    @FXML
    public Label display2Sum;
    @FXML
    public Label display2Bonus;
    @FXML
    public Label display2Pair;
    @FXML
    public Label display2TwoPairs;
    @FXML
    public Label display2ThreeOfaKind;
    @FXML
    public Label display2FourOfaKind;
    @FXML
    public Label display2SmallStraight;
    @FXML
    public Label display2LargeStraight;
    @FXML
    public Label display2FullHouse;
    @FXML
    public Label display2Chance;
    @FXML
    public Label display2Yatzy;
    @FXML
    public Label display2Total;

    @FXML
    public Rectangle rectangle1Ones;
    @FXML
    public Rectangle rectangle1Twos;
    @FXML
    public Rectangle rectangle1Threes;
    @FXML
    public Rectangle rectangle1Fours;
    @FXML
    public Rectangle rectangle1Fives;
    @FXML
    public Rectangle rectangle1Sixes;
    @FXML
    public Rectangle rectangle1Sum;
    @FXML
    public Rectangle rectangle1Bonus;
    @FXML
    public Rectangle rectangle1Pair;
    @FXML
    public Rectangle rectangle1TwoPairs;
    @FXML
    public Rectangle rectangle1ThreeOfaKind;
    @FXML
    public Rectangle rectangle1FourOfaKind;
    @FXML
    public Rectangle rectangle1SmallStraight;
    @FXML
    public Rectangle rectangle1LargeStraight;
    @FXML
    public Rectangle rectangle1FullHouse;
    @FXML
    public Rectangle rectangle1Chance;
    @FXML
    public Rectangle rectangle1Yatzy;
    @FXML
    public Rectangle rectangle1Total;

    @FXML
    public Rectangle rectangle2Ones;
    @FXML
    public Rectangle rectangle2Twos;
    @FXML
    public Rectangle rectangle2Threes;
    @FXML
    public Rectangle rectangle2Fours;
    @FXML
    public Rectangle rectangle2Fives;
    @FXML
    public Rectangle rectangle2Sixes;
    @FXML
    public Rectangle rectangle2Sum;
    @FXML
    public Rectangle rectangle2Bonus;
    @FXML
    public Rectangle rectangle2Pair;
    @FXML
    public Rectangle rectangle2TwoPairs;
    @FXML
    public Rectangle rectangle2ThreeOfaKind;
    @FXML
    public Rectangle rectangle2FourOfaKind;
    @FXML
    public Rectangle rectangle2SmallStraight;
    @FXML
    public Rectangle rectangle2LargeStraight;
    @FXML
    public Rectangle rectangle2FullHouse;
    @FXML
    public Rectangle rectangle2Chance;
    @FXML
    public Rectangle rectangle2Yatzy;
    @FXML
    public Rectangle rectangle2Total;

    @FXML
    public Label displayPlayerOneName;
    @FXML
    public Label displayPlayerTwoName;

    @FXML
    public Label remainingRolls;

    @FXML
    public ImageView rollButton;
    @FXML
    public Image rollButtonImage = new Image("model/Roll.png");
    @FXML
    public Image rollButtonHoverImage = new Image("model/RollHover.png");
    @FXML
    public Image rollButtonDisableImage = new Image("model/RollDisable.png");
    @FXML
    public ImageView mainMenuButton;
    @FXML
    public Image mainMenuButtonImage = new Image("model/MainMenu.png");
    @FXML
    public Image mainMenuButtonHoverImage = new Image("model/MainMenuHover.png");
    @FXML
    public Image mainMenuButtonClickImage = new Image("model/MainMenuClick.png");
    @FXML
    public Image imageOne = new Image("model/dice1.png");
    @FXML
    public Image imageTwo = new Image("model/dice2.png");
    @FXML
    public Image imageThree = new Image("model/dice3.png");
    @FXML
    public Image imageFour = new Image("model/dice4.png");
    @FXML
    public Image imageFive = new Image("model/dice5.png");
    @FXML
    public Image imageSix = new Image("model/dice6.png");
    @FXML
    public Image imageRollingDices = new Image("model/diceanimation.gif");
    @FXML
    public ImageView diceZero;
    @FXML
    public ImageView diceOne;
    @FXML
    public ImageView diceTwo;
    @FXML
    public ImageView diceThree;
    @FXML
    public ImageView diceFour;
    @FXML
    private ImageView clickedDiceZero;
    @FXML
    private ImageView clickedDiceOne;
    @FXML
    private ImageView clickedDiceTwo;
    @FXML
    private ImageView clickedDiceThree;
    @FXML
    private ImageView clickedDiceFour;

    @FXML
    public ImageView turnDicePlayerOne;
    @FXML
    public ImageView turnDicePlayerTwo;

    @FXML
    public ImageView menuBackground;
    @FXML
    public ImageView backgroundSky;
    @FXML
    public ImageView backgroundHeaven;

    public int themeChar = 1;

    public boolean playerOneTurn = false;
    public boolean playerTwoTurn = false;
    public int totalResultOne;
    public int totalResultTwo;
    public int sumOne;
    public int sumTwo;
    public int bonusOne;
    public int bonusTwo;

    public int numTurns = 0;


    @FXML
    private Rectangle rectangleNameOne;
    @FXML
    private Rectangle rectangleNameTwo;
    @FXML
    private Rectangle rollsRectangle;


    //finish game elements
    @FXML
    private Rectangle finishRectangleOne;
    @FXML
    private Rectangle finishRectangleTwo;
    @FXML
    private Label finishPointsOne;
    @FXML
    private Label finishPointsTwo;
    @FXML
    private Label finishOneName;
    @FXML
    private Label finishTwoName;
    @FXML
    private Label finishWinner;
    @FXML
    private Label finishText;
    @FXML
    private ImageView finishRollingImage;

    //create two instances of the class Score Player (2 players)
    public ScorePlayer playerOne;
    public ScorePlayer playerTwo;
    public BotPlayer botPlayer;


    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        //create two players
        playerOne = new ScorePlayer(MenuNewGameController.nameOne);
        playerTwo = new ScorePlayer(MenuNewGameController.nameTwo);

        if (MenuNewGameController.isBot) {
            botPlayer = new BotPlayer();
            playerTwo.isBot = true;
        }

        //display their names on the Score Sheet
        displayPlayerOneName.setText(playerOne.getName());
        displayPlayerTwoName.setText(playerTwo.getName());

        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);

        resetRollsRectanglesDices();

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

        // Reset Everything in the beginning
        rollButton.setEffect(ds);
        resetEverything();
        ScorePlayer.setResultsZero(playerOne);
        ScorePlayer.setResultsZero(playerTwo);
        ScorePlayer.resetSelections(playerOne);
        ScorePlayer.resetSelections(playerTwo);
    }


    public void Roll() {
        setRemainingRolls();
        Roller.rollDices();
        showCurrentPlayerResults();
        enableDisplayForCurrentPlayer();
        if (Roller.getRollNum() < 3) {
            startRollingDices();
        } else if (Roller.getRollNum() == 3) {
            disableRollButon();
            startRollingDices();
        } else {
            rollButton.setDisable(true);
        }
    }

    /**
     * Print on display
     **/

    public void printCategoriesResults1() {
        calculateTotalOne();
        calculateSumOne();
        calculateBonusOne();


        if (!playerOne.isSelectedOnes) {
            String score = String.valueOf(playerOne.calculateOnes(Roller.dice));
            display1Ones.setText(score);
        } else {
            display1Ones.setText(String.valueOf(playerOne.getResultOnes()));
        }
        if (!playerOne.isSelectedTwos) {
            String score = String.valueOf(playerOne.calculateTwos(Roller.dice));
            display1Twos.setText(score);
        } else {
            display1Twos.setText(String.valueOf(playerOne.getResultTwos()));
        }
        if (!playerOne.isSelectedThrees) {
            String score = String.valueOf(playerOne.calculateThrees(Roller.dice));
            display1Threes.setText(score);
        } else {
            display1Threes.setText(String.valueOf(playerOne.getResultThrees()));
        }
        if (!playerOne.isSelectedFours) {
            String score = String.valueOf(playerOne.calculateFours(Roller.dice));
            display1Fours.setText(score);
        } else {
            display1Fours.setText(String.valueOf(playerOne.getResultFours()));
        }
        if (!playerOne.isSelectedFives) {
            String score = String.valueOf(playerOne.calculateFives(Roller.dice));
            display1Fives.setText(score);
        } else {
            display1Fives.setText(String.valueOf(playerOne.getResultFives()));
        }
        if (!playerOne.isSelectedSixes) {
            String score = String.valueOf(playerOne.calculateSixes(Roller.dice));
            display1Sixes.setText(score);
        } else {
            display1Sixes.setText(String.valueOf(playerOne.getResultSixes()));
        }
        if (!playerOne.isSelectedPair) {
            String score = String.valueOf(playerOne.calculatePair(Roller.dice));
            display1Pair.setText(score);
        } else {
            display1Pair.setText(String.valueOf(playerOne.getResultPair()));
        }
        if (!playerOne.isSelectedTwoPairs) {
            String score = String.valueOf(playerOne.calculateTwoPairs(Roller.dice));
            display1TwoPairs.setText(score);
        } else {
            display1TwoPairs.setText(String.valueOf(playerOne.getResultTwoPairs()));
        }
        if (!playerOne.isSelectedThreeOfaKind) {
            String score = String.valueOf(playerOne.calculateThreeOfaKind(Roller.dice));
            display1ThreeOfaKind.setText(score);
        } else {
            display1ThreeOfaKind.setText(String.valueOf(playerOne.getResultThreeOfaKind()));
        }
        if (!playerOne.isSelectedFourOfaKind) {
            String score = String.valueOf(playerOne.calculateFourOfaKind(Roller.dice));
            display1FourOfaKind.setText(score);
        } else {
            display1FourOfaKind.setText(String.valueOf(playerOne.getResultFourOfaKind()));
        }
        if (!playerOne.isSelectedSmallStraight) {
            String score = String.valueOf(playerOne.calculateSmallStraight(Roller.dice));
            display1SmallStraight.setText(score);
        } else {
            display1SmallStraight.setText(String.valueOf(playerOne.getResultSmallStraight()));
        }
        if (!playerOne.isSelectedLargeStraight) {
            String score = String.valueOf(playerOne.calculateLargeStraight(Roller.dice));
            display1LargeStraight.setText(score);
        } else {
            display1LargeStraight.setText(String.valueOf(playerOne.getResultLargeStraight()));
        }
        if (!playerOne.isSelectedFullHouse) {
            String score = String.valueOf(playerOne.calculateFullHouse(Roller.dice));
            display1FullHouse.setText(score);
        } else {
            display1FullHouse.setText(String.valueOf(playerOne.getResultFullHouse()));
        }
        if (!playerOne.isSelectedChance) {
            String score = String.valueOf(playerOne.calculateChance(Roller.dice));
            display1Chance.setText(score);
        } else {
            display1Chance.setText(String.valueOf(playerOne.getResultChance()));
        }
        if (!playerOne.isSelectedYatzy) {
            String score = String.valueOf(playerOne.calculateYatzy(Roller.dice));
            display1Yatzy.setText(score);
        } else {
            display1Yatzy.setText(String.valueOf(playerOne.getResultYatzy()));
        }
        display1Sum.setText(String.valueOf(sumOne));
        display1Bonus.setText(String.valueOf(bonusOne));
        display1Total.setText(String.valueOf(totalResultOne));
    }

    public void printCategoriesResults2() {
        calculateTotalTwo();
        calculateSumTwo();
        calculateBonusTwo();

        if (!playerTwo.isSelectedOnes) {
            String score = String.valueOf(playerTwo.calculateOnes(Roller.dice));
            display2Ones.setText(score);
        } else {
            display2Ones.setText(String.valueOf(playerTwo.getResultOnes()));
        }
        if (!playerTwo.isSelectedTwos) {
            String score = String.valueOf(playerTwo.calculateTwos(Roller.dice));
            display2Twos.setText(score);
        } else {
            display2Twos.setText(String.valueOf(playerTwo.getResultTwos()));
        }
        if (!playerTwo.isSelectedThrees) {
            String score = String.valueOf(playerTwo.calculateThrees(Roller.dice));
            display2Threes.setText(score);
        } else {
            display2Threes.setText(String.valueOf(playerTwo.getResultThrees()));
        }
        if (!playerTwo.isSelectedFours) {
            String score = String.valueOf(playerTwo.calculateFours(Roller.dice));
            display2Fours.setText(score);
        } else {
            display2Fours.setText(String.valueOf(playerTwo.getResultFours()));
        }
        if (!playerTwo.isSelectedFives) {
            String score = String.valueOf(playerTwo.calculateFives(Roller.dice));
            display2Fives.setText(score);
        } else {
            display2Fives.setText(String.valueOf(playerTwo.getResultFives()));
        }
        if (!playerTwo.isSelectedSixes) {
            String score = String.valueOf(playerTwo.calculateSixes(Roller.dice));
            display2Sixes.setText(score);
        } else {
            display2Sixes.setText(String.valueOf(playerTwo.getResultSixes()));
        }
        if (!playerTwo.isSelectedPair) {
            String score = String.valueOf(playerTwo.calculatePair(Roller.dice));
            display2Pair.setText(score);
        } else {
            display2Pair.setText(String.valueOf(playerTwo.getResultPair()));
        }
        if (!playerTwo.isSelectedTwoPairs) {
            String score = String.valueOf(playerTwo.calculateTwoPairs(Roller.dice));
            display2TwoPairs.setText(score);
        } else {
            display2TwoPairs.setText(String.valueOf(playerTwo.getResultTwoPairs()));
        }
        if (!playerTwo.isSelectedThreeOfaKind) {
            String score = String.valueOf(playerTwo.calculateThreeOfaKind(Roller.dice));
            display2ThreeOfaKind.setText(score);
        } else {
            display2ThreeOfaKind.setText(String.valueOf(playerTwo.getResultThreeOfaKind()));
        }
        if (!playerTwo.isSelectedFourOfaKind) {
            String score = String.valueOf(playerTwo.calculateFourOfaKind(Roller.dice));
            display2FourOfaKind.setText(score);
        } else {
            display2FourOfaKind.setText(String.valueOf(playerTwo.getResultFourOfaKind()));
        }
        if (!playerTwo.isSelectedSmallStraight) {
            String score = String.valueOf(playerTwo.calculateSmallStraight(Roller.dice));
            display2SmallStraight.setText(score);
        } else {
            display2SmallStraight.setText(String.valueOf(playerTwo.getResultSmallStraight()));
        }
        if (!playerTwo.isSelectedLargeStraight) {
            String score = String.valueOf(playerTwo.calculateLargeStraight(Roller.dice));
            display2LargeStraight.setText(score);
        } else {
            display2LargeStraight.setText(String.valueOf(playerTwo.getResultLargeStraight()));
        }
        if (!playerTwo.isSelectedFullHouse) {
            String score = String.valueOf(playerTwo.calculateFullHouse(Roller.dice));
            display2FullHouse.setText(score);
        } else {
            display2FullHouse.setText(String.valueOf(playerTwo.getResultFullHouse()));
        }
        if (!playerTwo.isSelectedChance) {
            String score = String.valueOf(playerTwo.calculateChance(Roller.dice));
            display2Chance.setText(score);
        } else {
            display2Chance.setText(String.valueOf(playerTwo.getResultChance()));
        }
        if (!playerTwo.isSelectedYatzy) {
            String score = String.valueOf(playerTwo.calculateYatzy(Roller.dice));
            display2Yatzy.setText(score);
        } else {
            display2Yatzy.setText(String.valueOf(playerTwo.getResultYatzy()));
        }
        display2Sum.setText(String.valueOf(sumTwo));
        display2Bonus.setText(String.valueOf(bonusTwo));
        display2Total.setText(String.valueOf(totalResultTwo));
    }

    public void printTotalPoints() {
        calculateTotalOne();
        calculateSumOne();
        calculateBonusOne();
        calculateTotalTwo();
        calculateSumTwo();
        calculateBonusTwo();
        display1Sum.setText(String.valueOf(sumOne));
        display1Bonus.setText(String.valueOf(bonusOne));
        display1Total.setText(String.valueOf(totalResultOne));

        display2Sum.setText(String.valueOf(sumTwo));
        display2Bonus.setText(String.valueOf(bonusTwo));
        display2Total.setText(String.valueOf(totalResultTwo));
    }

    public void printRectangles1() {
        if ((!playerOne.isSelectedOnes) && (playerOne.calculateOnes(Roller.dice) != 0)) {
            rectangle1Ones.setOpacity(1);
        } else {
            rectangle1Ones.setOpacity(0);
        }
        if ((!playerOne.isSelectedTwos) && (playerOne.calculateTwos(Roller.dice) != 0)) {
            rectangle1Twos.setOpacity(1);
        } else {
            rectangle1Twos.setOpacity(0);
        }
        if ((!playerOne.isSelectedThrees) && (playerOne.calculateThrees(Roller.dice) != 0)) {
            rectangle1Threes.setOpacity(1);
        } else {
            rectangle1Threes.setOpacity(0);
        }
        if ((!playerOne.isSelectedFours) && (playerOne.calculateFours(Roller.dice) != 0)) {
            rectangle1Fours.setOpacity(1);
        } else {
            rectangle1Fours.setOpacity(0);
        }
        if ((!playerOne.isSelectedFives) && (playerOne.calculateFives(Roller.dice) != 0)) {
            rectangle1Fives.setOpacity(1);
        } else {
            rectangle1Fives.setOpacity(0);
        }
        if ((!playerOne.isSelectedSixes) && (playerOne.calculateSixes(Roller.dice) != 0)) {
            rectangle1Sixes.setOpacity(1);
        } else {
            rectangle1Sixes.setOpacity(0);
        }
        if ((!playerOne.isSelectedPair) && (playerOne.calculatePair(Roller.dice) != 0)) {
            rectangle1Pair.setOpacity(1);
        } else {
            rectangle1Pair.setOpacity(0);
        }
        if ((!playerOne.isSelectedTwoPairs) && (playerOne.calculateTwoPairs(Roller.dice) != 0)) {
            rectangle1TwoPairs.setOpacity(1);
        } else {
            rectangle1TwoPairs.setOpacity(0);
        }
        if ((!playerOne.isSelectedThreeOfaKind) && (playerOne.calculateThreeOfaKind(Roller.dice) != 0)) {
            rectangle1ThreeOfaKind.setOpacity(1);
        } else {
            rectangle1ThreeOfaKind.setOpacity(0);
        }
        if ((!playerOne.isSelectedFourOfaKind) && (playerOne.calculateFourOfaKind(Roller.dice) != 0)) {
            rectangle1FourOfaKind.setOpacity(1);
        } else {
            rectangle1FourOfaKind.setOpacity(0);
        }
        if ((!playerOne.isSelectedSmallStraight) && (playerOne.calculateSmallStraight(Roller.dice) != 0)) {
            rectangle1SmallStraight.setOpacity(1);
        } else {
            rectangle1SmallStraight.setOpacity(0);
        }
        if ((!playerOne.isSelectedLargeStraight) && (playerOne.calculateLargeStraight(Roller.dice) != 0)) {
            rectangle1LargeStraight.setOpacity(1);
        } else {
            rectangle1LargeStraight.setOpacity(0);
        }
        if ((!playerOne.isSelectedFullHouse) && (playerOne.calculateFullHouse(Roller.dice) != 0)) {
            rectangle1FullHouse.setOpacity(1);
        } else {
            rectangle1FullHouse.setOpacity(0);
        }
        if ((!playerOne.isSelectedChance) && (playerOne.calculateChance(Roller.dice) != 0)) {
            rectangle1Chance.setOpacity(1);
        } else {
            rectangle1Chance.setOpacity(0);
        }
        if ((!playerOne.isSelectedYatzy) && (playerOne.calculateYatzy(Roller.dice) != 0)) {
            rectangle1Yatzy.setOpacity(1);
        } else {
            rectangle1Yatzy.setOpacity(0);
        }
    }

    public void printRectangles2() {
        if ((!playerTwo.isSelectedOnes) && (playerTwo.calculateOnes(Roller.dice) != 0)) {
            rectangle2Ones.setOpacity(1);
        } else {
            rectangle2Ones.setOpacity(0);
        }
        if ((!playerTwo.isSelectedTwos) && (playerTwo.calculateTwos(Roller.dice) != 0)) {
            rectangle2Twos.setOpacity(1);
        } else {
            rectangle2Twos.setOpacity(0);
        }
        if ((!playerTwo.isSelectedThrees) && (playerTwo.calculateThrees(Roller.dice) != 0)) {
            rectangle2Threes.setOpacity(1);
        } else {
            rectangle2Threes.setOpacity(0);
        }
        if ((!playerTwo.isSelectedFours) && (playerTwo.calculateFours(Roller.dice) != 0)) {
            rectangle2Fours.setOpacity(1);
        } else {
            rectangle2Fours.setOpacity(0);
        }
        if ((!playerTwo.isSelectedFives) && (playerTwo.calculateFives(Roller.dice) != 0)) {
            rectangle2Fives.setOpacity(1);
        } else {
            rectangle2Fives.setOpacity(0);
        }
        if ((!playerTwo.isSelectedSixes) && (playerTwo.calculateSixes(Roller.dice) != 0)) {
            rectangle2Sixes.setOpacity(1);
        } else {
            rectangle2Sixes.setOpacity(0);
        }
        if ((!playerTwo.isSelectedPair) && (playerTwo.calculatePair(Roller.dice) != 0)) {
            rectangle2Pair.setOpacity(1);
        } else {
            rectangle2Pair.setOpacity(0);
        }
        if ((!playerTwo.isSelectedTwoPairs) && (playerTwo.calculateTwoPairs(Roller.dice) != 0)) {
            rectangle2TwoPairs.setOpacity(1);
        } else {
            rectangle2TwoPairs.setOpacity(0);
        }
        if ((!playerTwo.isSelectedThreeOfaKind) && (playerTwo.calculateThreeOfaKind(Roller.dice) != 0)) {
            rectangle2ThreeOfaKind.setOpacity(1);
        } else {
            rectangle2ThreeOfaKind.setOpacity(0);
        }
        if ((!playerTwo.isSelectedFourOfaKind) && (playerTwo.calculateFourOfaKind(Roller.dice) != 0)) {
            rectangle2FourOfaKind.setOpacity(1);
        } else {
            rectangle2FourOfaKind.setOpacity(0);
        }
        if ((!playerTwo.isSelectedSmallStraight) && (playerTwo.calculateSmallStraight(Roller.dice) != 0)) {
            rectangle2SmallStraight.setOpacity(1);
        } else {
            rectangle2SmallStraight.setOpacity(0);
        }
        if ((!playerTwo.isSelectedLargeStraight) && (playerTwo.calculateLargeStraight(Roller.dice) != 0)) {
            rectangle2LargeStraight.setOpacity(1);
        } else {
            rectangle2LargeStraight.setOpacity(0);
        }
        if ((!playerTwo.isSelectedFullHouse) && (playerTwo.calculateFullHouse(Roller.dice) != 0)) {
            rectangle2FullHouse.setOpacity(1);
        } else {
            rectangle2FullHouse.setOpacity(0);
        }
        if ((!playerTwo.isSelectedChance) && (playerTwo.calculateChance(Roller.dice) != 0)) {
            rectangle2Chance.setOpacity(1);
        } else {
            rectangle2Chance.setOpacity(0);
        }
        if ((!playerTwo.isSelectedYatzy) && (playerTwo.calculateYatzy(Roller.dice) != 0)) {
            rectangle2Yatzy.setOpacity(1);
        } else {
            rectangle2Yatzy.setOpacity(0);
        }
    }

    /**
     * Reset Actions
     **/

    public void resetScoreSheet1() {
        String defaultValueScores = "0";
        if (!playerOne.isSelectedOnes) {
            display1Ones.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedTwos) {
            display1Twos.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedThrees) {
            display1Threes.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedFours) {
            display1Fours.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedFives) {
            display1Fives.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedSixes) {
            display1Sixes.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedPair) {
            display1Pair.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedTwoPairs) {
            display1TwoPairs.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedThreeOfaKind) {
            display1ThreeOfaKind.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedFourOfaKind) {
            display1FourOfaKind.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedSmallStraight) {
            display1SmallStraight.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedLargeStraight) {
            display1LargeStraight.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedFullHouse) {
            display1FullHouse.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedChance) {
            display1Chance.setText(defaultValueScores);
        }
        if (!playerOne.isSelectedYatzy) {
            display1Yatzy.setText(defaultValueScores);
        }
    }


    public void resetScoreSheet2() {
        String defaultValueScores = "0";
        if (!playerTwo.isSelectedOnes) {
            display2Ones.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedTwos) {
            display2Twos.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedThrees) {
            display2Threes.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedFours) {
            display2Fours.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedFives) {
            display2Fives.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedSixes) {
            display2Sixes.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedPair) {
            display2Pair.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedTwoPairs) {
            display2TwoPairs.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedThreeOfaKind) {
            display2ThreeOfaKind.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedFourOfaKind) {
            display2FourOfaKind.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedSmallStraight) {
            display2SmallStraight.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedLargeStraight) {
            display2LargeStraight.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedFullHouse) {
            display2FullHouse.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedChance) {
            display2Chance.setText(defaultValueScores);
        }
        if (!playerTwo.isSelectedYatzy) {
            display2Yatzy.setText(defaultValueScores);
        }
    }

    public void resetRollsRectanglesDices() {
        remainingRolls.setText("3");
        enableRollButon();
        resetRectangles();
        resetSelectedDices();
        Roller.resetRollNum();
        printTotalPoints();
        changePlayer();
    }

    public void resetEverything() {
        remainingRolls.setText("3");
        enableRollButon();
        resetRectangles();
        resetSelectedDices();
        Roller.resetRollNum();
        printTotalPoints();
        resetDiceImages();
        resetAllResults();
        disableFinishGame();
        playerOneTurn = true;
        turnDicePlayerOne.setOpacity(1);
        rectangleNameOne.setOpacity(1);
        rectangleNameTwo.setOpacity(0);
        turnDicePlayerTwo.setOpacity(0);
        disableDisplayForCurrentPlayer();
        sumOne = 0;
        sumTwo = 0;
        totalResultOne = 0;
        totalResultTwo = 0;
    }

    public void resetAllResults() {

        playerOne.setResultOnes(playerOne.calculateOnes(Roller.dice));

        playerOne.setResultTwos(playerOne.calculateTwos(Roller.dice));

        playerOne.setResultThrees(playerOne.calculateThrees(Roller.dice));

        playerOne.setResultFours(playerOne.calculateFours(Roller.dice));

        playerOne.setResultFives(playerOne.calculateFives(Roller.dice));

        playerOne.setResultSixes(playerOne.calculateSixes(Roller.dice));

        playerOne.setResultPair(playerOne.calculatePair(Roller.dice));

        playerOne.setResultTwoPairs(playerOne.calculateTwoPairs(Roller.dice));

        playerOne.setResultThreeOfaKind(playerOne.calculateThreeOfaKind(Roller.dice));

        playerOne.setResultFourOfaKind(playerOne.calculateFourOfaKind(Roller.dice));

        playerOne.setResultSmallStraight(playerOne.calculateSmallStraight(Roller.dice));

        playerOne.setResultLargeStraight(playerOne.calculateLargeStraight(Roller.dice));

        playerOne.setResultFullHouse(playerOne.calculateFullHouse(Roller.dice));

        playerOne.setResultChance(playerOne.calculateChance(Roller.dice));

        playerOne.setResultYatzy(playerOne.calculateYatzy(Roller.dice));


        playerTwo.setResultOnes(playerTwo.calculateOnes(Roller.dice));

        playerTwo.setResultTwos(playerTwo.calculateTwos(Roller.dice));

        playerTwo.setResultThrees(playerTwo.calculateThrees(Roller.dice));

        playerTwo.setResultFours(playerTwo.calculateFours(Roller.dice));

        playerTwo.setResultFives(playerTwo.calculateFives(Roller.dice));

        playerTwo.setResultSixes(playerTwo.calculateSixes(Roller.dice));

        playerTwo.setResultPair(playerTwo.calculatePair(Roller.dice));

        playerTwo.setResultTwoPairs(playerTwo.calculateTwoPairs(Roller.dice));

        playerTwo.setResultThreeOfaKind(playerTwo.calculateThreeOfaKind(Roller.dice));

        playerTwo.setResultFourOfaKind(playerTwo.calculateFourOfaKind(Roller.dice));

        playerTwo.setResultSmallStraight(playerTwo.calculateSmallStraight(Roller.dice));

        playerTwo.setResultLargeStraight(playerTwo.calculateLargeStraight(Roller.dice));

        playerTwo.setResultFullHouse(playerTwo.calculateFullHouse(Roller.dice));

        playerTwo.setResultChance(playerTwo.calculateChance(Roller.dice));

        playerTwo.setResultYatzy(playerTwo.calculateYatzy(Roller.dice));

    }

    public void resetDiceImages() {
        diceZero.setEffect(null);
        diceOne.setEffect(null);
        diceTwo.setEffect(null);
        diceThree.setEffect(null);
        diceFour.setEffect(null);

        diceZero.setImage(null);
        diceOne.setImage(null);
        diceTwo.setImage(null);
        diceThree.setImage(null);
        diceFour.setImage(null);
    }

    public void resetSelectedDices() {
        for (int i = 0; i < Roller.selectedDice.length; i++) {
            Roller.selectedDice[i] = false;
        }
        clickedDiceZero.setOpacity(0);
        clickedDiceOne.setOpacity(0);
        clickedDiceTwo.setOpacity(0);
        clickedDiceThree.setOpacity(0);
        clickedDiceFour.setOpacity(0);
    }

    public void resetRectangles() {
        rectangle1Ones.setOpacity(0);
        rectangle1Twos.setOpacity(0);
        rectangle1Threes.setOpacity(0);
        rectangle1Fours.setOpacity(0);
        rectangle1Fives.setOpacity(0);
        rectangle1Sixes.setOpacity(0);
        rectangle1Sum.setOpacity(0);
        rectangle1Bonus.setOpacity(0);
        rectangle1Pair.setOpacity(0);
        rectangle1TwoPairs.setOpacity(0);
        rectangle1ThreeOfaKind.setOpacity(0);
        rectangle1FourOfaKind.setOpacity(0);
        rectangle1SmallStraight.setOpacity(0);
        rectangle1LargeStraight.setOpacity(0);
        rectangle1FullHouse.setOpacity(0);
        rectangle1Chance.setOpacity(0);
        rectangle1Yatzy.setOpacity(0);
        rectangle1Total.setOpacity(0);

        rectangle2Ones.setOpacity(0);
        rectangle2Twos.setOpacity(0);
        rectangle2Threes.setOpacity(0);
        rectangle2Fours.setOpacity(0);
        rectangle2Fives.setOpacity(0);
        rectangle2Sixes.setOpacity(0);
        rectangle2Sum.setOpacity(0);
        rectangle2Bonus.setOpacity(0);
        rectangle2Pair.setOpacity(0);
        rectangle2TwoPairs.setOpacity(0);
        rectangle2ThreeOfaKind.setOpacity(0);
        rectangle2FourOfaKind.setOpacity(0);
        rectangle2SmallStraight.setOpacity(0);
        rectangle2LargeStraight.setOpacity(0);
        rectangle2FullHouse.setOpacity(0);
        rectangle2Chance.setOpacity(0);
        rectangle2Yatzy.setOpacity(0);
        rectangle2Total.setOpacity(0);
    }


    public void showCurrentPlayerResults() {

        if (playerOneTurn) {
            PauseTransition delayDisplay1 = new PauseTransition(Duration.seconds(0.6));
            delayDisplay1.setOnFinished(event -> printCategoriesResults1());
            delayDisplay1.play();
            PauseTransition delayRectangle1 = new PauseTransition(Duration.seconds(0.6));
            delayRectangle1.setOnFinished(event -> printRectangles1());
            delayRectangle1.play();
        } else {
            PauseTransition delayDisplay2 = new PauseTransition(Duration.seconds(0.6));
            delayDisplay2.setOnFinished(event -> printCategoriesResults2());
            delayDisplay2.play();
            PauseTransition delayRectangle2 = new PauseTransition(Duration.seconds(0.6));
            delayRectangle2.setOnFinished(event -> printRectangles2());
            delayRectangle2.play();
        }
    }

    public void changePlayer() {
        disableDisplayForCurrentPlayer();
        resetDiceImages();
        if (playerOneTurn) {
            //player 2 turn
            playerOneTurn = false;
            playerTwoTurn = true;
            turnDicePlayerOne.setOpacity(0);
            turnDicePlayerTwo.setOpacity(1);
            rectangleNameOne.setOpacity(0);
            rectangleNameTwo.setOpacity(1);

            if (playerTwo.isBot) {
                //play the bot moves

                botTurn1();
            }

        } else {
            //player1 turn
            numTurns++;
            if (numTurns == 16) {
                //GAME FINISHES
                playerOneTurn = false;
                playerTwoTurn = false;

                turnDicePlayerOne.setOpacity(0);
                turnDicePlayerTwo.setOpacity(0);
                rectangleNameOne.setOpacity(0);
                rectangleNameTwo.setOpacity(0);
                rollButton.setOpacity(0);
                rollButton.setOnMouseClicked(null);
                rollsRectangle.setOpacity(0);
                remainingRolls.setOpacity(0);
                resetDiceImages();
                enableFinishGame();
            } else {
                playerOneTurn = true;
                playerTwoTurn = false;
                turnDicePlayerOne.setOpacity(1);
                turnDicePlayerTwo.setOpacity(0);
                rectangleNameOne.setOpacity(1);
                rectangleNameTwo.setOpacity(0);
            }
        }
    }

    public void enableFinishGame() {
        finishOneName.setText(displayPlayerOneName.getText());
        finishTwoName.setText(displayPlayerTwoName.getText());
        finishPointsOne.setText(display1Total.getText());
        finishPointsTwo.setText(display2Total.getText());
        int pointsOne = Integer.valueOf(display1Total.getText());
        int pointsTwo = Integer.valueOf(display2Total.getText());

        if (pointsOne > pointsTwo) {
            finishWinner.setText(displayPlayerOneName.getText());
        } else if (pointsOne < pointsTwo) {
            finishWinner.setText(displayPlayerTwoName.getText());
        } else {
            finishWinner.setText("Nobody");
        }
        finishOneName.setOpacity(1);
        finishTwoName.setOpacity(1);
        finishPointsOne.setOpacity(1);
        finishPointsTwo.setOpacity(1);
        finishWinner.setOpacity(1);
        finishRectangleOne.setOpacity(1);
        finishRectangleTwo.setOpacity(1);
        finishText.setOpacity(1);
        finishRollingImage.setOpacity(1);
    }

    public void disableFinishGame() {
        finishOneName.setOpacity(0);
        finishTwoName.setOpacity(0);
        finishPointsOne.setOpacity(0);
        finishPointsTwo.setOpacity(0);
        finishWinner.setOpacity(0);
        finishRectangleOne.setOpacity(0);
        finishRectangleTwo.setOpacity(0);
        finishText.setOpacity(0);
        finishRollingImage.setOpacity(0);
    }

    public int remainingRolls() {
        int rolls = 2;
        return rolls - Roller.getRollNum();
    }

    public void setRemainingRolls() {
        remainingRolls.setText(String.valueOf(remainingRolls()));
    }

    public void startRollingDices() {
        diceZero.setEffect(null);
        diceOne.setEffect(null);
        diceTwo.setEffect(null);
        diceThree.setEffect(null);
        diceFour.setEffect(null);

        if (!Roller.selectedDice[0]) {
            diceZero.setImage(imageRollingDices);
        }

        if (!Roller.selectedDice[1]) {
            diceOne.setImage(imageRollingDices);
        }

        if (!Roller.selectedDice[2]) {
            diceTwo.setImage(imageRollingDices);
        }

        if (!Roller.selectedDice[3]) {
            diceThree.setImage(imageRollingDices);
        }

        if (!Roller.selectedDice[4]) {
            diceFour.setImage(imageRollingDices);
        }

        stopRollingDices();
    }

    public void stopRollingDices() {
        /** Rolling effect for 1 second **/
        PauseTransition delay0 = new PauseTransition(Duration.seconds(0.5));
        delay0.setOnFinished(event -> setDice0Image());

        PauseTransition delay1 = new PauseTransition(Duration.seconds(0.53));
        delay1.setOnFinished(event -> setDice1Image());

        PauseTransition delay2 = new PauseTransition(Duration.seconds(0.56));
        delay2.setOnFinished(event -> setDice2Image());

        PauseTransition delay3 = new PauseTransition(Duration.seconds(0.59));
        delay3.setOnFinished(event -> setDice3Image());

        PauseTransition delay4 = new PauseTransition(Duration.seconds(0.62));
        delay4.setOnFinished(event -> setDice4Image());


        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(
                delay0,
                delay1,
                delay2,
                delay3,
                delay4
        );
        parallelTransition.setCycleCount(1);
        parallelTransition.play();
    }

    public void enableDisplayForCurrentPlayer() {
        if (playerOneTurn) {
            enableDisplayOne();
            disableDisplayTwo();
        } else {
            enableDisplayTwo();
            disableDisplayOne();
        }
    }

    public void disableDisplayForCurrentPlayer() {
        disableDisplayOne();
        disableDisplayTwo();
    }

    //enable or disable the clicking of categories if it is not your turn
    public void enableDisplayOne() {
        display1Ones.setDisable(false);
        display1Twos.setDisable(false);
        display1Threes.setDisable(false);
        display1Fours.setDisable(false);
        display1Fives.setDisable(false);
        display1Sixes.setDisable(false);
        display1Pair.setDisable(false);
        display1TwoPairs.setDisable(false);
        display1ThreeOfaKind.setDisable(false);
        display1FourOfaKind.setDisable(false);
        display1SmallStraight.setDisable(false);
        display1LargeStraight.setDisable(false);
        display1FullHouse.setDisable(false);
        display1Chance.setDisable(false);
        display1Yatzy.setDisable(false);

    }

    public void disableDisplayOne() {
        display1Ones.setDisable(true);
        display1Twos.setDisable(true);
        display1Threes.setDisable(true);
        display1Fours.setDisable(true);
        display1Fives.setDisable(true);
        display1Sixes.setDisable(true);
        display1Pair.setDisable(true);
        display1TwoPairs.setDisable(true);
        display1ThreeOfaKind.setDisable(true);
        display1FourOfaKind.setDisable(true);
        display1SmallStraight.setDisable(true);
        display1LargeStraight.setDisable(true);
        display1FullHouse.setDisable(true);
        display1Chance.setDisable(true);
        display1Yatzy.setDisable(true);
    }

    public void enableDisplayTwo() {
        display2Ones.setDisable(false);
        display2Twos.setDisable(false);
        display2Threes.setDisable(false);
        display2Fours.setDisable(false);
        display2Fives.setDisable(false);
        display2Sixes.setDisable(false);
        display2Pair.setDisable(false);
        display2TwoPairs.setDisable(false);
        display2ThreeOfaKind.setDisable(false);
        display2FourOfaKind.setDisable(false);
        display2SmallStraight.setDisable(false);
        display2LargeStraight.setDisable(false);
        display2FullHouse.setDisable(false);
        display2Chance.setDisable(false);
        display2Yatzy.setDisable(false);
    }

    public void disableDisplayTwo() {
        display2Ones.setDisable(true);
        display2Twos.setDisable(true);
        display2Threes.setDisable(true);
        display2Fours.setDisable(true);
        display2Fives.setDisable(true);
        display2Sixes.setDisable(true);
        display2Pair.setDisable(true);
        display2TwoPairs.setDisable(true);
        display2ThreeOfaKind.setDisable(true);
        display2FourOfaKind.setDisable(true);
        display2SmallStraight.setDisable(true);
        display2LargeStraight.setDisable(true);
        display2FullHouse.setDisable(true);
        display2Chance.setDisable(true);
        display2Yatzy.setDisable(true);
    }


    //enable the button
    public void enableRollButon() {
        rollButton.setDisable(false);
        rollButton.setImage(rollButtonImage);
        rollButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                rollButton.setImage(rollButtonHoverImage);
            }
        });
        rollButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                rollButton.setImage(rollButtonImage);
            }
        });
    }

    public void disableRollButon() {
        rollButton.setDisable(true);
        rollButton.setImage(rollButtonDisableImage);
        rollButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                rollButton.setImage(rollButtonDisableImage);
            }
        });
        rollButton.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent evt) {
                rollButton.setImage(rollButtonDisableImage);
            }
        });
    }


    /**
     * Set Images of the Dices
     **/

    public void setDice0Image() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);
        diceZero.setEffect(ds);

        switch (Roller.dice[0]) {
            case 1:
                diceZero.setImage(imageOne);
                break;
            case 2:
                diceZero.setImage(imageTwo);
                break;
            case 3:
                diceZero.setImage(imageThree);
                break;
            case 4:
                diceZero.setImage(imageFour);
                break;
            case 5:
                diceZero.setImage(imageFive);
                break;
            case 6:
                diceZero.setImage(imageSix);
                break;
        }
    }

    public void setDice1Image() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);
        diceOne.setEffect(ds);

        switch (Roller.dice[1]) {
            case 1:
                diceOne.setImage(imageOne);
                break;
            case 2:
                diceOne.setImage(imageTwo);
                break;
            case 3:
                diceOne.setImage(imageThree);
                break;
            case 4:
                diceOne.setImage(imageFour);
                break;
            case 5:
                diceOne.setImage(imageFive);
                break;
            case 6:
                diceOne.setImage(imageSix);
                break;
        }
    }

    public void setDice2Image() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);
        diceTwo.setEffect(ds);

        switch (Roller.dice[2]) {
            case 1:
                diceTwo.setImage(imageOne);
                break;
            case 2:
                diceTwo.setImage(imageTwo);
                break;
            case 3:
                diceTwo.setImage(imageThree);
                break;
            case 4:
                diceTwo.setImage(imageFour);
                break;
            case 5:
                diceTwo.setImage(imageFive);
                break;
            case 6:
                diceTwo.setImage(imageSix);
                break;
        }
    }

    public void setDice3Image() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);
        diceThree.setEffect(ds);

        switch (Roller.dice[3]) {
            case 1:
                diceThree.setImage(imageOne);
                break;
            case 2:
                diceThree.setImage(imageTwo);
                break;
            case 3:
                diceThree.setImage(imageThree);
                break;
            case 4:
                diceThree.setImage(imageFour);
                break;
            case 5:
                diceThree.setImage(imageFive);
                break;
            case 6:
                diceThree.setImage(imageSix);
                break;
        }
    }

    public void setDice4Image() {
        DropShadow ds = new DropShadow();
        ds.setOffsetY(2.0);
        ds.setOffsetX(2.0);
        ds.setColor(Color.GRAY);
        diceFour.setEffect(ds);

        switch (Roller.dice[4]) {
            case 1:
                diceFour.setImage(imageOne);
                break;
            case 2:
                diceFour.setImage(imageTwo);
                break;
            case 3:
                diceFour.setImage(imageThree);
                break;
            case 4:
                diceFour.setImage(imageFour);
                break;
            case 5:
                diceFour.setImage(imageFive);
                break;
            case 6:
                diceFour.setImage(imageSix);
                break;
        }
    }

    /**
     * CLICK ACTIONS
     **/
    public void clickDice0() {
        if (Roller.selectedDice[0]) {
            Roller.selectedDice[0] = false;
            clickedDiceZero.setOpacity(0);
        } else {
            Roller.selectedDice[0] = true;
            clickedDiceZero.setImage(new Image("model/clicked.png"));
            clickedDiceZero.setOpacity(1);
        }
    }

    public void clickDice1() {
        if (Roller.selectedDice[1]) {
            Roller.selectedDice[1] = false;
            clickedDiceOne.setOpacity(0);
        } else {
            Roller.selectedDice[1] = true;
            clickedDiceOne.setImage(new Image("model/clicked.png"));
            clickedDiceOne.setOpacity(1);
        }
    }

    public void clickDice2() {
        if (Roller.selectedDice[2]) {
            Roller.selectedDice[2] = false;
            clickedDiceTwo.setOpacity(0);
        } else {
            Roller.selectedDice[2] = true;
            clickedDiceTwo.setImage(new Image("model/clicked.png"));
            clickedDiceTwo.setOpacity(1);
        }
    }

    public void clickDice3() {
        if (Roller.selectedDice[3]) {
            Roller.selectedDice[3] = false;
            clickedDiceThree.setOpacity(0);
        } else {
            Roller.selectedDice[3] = true;
            clickedDiceThree.setImage(new Image("model/clicked.png"));
            clickedDiceThree.setOpacity(1);
        }
    }

    public void clickDice4() {
        if (Roller.selectedDice[4]) {
            Roller.selectedDice[4] = false;
            clickedDiceFour.setOpacity(0);
        } else {
            Roller.selectedDice[4] = true;
            clickedDiceFour.setImage(new Image("model/clicked.png"));
            clickedDiceFour.setOpacity(1);
        }
    }


    @FXML
    public void click1Ones() {
        //change opacity
        display1Ones.setOpacity(1);
        display1Ones.setId("");
        display1Ones.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedOnes = true;
        playerOne.setResultOnes(playerOne.calculateOnes(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Ones.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Twos() {
        //change opacity
        display1Twos.setOpacity(1);
        display1Twos.setId("");
        display1Twos.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedTwos = true;
        playerOne.setResultTwos(playerOne.calculateTwos(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Twos.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Threes() {
        //change opacity
        display1Threes.setOpacity(1);
        display1Threes.setId("");
        display1Threes.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedThrees = true;
        playerOne.setResultThrees(playerOne.calculateThrees(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Threes.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Fours() {
        //change opacity
        display1Fours.setOpacity(1);
        display1Fours.setId("");
        display1Fours.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedFours = true;
        playerOne.setResultFours(playerOne.calculateFours(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Fours.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Fives() {
        //change opacity
        display1Fives.setOpacity(1);
        display1Fives.setId("");
        display1Fives.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedFives = true;
        playerOne.setResultFives(playerOne.calculateFives(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Fives.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Sixes() {
        //change opacity
        display1Sixes.setOpacity(1);
        display1Sixes.setId("");
        display1Sixes.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedSixes = true;
        playerOne.setResultSixes(playerOne.calculateSixes(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Sixes.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Pair() {
        //change opacity
        display1Pair.setOpacity(1);
        display1Pair.setId("");
        display1Pair.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedPair = true;
        playerOne.setResultPair(playerOne.calculatePair(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Pair.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1TwoPairs() {
        //change opacity
        display1TwoPairs.setOpacity(1);
        display1TwoPairs.setId("");
        display1TwoPairs.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedTwoPairs = true;
        playerOne.setResultTwoPairs(playerOne.calculateTwoPairs(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1TwoPairs.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1ThreeOfaKind() {
        //change opacity
        display1ThreeOfaKind.setOpacity(1);
        display1ThreeOfaKind.setId("");
        display1ThreeOfaKind.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedThreeOfaKind = true;
        playerOne.setResultThreeOfaKind(playerOne.calculateThreeOfaKind(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1ThreeOfaKind.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1FourOfaKind() {
        //change opacity
        display1FourOfaKind.setOpacity(1);
        display1FourOfaKind.setId("");
        display1FourOfaKind.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedFourOfaKind = true;
        playerOne.setResultFourOfaKind(playerOne.calculateFourOfaKind(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1FourOfaKind.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1SmallStraight() {
        //change opacity
        display1SmallStraight.setOpacity(1);
        display1SmallStraight.setId("");
        display1SmallStraight.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedSmallStraight = true;
        playerOne.setResultSmallStraight(playerOne.calculateSmallStraight(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1SmallStraight.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1LargeStraight() {
        //change opacity
        display1LargeStraight.setOpacity(1);
        display1LargeStraight.setId("");
        display1LargeStraight.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedLargeStraight = true;
        playerOne.setResultLargeStraight(playerOne.calculateLargeStraight(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1LargeStraight.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1FullHouse() {
        //change opacity
        display1FullHouse.setOpacity(1);
        display1FullHouse.setId("");
        display1FullHouse.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedFullHouse = true;
        playerOne.setResultFullHouse(playerOne.calculateFullHouse(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1FullHouse.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Chance() {
        //change opacity
        display1Chance.setOpacity(1);
        display1Chance.setId("");
        display1Chance.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedChance = true;
        playerOne.setResultChance(playerOne.calculateChance(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Chance.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click1Yatzy() {
        //change opacity
        display1Yatzy.setOpacity(1);
        display1Yatzy.setId("");
        display1Yatzy.setCursor(Cursor.DEFAULT);
        playerOne.isSelectedYatzy = true;
        playerOne.setResultYatzy(playerOne.calculateYatzy(Roller.dice));
        resetScoreSheet1();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display1Yatzy.setOnMouseClicked(null);  //to make this label unclickable anymore
    }


    @FXML
    public void click2Ones() {
        //change opacity
        display2Ones.setOpacity(1);
        display2Ones.setId("");
        display2Ones.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedOnes = true;
        playerTwo.setResultOnes(playerTwo.calculateOnes(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Ones.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Twos() {
        //change opacity
        display2Twos.setOpacity(1);
        display2Twos.setId("");
        display2Twos.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedTwos = true;
        playerTwo.setResultTwos(playerTwo.calculateTwos(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Twos.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Threes() {
        //change opacity
        display2Threes.setOpacity(1);
        display2Threes.setId("");
        display2Threes.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedThrees = true;
        playerTwo.setResultThrees(playerTwo.calculateThrees(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Threes.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Fours() {
        //change opacity
        display2Fours.setOpacity(1);
        display2Fours.setId("");
        display2Fours.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedFours = true;
        playerTwo.setResultFours(playerTwo.calculateFours(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Fours.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Fives() {
        //change opacity
        display2Fives.setOpacity(1);
        display2Fives.setId("");
        display2Fives.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedFives = true;
        playerTwo.setResultFives(playerTwo.calculateFives(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Fives.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Sixes() {
        //change opacity
        display2Sixes.setOpacity(1);
        display2Sixes.setId("");
        display2Sixes.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedSixes = true;
        playerTwo.setResultSixes(playerTwo.calculateSixes(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Sixes.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Pair() {
        //change opacity
        display2Pair.setOpacity(1);
        display2Pair.setId("");
        display2Pair.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedPair = true;
        playerTwo.setResultPair(playerTwo.calculatePair(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Pair.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2TwoPairs() {
        //change opacity
        display2TwoPairs.setOpacity(1);
        display2TwoPairs.setId("");
        display2TwoPairs.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedTwoPairs = true;
        playerTwo.setResultTwoPairs(playerTwo.calculateTwoPairs(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2TwoPairs.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2ThreeOfaKind() {
        //change opacity
        display2ThreeOfaKind.setOpacity(1);
        display2ThreeOfaKind.setId("");
        display2ThreeOfaKind.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedThreeOfaKind = true;
        playerTwo.setResultThreeOfaKind(playerTwo.calculateThreeOfaKind(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2ThreeOfaKind.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2FourOfaKind() {
        //change opacity
        display2FourOfaKind.setOpacity(1);
        display2FourOfaKind.setId("");
        display2FourOfaKind.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedFourOfaKind = true;
        playerTwo.setResultFourOfaKind(playerTwo.calculateFourOfaKind(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2FourOfaKind.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2SmallStraight() {
        //change opacity
        display2SmallStraight.setOpacity(1);
        display2SmallStraight.setId("");
        display2SmallStraight.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedSmallStraight = true;
        playerTwo.setResultSmallStraight(playerTwo.calculateSmallStraight(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2SmallStraight.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2LargeStraight() {
        //change opacity
        display2LargeStraight.setOpacity(1);
        display2LargeStraight.setId("");
        display2LargeStraight.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedLargeStraight = true;
        playerTwo.setResultLargeStraight(playerTwo.calculateLargeStraight(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2LargeStraight.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2FullHouse() {
        //change opacity
        display2FullHouse.setOpacity(1);
        display2FullHouse.setId("");
        display2FullHouse.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedFullHouse = true;
        playerTwo.setResultFullHouse(playerTwo.calculateFullHouse(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2FullHouse.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Chance() {
        //change opacity
        display2Chance.setOpacity(1);
        display2Chance.setId("");
        display2Chance.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedChance = true;
        playerTwo.setResultChance(playerTwo.calculateChance(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Chance.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    @FXML
    public void click2Yatzy() {
        //change opacity
        display2Yatzy.setOpacity(1);
        display2Yatzy.setId("");
        display2Yatzy.setCursor(Cursor.DEFAULT);
        playerTwo.isSelectedYatzy = true;
        playerTwo.setResultYatzy(playerTwo.calculateYatzy(Roller.dice));
        resetScoreSheet2();
        //resetSelectedDices();
        resetRollsRectanglesDices();
        display2Yatzy.setOnMouseClicked(null);  //to make this label unclickable anymore
    }

    public void calculateTotalOne() {
        totalResultOne =
                playerOne.getResultOnes() + playerOne.getResultTwos() + playerOne.getResultThrees() + playerOne.getResultFours() + playerOne.getResultFives() + playerOne.getResultSixes() + bonusOne + playerOne.getResultPair() + playerOne.getResultTwoPairs() + playerOne.getResultThreeOfaKind() +
                        playerOne.getResultFourOfaKind() + playerOne.getResultSmallStraight() + playerOne.getResultLargeStraight() + playerOne.getResultFullHouse() +
                        playerOne.getResultChance() + playerOne.getResultYatzy();
    }

    public void calculateTotalTwo() {
        totalResultTwo =
                playerTwo.getResultOnes() + playerTwo.getResultTwos() + playerTwo.getResultThrees() + playerTwo.getResultFours() + playerTwo.getResultFives() + playerTwo.getResultSixes() + bonusTwo + playerTwo.getResultPair() + playerTwo.getResultTwoPairs() + playerTwo.getResultThreeOfaKind() +
                        playerTwo.getResultFourOfaKind() + playerTwo.getResultSmallStraight() + playerTwo.getResultLargeStraight() + playerTwo.getResultFullHouse() +
                        playerTwo.getResultChance() + playerTwo.getResultYatzy();
    }

    public void calculateSumOne() {
        sumOne = playerOne.getResultOnes() + playerOne.getResultTwos() + playerOne.getResultThrees() + playerOne.getResultFours() + playerOne.getResultFives() + playerOne.getResultSixes();
    }

    public void calculateSumTwo() {
        sumTwo = playerTwo.getResultOnes() + playerTwo.getResultTwos() + playerTwo.getResultThrees() + playerTwo.getResultFours() + playerTwo.getResultFives() + playerTwo.getResultSixes();
    }

    public void calculateBonusOne() {
        if (sumOne >= 63) {
            bonusOne = 50;
        } else {
            bonusOne = 0;
        }
    }

    public void calculateBonusTwo() {
        if (sumTwo >= 63) {
            bonusTwo = 50;
        } else {
            bonusTwo = 0;
        }
    }



    @FXML
    private void mainMenuAction(MouseEvent event) throws IOException {
        Parent mainmenu_parent = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene mainmenu_scene = new Scene(mainmenu_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(mainmenu_scene);
        app_stage.show();
    }

    @FXML
    public void changeTheme() {

        double one = 1.0;
        double zero = 0.0;

        if (menuBackground.getOpacity() == one ) {
            menuBackground.setOpacity(zero);
            backgroundHeaven.setOpacity(one);
            backgroundSky.setOpacity(zero);
        }
        else if (backgroundHeaven.getOpacity() == one ) {
            backgroundHeaven.setOpacity(zero);
            backgroundSky.setOpacity(one);
            menuBackground.setOpacity(zero);
        }
        else if (backgroundSky.getOpacity() == one ) {
            backgroundHeaven.setOpacity(zero);
            backgroundSky.setOpacity(zero);
            menuBackground.setOpacity(one);
        }
    }

    /**
     * BOT PLAYER
     **/



    private Timeline selectionTimeline = new Timeline(
            new KeyFrame(
                    Duration.seconds(2.2),
                    event -> {
                        if (botChecking()) {
                            //finish turn
                        } else {
                            botTurn2();
                        }
                    }
            ));
    private Timeline selectionTimeline2 = new Timeline(
            new KeyFrame(
                    Duration.seconds(2.2),
                    event -> {
                        if (botChecking()) {
                            //finish turn
                        } else {
                            botTurn3();
                        }
                    }
            ));
    private Timeline selectionTimeline3 = new Timeline(
            new KeyFrame(
                    Duration.seconds(1.5),
                    event -> {

                        if (botChecking()) {
                            //finish turn

                        } else {
                            if (botUpperCategorySelection()) {
                                //finish turn
                            }
                            else {
                                if (botCheckLowerCategoryFull()) {
                                    botFinishFillUpperCategory();
                                }
                                else{
                                    //choose best result from lower categories
                                    botLowerCategorySelection();
                                }
                            }

                        }
                    }
            ));

    public void botTurn1() {
        Roll();
        selectionTimeline.play();
        disableDisplayTwo();
        disableRollButon();
    }

    public void botTurn2() {
        Roll();
        selectionTimeline2.play();
        disableDisplayTwo();
        disableRollButon();
    }

    public void botTurn3() {
        Roll();
        selectionTimeline3.play();
        disableDisplayTwo();
        disableRollButon();
    }


    public boolean botChecking() {

        //Bot Start playing for bonus
        if ((numTurns >= 9) && (!botCheckHigherCategoryFull()) && (bonusTwo != 50)) {
            //first check if bot has Yatzy, SMStr,LStr
            if (botCheckYatzyStraight()) {
                if (botSelectYatzyBool()) {
                    //finish turn because checking finished
                    return true;
                }
            }
            //bot starts striving to fill the upper categories
            if (botStriveForBonus()) {
                //if strive for bonus is true bot already selected dices striving for bonus
                //so bot checking must continue after next roll
                return false;
            }
            return false;
        }

        if (botCheckYatzyStraight()) {
            if (botSelectYatzyBool()) {
                //finish turn because checking finished
                return true;
            }
        }

        if (botCheckFourEqual()) {
            botSelectFourThreeEqual();
            return false;
        }

        if (botCheckThreeEqual()) {
            botSelectFourThreeEqual();
            return false;
        }

        if (botCheckTwoEqual()) {
            if (Roller.selectedDice[0] || Roller.selectedDice[1] || Roller.selectedDice[2]
                    || Roller.selectedDice[3] || Roller.selectedDice[4]) {
                //continue
                return false;
            }
            else {
                botSelectTwoEqual();
                return false;
            }
        }

        return false;
    }


    public boolean botCheckYatzyStraight() {
        if ((ScorePlayer.isYatzy(Roller.dice)) || (ScorePlayer.isSmallStraight(Roller.dice))
                || (ScorePlayer.isLargeStraight(Roller.dice)) || (ScorePlayer.isFullHouse(Roller.dice))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean botCheckFourEqual() {
        if (maxCountSum() == 4) {
            return true;
        }

        return false;
    }

    public boolean botCheckThreeEqual() {
        if (maxCountSum() == 3) {
            return true;
        }

        return false;
    }

    public boolean botCheckTwoEqual() {
        if (maxCountSum() == 2) {
            return true;
        }

        return false;
    }

    public boolean botStriveForBonus() {

        if (maxCountSum() >= 3) {
            switch (maxCount()) {
                case 1:
                    if (!playerTwo.isSelectedOnes) {
                        botSelect1();
                        return true;
                    }
                    return false;
                case 2:
                    if (!playerTwo.isSelectedTwos) {
                        botSelect2();
                        return true;
                    }
                    return false;
                case 3:
                    if (!playerTwo.isSelectedThrees) {
                        botSelect3();
                        return true;
                    }
                    return false;
                case 4:
                    if (!playerTwo.isSelectedFours) {
                        botSelect4();
                        return true;
                    }
                    return false;
                case 5:
                    if (!playerTwo.isSelectedFives) {
                        botSelect5();
                        return true;
                    }
                    return false;
                case 6:
                    if (!playerTwo.isSelectedSixes) {
                        botSelect6();
                        return true;
                    }
                    return false;
            }
        }

        if ((botCount1(Roller.dice) >= 2) && (!playerTwo.isSelectedOnes)) {
            botSelect1();
            return true;
        }
        if ((botCount2(Roller.dice) >= 2) && (!playerTwo.isSelectedTwos)) {
            botSelect2();
            return true;
        }
        if ((botCount3(Roller.dice) >= 2) && (!playerTwo.isSelectedThrees)) {
            botSelect3();
            return true;
        }
        if ((botCount4(Roller.dice) >= 2) && (!playerTwo.isSelectedFours)) {
            botSelect4();
            return true;
        }
        if ((botCount5(Roller.dice) >= 2) && (!playerTwo.isSelectedFives)) {
            botSelect5();
            return true;
        }
        if ((botCount6(Roller.dice) >= 2) && (!playerTwo.isSelectedSixes)) {
            botSelect6();
            return true;
        }

        if ((botCount1(Roller.dice) == 1) && (!playerTwo.isSelectedOnes)) {
            botSelect1();
            return true;
        }
        if ((botCount2(Roller.dice) == 1) && (!playerTwo.isSelectedTwos)) {
            botSelect2();
            return true;
        }
        if ((botCount3(Roller.dice) == 1) && (!playerTwo.isSelectedThrees)) {
            botSelect3();
            return true;
        }
        if ((botCount4(Roller.dice) == 1) && (!playerTwo.isSelectedFours)) {
            botSelect4();
            return true;
        }
        if ((botCount5(Roller.dice) == 1) && (!playerTwo.isSelectedFives)) {
            botSelect5();
            return true;
        }
        if ((botCount6(Roller.dice) == 1) && (!playerTwo.isSelectedSixes)) {
            botSelect6();
            return true;
        }
        return false;
    }

    public boolean botSelectYatzyBool() {
        if ((ScorePlayer.isYatzy(Roller.dice)) && (!playerTwo.isSelectedYatzy)) {
            click2Yatzy();
            return true;
        } else if ((ScorePlayer.isSmallStraight(Roller.dice)) && (!playerTwo.isSelectedSmallStraight)) {
            click2SmallStraight();
            return true;
        } else if ((ScorePlayer.isLargeStraight(Roller.dice)) && (!playerTwo.isSelectedLargeStraight)) {
            click2LargeStraight();
            return true;
        }
        else if ((ScorePlayer.isFullHouse(Roller.dice)) && (!playerTwo.isSelectedFullHouse)) {
            click2FullHouse();
            return true;
        }
        else {
            return false;
        }
    }

    public boolean botUpperCategorySelection() {
        if ((botCount1(Roller.dice) >= 3) && (!playerTwo.isSelectedOnes)) {
            click2Ones();
            return true;
        }
        if ((botCount2(Roller.dice) >= 3) && (!playerTwo.isSelectedTwos)) {
            click2Twos();
            return true;
        }
        if ((botCount3(Roller.dice) >= 3) && (!playerTwo.isSelectedThrees)) {
            click2Threes();
            return true;
        }
        if ((botCount4(Roller.dice) >= 3) && (!playerTwo.isSelectedFours)) {
            click2Fours();
            return true;
        }
        if ((botCount5(Roller.dice) >= 3) && (!playerTwo.isSelectedFives)) {
            click2Fives();
            return true;
        }
        if ((botCount6(Roller.dice) >= 3) && (!playerTwo.isSelectedSixes)) {
            click2Sixes();
            return true;
        }
        return false;
    }


    public int findMaxFromLowerCategories() {      //only categories that are not already selected
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (!playerTwo.isSelectedPair) {
            list.add(playerTwo.calculatePair(Roller.dice));
        }
        if (!playerTwo.isSelectedTwoPairs) {
            list.add(playerTwo.calculateTwoPairs(Roller.dice));
        }
        if (!playerTwo.isSelectedThreeOfaKind) {
            list.add(playerTwo.calculateThreeOfaKind(Roller.dice));
        }
        if (!playerTwo.isSelectedFourOfaKind) {
            list.add(playerTwo.calculateFourOfaKind(Roller.dice));
        }
        if (!playerTwo.isSelectedSmallStraight) {
            list.add(playerTwo.calculateSmallStraight(Roller.dice));
        }
        if (!playerTwo.isSelectedLargeStraight) {
            list.add(playerTwo.calculateLargeStraight(Roller.dice));
        }
        if (!playerTwo.isSelectedFullHouse) {
            list.add(playerTwo.calculateFullHouse(Roller.dice));
        }
        if (!playerTwo.isSelectedChance) {
            list.add(playerTwo.calculateChance(Roller.dice));
        }
        if (!playerTwo.isSelectedYatzy) {
            list.add(playerTwo.calculateYatzy(Roller.dice));
        }

       try{
           Object max = Collections.max(list);

           int maxInteger = (int) max;
           return maxInteger;
       }
       catch (NoSuchElementException e) {

           throw new NoSuchElementException();
       }
    }

    public void botLowerCategorySelection() {

        if ((playerTwo.calculateLargeStraight(Roller.dice) == findMaxFromLowerCategories()) && (!playerTwo.isSelectedLargeStraight)) {
            click2LargeStraight();
            return;
        }

        if ((playerTwo.calculateSmallStraight(Roller.dice) == findMaxFromLowerCategories()) && (!playerTwo.isSelectedSmallStraight)){
            click2SmallStraight();
            return;
        }

        if ((playerTwo.calculateYatzy(Roller.dice) == findMaxFromLowerCategories()) && (!playerTwo.isSelectedYatzy)) {
            click2Yatzy();
            return;
        }

        if ((playerTwo.calculateFullHouse(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedFullHouse)){
            click2FullHouse();
            return;
        }

        if ((playerTwo.calculateFourOfaKind(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedFourOfaKind)){
            click2FourOfaKind();
            return;
        }

        if ((playerTwo.calculateThreeOfaKind(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedThreeOfaKind)){
            click2ThreeOfaKind();
            return;
        }

        if ((playerTwo.calculateChance(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedChance)){
            click2Chance();
            return;
        }

        if ((playerTwo.calculateTwoPairs(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedTwoPairs)){
            click2TwoPairs();
            return;
        }

        if ((playerTwo.calculatePair(Roller.dice) == findMaxFromLowerCategories())  && (!playerTwo.isSelectedPair)){
            click2Pair();
            return;
        }
    }

    public boolean botCheckHigherCategoryFull() {
        if (playerTwo.isSelectedOnes
                && playerTwo.isSelectedTwos
                && playerTwo.isSelectedThrees
                && playerTwo.isSelectedFours
                && playerTwo.isSelectedFives
                && playerTwo.isSelectedSixes) {
            return true;
        }
        return false;
    }

    public boolean botCheckLowerCategoryFull() {
        if (playerTwo.isSelectedPair
                && playerTwo.isSelectedTwoPairs
                && playerTwo.isSelectedThreeOfaKind
                && playerTwo.isSelectedFourOfaKind
                && playerTwo.isSelectedSmallStraight
                && playerTwo.isSelectedLargeStraight
                && playerTwo.isSelectedFullHouse
                && playerTwo.isSelectedChance
                && playerTwo.isSelectedYatzy) {
            return true;
        }
        return false;
    }

    public void botFinishFillUpperCategory() {
        if ((botCount1(Roller.dice) > 1) && (!playerTwo.isSelectedOnes)) {
            click2Ones();
        }
        if ((botCount2(Roller.dice) > 1) && (!playerTwo.isSelectedTwos)) {
            click2Twos();

        }
        if ((botCount3(Roller.dice) > 1) && (!playerTwo.isSelectedThrees)) {
            click2Threes();

        }
        if ((botCount4(Roller.dice) > 1) && (!playerTwo.isSelectedFours)) {
            click2Fours();

        }
        if ((botCount5(Roller.dice) > 1) && (!playerTwo.isSelectedFives)) {
            click2Fives();

        }
        if ((botCount6(Roller.dice) > 1) && (!playerTwo.isSelectedSixes)) {
            click2Sixes();
        }

        if (!playerTwo.isSelectedOnes) {
            click2Ones();
        }
        if ((!playerTwo.isSelectedTwos)) {
            click2Twos();

        }
        if ((!playerTwo.isSelectedThrees)) {
            click2Threes();

        }
        if ((!playerTwo.isSelectedFours)) {
            click2Fours();

        }
        if ((!playerTwo.isSelectedFives)) {
            click2Fives();

        }
        if ((!playerTwo.isSelectedSixes)) {
            click2Sixes();
        }


    }

    public void botUnselectAll() {
        Roller.selectedDice[0] = false;
        Roller.selectedDice[1] = false;
        Roller.selectedDice[2] = false;
        Roller.selectedDice[3] = false;
        Roller.selectedDice[4] = false;
        clickedDiceZero.setOpacity(0);
        clickedDiceOne.setOpacity(0);
        clickedDiceTwo.setOpacity(0);
        clickedDiceThree.setOpacity(0);
        clickedDiceFour.setOpacity(0);
        clickedDiceZero.setImage(null);
        clickedDiceOne.setImage(null);
        clickedDiceTwo.setImage(null);
        clickedDiceThree.setImage(null);
        clickedDiceFour.setImage(null);
    }

    public void botSelect1() {
        botUnselectAll();
        if (Roller.dice[0] == 1) {
            clickDice0();
        }

        if (Roller.dice[1] == 1) {
            clickDice1();
        }

        if (Roller.dice[2] == 1) {
            clickDice2();
        }

        if (Roller.dice[3] == 1) {
            clickDice3();
        }

        if (Roller.dice[4] == 1) {
            clickDice4();
        }
    }

    public void botSelect2() {
        botUnselectAll();
        if (Roller.dice[0] == 2) {
            clickDice0();
        }

        if (Roller.dice[1] == 2) {
            clickDice1();
        }

        if (Roller.dice[2] == 2) {
            clickDice2();
        }

        if (Roller.dice[3] == 2) {
            clickDice3();
        }

        if (Roller.dice[4] == 2) {
            clickDice4();
        }
    }

    public void botSelect3() {
        botUnselectAll();
        if (Roller.dice[0] == 3) {
            clickDice0();
        }

        if (Roller.dice[1] == 3) {
            clickDice1();
        }

        if (Roller.dice[2] == 3) {
            clickDice2();
        }

        if (Roller.dice[3] == 3) {
            clickDice3();
        }

        if (Roller.dice[4] == 3) {
            clickDice4();
        }
    }

    public void botSelect4() {
        botUnselectAll();
        if (Roller.dice[0] == 4) {
            clickDice0();
        }

        if (Roller.dice[1] == 4) {
            clickDice1();
        }

        if (Roller.dice[2] == 4) {
            clickDice2();
        }

        if (Roller.dice[3] == 4) {
            clickDice3();
        }

        if (Roller.dice[4] == 4) {
            clickDice4();
        }
    }

    public void botSelect5() {
        botUnselectAll();
        if (Roller.dice[0] == 5) {
            clickDice0();
        }

        if (Roller.dice[1] == 5) {
            clickDice1();
        }

        if (Roller.dice[2] == 5) {
            clickDice2();
        }

        if (Roller.dice[3] == 5) {
            clickDice3();
        }

        if (Roller.dice[4] == 5) {
            clickDice4();
        }
    }

    public void botSelect6() {
        botUnselectAll();
        if (Roller.dice[0] == 6) {
            clickDice0();
        }

        if (Roller.dice[1] == 6) {
            clickDice1();
        }

        if (Roller.dice[2] == 6) {
            clickDice2();
        }

        if (Roller.dice[3] == 6) {
            clickDice3();
        }

        if (Roller.dice[4] == 6) {
            clickDice4();
        }
    }

    public void botSelectFourThreeEqual() {
        int num = maxCount();

        switch (num) {
            case 1:
                botSelect1();
                break;
            case 2:
                botSelect2();
                break;
            case 3:
                botSelect3();
                break;
            case 4:
                botSelect4();
                break;
            case 5:
                botSelect5();
                break;
            case 6:
                botSelect6();
                break;
        }
    }

    public void botSelectTwoEqual() {
        int num = maxCount();

        switch (num) {
            case 6:
                botSelect6();
                break;
            case 5:
                botSelect5();
                break;
            case 4:
                botSelect4();
                break;
            case 3:
                botSelect3();
                break;
            case 2:
                botSelect2();
                break;
            case 1:
                botSelect1();
                break;
        }
    }

    public int botCount1(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                count++;
            }
        }
        return count;
    }

    public int botCount2(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 2) {
                count++;
            }
        }
        return count;
    }

    public int botCount3(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 3) {
                count++;
            }
        }
        return count;
    }

    public int botCount4(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 4) {
                count++;
            }
        }
        return count;
    }

    public int botCount5(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 5) {
                count++;
            }
        }
        return count;
    }

    public int botCount6(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 6) {
                count++;
            }
        }
        return count;
    }

    //array with counts used for finding the largest of them


    //find which number you have most
    public int maxCount() {
        int[] countsArray = {0, botCount1(Roller.dice), botCount2(Roller.dice),
                botCount3(Roller.dice), botCount4(Roller.dice), botCount5(Roller.dice),
                botCount6(Roller.dice)};

        int max = -10;
        int maxCount = -1;

        for (int i = 6; i > 0; i--) {
            if (countsArray[i] > max) {
                max = countsArray[i];
                maxCount = i;
            }
        }
        //print the number of count method
        return maxCount;
    }

    //find how many you have from the maxCount
    public int maxCountSum() {
        int[] countsArray = {0, botCount1(Roller.dice), botCount2(Roller.dice),
                botCount3(Roller.dice), botCount4(Roller.dice), botCount5(Roller.dice),
                botCount6(Roller.dice)};
        int max = -10;

        for (int i = 1; i < countsArray.length; i++) {
            if (countsArray[i] > max) {
                max = countsArray[i];
            }
        }
        //print the number of count method
        return max;
    }
}




