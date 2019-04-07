package ua.training.taskTwo;

/**
 * Created by Andrii Kolomiiets on 07.04.2019
 */

public class MoreLessGameMVC {
    public static void main(String[] args) {
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView();
        GameController gameController = new GameController(gameModel,gameView);
        gameController.playTheGame();
    }
}
