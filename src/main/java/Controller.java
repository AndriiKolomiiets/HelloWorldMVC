import java.util.Scanner;

public class Controller {
    private final String FIRST_WORD = "Hello";
    private final String SECOND_WORD = "world!";
    private Model model;
    private View view;

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
