package ua.training.taskTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrii Kolomiiets on 07.04.2019
 */

public class User {
    private int numberOfAttempts;
    private List<Integer> userInputList = new ArrayList<Integer>();

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void addAttempt() {
        this.numberOfAttempts++;
    }

    public List<Integer> getUserInputList() {
        return userInputList;
    }

    public void addToUserGuessList(Integer userInput) {
        this.userInputList.add(userInput);
    }

    @Override
    public String toString(){
        return "In this game you made " + getNumberOfAttempts() + " attempt(s).\nYou made next suggestions:" + getUserInputList();
    }
}
