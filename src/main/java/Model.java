/**
 * Created by Andrii Kolomiiets on 03.04.2019
 */

public class Model {
private String message;

public String setMessage(String userInput){
    return message = userInput;
}

public String formTheMessage(String userInput){
    return message += " " + userInput;
}

public String getMessage(){
    return message;
}

}
