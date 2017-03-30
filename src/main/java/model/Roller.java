package model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.util.Random;

/**
 * Created by Pasko on 21-Aug-16.
 */
public class Roller {

    public static int[] dice = new int[5];
    public static boolean[] selectedDice = new boolean[5];
    private static int rollNum = 0;


    @FXML
    public static void rollDices(){
            rollNum++;
            Random randomGenerator = new Random();
            //generate the random numbers and save them in array
            for (int i = 0; i < dice.length; i++) {
                if (!selectedDice[i]) {
                    int randomInt = randomGenerator.nextInt(6) + 1;
                    dice[i] = randomInt;
                }
            }
    }

    public static int getRollNum() {
        return rollNum;
    }
    public static void resetRollNum() {
        rollNum = 0;
    }
}
