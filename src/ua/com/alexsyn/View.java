package ua.com.alexsyn;

/**
 * Created by Alexandr on 18.07.2017.
 */
public class View {
    // Text's constants
    public static final String INPUT_HELLO = "Enter 'Hello': ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please!";
    public static final String OUR_DATA = "Updated string: ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndData(String message, String data) {
        System.out.println(message + data);
    }
}