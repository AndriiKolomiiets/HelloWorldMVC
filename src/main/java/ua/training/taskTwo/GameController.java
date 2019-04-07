package ua.training.taskTwo;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Andrii Kolomiiets on 07.04.2019
 */
public class GameController {
    private GameModel model;
    private GameView view;

    /**
     * GameController class process user input, verify it and call Class GameModel in case input is valid.
     * GameController calls GameView Class in case user input isn't valid and for printing result after processing in GameModel Class.
     */

    GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
    }

    public void playTheGame() {
        Scanner in = new Scanner(System.in);
        setRandomRange(in);
        model.setRandomNumber(getRandomNumber(model.getMinBorder(), model.getMaxBorder()));
        view.printMessage(view.getRandomRangeMessage(model.getMinBorder(), model.getMaxBorder()));
        boolean isGuess = true;
        while (isGuess) {
            int userGuess = model.compareUserGuessWithRandNumber(getUserGuess(in));
            if (userGuess == 0) {
                view.printMessage(view.LARGER);
            } else if (userGuess == 1) {
                view.printMessage(view.SMALLER);
            } else {
                view.printMessage(view.WIN_MESSAGE + model.getRandomNumber());
                isGuess = false;
            }
        }
        view.printUserHistory(model.getUserHistory());
        in.close();
    }

    public void setRandomRange(Scanner scanner) {
        view.printMessage(view.WELCOME_MESSAGE + view.INPUT_START_RANGE_MESSAGE);
        if (scanner.hasNextInt()) {
            int inputMinBorder = scanner.nextInt();
            if (inputMinBorder > model.getMinBorder() || inputMinBorder < model.getMaxBorder()) {
                model.setMinBorder(inputMinBorder);
            }
        } else {
            view.printMessage(view.WRONG_INPUT_MESSAGE + view.DEFAULT_MIN_LIMIT_MESSAGE);
            model.setMinBorder(model.getDefaultMinLimit());
        }

        view.printMessage(view.INPUT_END_RANGE_MESSAGE);
        if (scanner.hasNextInt()) {
            int inputMaxBorder = scanner.nextInt();
            if (inputMaxBorder > model.getMinBorder() || inputMaxBorder < model.getMaxBorder()) {
                model.setMaxBorder(inputMaxBorder);
            }
        } else {
            view.printMessage(view.WRONG_INPUT_MESSAGE + view.DEFAULT_MAX_LIMIT_MESSAGE);
            model.setMaxBorder(model.getDefaultMaxLimit());
        }
    }

    public int getUserGuess(Scanner scanner) {
        int userInput;
        view.printMessage(view.INPUT_MESSAGE);
        while (!scanner.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_MESSAGE + view.getRandomRangeMessage(model.getMinBorder(), model.getMaxBorder())
                    + view.GAME_RANGE_WARNING_MESSAGE);
            userInput = scanner.nextInt();
        }

        userInput = scanner.nextInt();
        while (userInput < model.getMinBorder() || userInput > model.getMaxBorder()) {
            view.printMessage(view.OUT_OF_RANGE_MESSAGE +
                    view.getRandomRangeMessage(model.getMinBorder(), model.getMaxBorder()) + view.INPUT_MESSAGE);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public int getRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Max number must be greater than min!");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
