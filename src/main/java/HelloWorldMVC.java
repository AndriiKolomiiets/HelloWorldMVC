public class HelloWorldMVC {
    public static void main(String[] args) {
        Model mvcModel = new Model();
        View mvcView = new View();
        Controller mvcController = new Controller(mvcModel,mvcView);
        mvcController.processUserInput();
    }
}
