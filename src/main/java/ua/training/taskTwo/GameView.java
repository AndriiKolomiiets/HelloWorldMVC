package ua.training.taskTwo;

/**
 * Created by Andrii Kolomiiets on 07.04.2019
 */

public class GameView {
    public final String WELCOME_MESSAGE = "Hello! To start the game input game range.\nIt includes two numbers from 1 to 100.\n";
    public final String INPUT_START_RANGE_MESSAGE = "Input start number: ";
    public final String WRONG_INPUT_MESSAGE = "Wrong input.\n";
    public final String DEFAULT_MIN_LIMIT_MESSAGE = "Your min limit now is default and equal 0.";
    public final String DEFAULT_MAX_LIMIT_MESSAGE = "Your max limit now is default and equal 100.";
    public final String INPUT_END_RANGE_MESSAGE = "Input end number: ";
    public  final String INPUT_MESSAGE = "Guess the number: ";
//    public final String FAIL_MESSAGE = "Oops! You missed... \n";
    public final String WIN_MESSAGE = "Well done! You guessed! The game number is ";
    public final String LARGER = "The game number is larger. ";
    public final String SMALLER = "The game number is smaller. ";
    public final String RANGE_RULE_BREAKE_MESSAGE = "Max number must be greater than min!";
    public final String GAME_RANGE_WARNING_MESSAGE = "Please, keep it in mind while guessing the number.\nWrong inputs won't be accepted!\n";
    public final String OUT_OF_RANGE_MESSAGE = "Your number is out of game range! Please, pay attention.";

    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printUserHistory(User user){
        System.out.println(user);
    }

    public String getRandomRangeMessage(int start, int end){
        return "Game range is between " + start + " and " + end + "\n";
    }
}
