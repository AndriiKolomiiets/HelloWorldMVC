package ua.training.taskOne;

import java.util.Scanner;

/**
 * Created by Andrii Kolomiiets on 03.04.2019
 */
public class Controller {
    private final String FIRST_WORD = "Hello";
    private final String SECOND_WORD = "world!";
    private Model model;
    private View view;

    /**
     * Controller class process user input, verify it and call Class Model in case input is valid.
     * Controller calls View Class in case user input isn't valid and for printing result after processing in Model Class.
     */

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        Scanner in = new Scanner(System.in);
        model.setMessage(getUserInput(in));
        model.formTheMessage(getUserInput(in));

        view.printMessage(model.getMessage());
        in.close();
    }

    public String getUserInput(Scanner scanner) {
        view.printMessage(view.INPUT_MESSAGE);
        String input = scanner.next();
        while (!input.equals(FIRST_WORD) && !input.equals(SECOND_WORD)) {
            view.printMessage(view.FAIL_MESSAGE + view.INPUT_MESSAGE);
            input = scanner.next();
        }
        return input;
    }
}
