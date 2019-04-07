package ua.training.taskTwo;

/**
 * Created by Andrii Kolomiiets on 07.04.2019
 */

public class GameModel {
    private int theRandomNumber;
    private int minBorder;
    private int maxBorder;
    private final int DEFAULT_MIN_LIMIT = 0;
    private final int DEFAULT_MAX_LIMIT = 100;
    User user = new User();

    public int getMinBorder() {
        return minBorder;
    }

    public void setMinBorder(int minBorder) {
        this.minBorder = minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setMaxBorder(int maxBorder) {
        this.maxBorder = maxBorder;
    }

    public int getDefaultMinLimit() {
        return DEFAULT_MIN_LIMIT;
    }

    public int getDefaultMaxLimit() {
        return DEFAULT_MAX_LIMIT;
    }

    public void setRandomNumber(int randNumber) {
        this.theRandomNumber = randNumber;
    }

    public int getRandomNumber() {
        return theRandomNumber;
    }

    public int compareUserGuessWithRandNumber(int userGuess) {
        user.addToUserGuessList(userGuess);
        user.addAttempt();
        if (userGuess == theRandomNumber) {
            return -1;
        } else if (userGuess > theRandomNumber) {
            maxBorder = userGuess;
            return 1;
        } else {
            minBorder = userGuess;
            return 0;
        }
    }

    public User getUserHistory() {
        return user;
    }

}
