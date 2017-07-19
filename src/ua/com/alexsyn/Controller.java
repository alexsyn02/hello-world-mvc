package ua.com.alexsyn;

import java.util.Scanner;

/**
 * Created by Alexandr on 18.07.2017.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputValueWithScanner(sc));
        view.printMessage("Updating entered string to a sentence...");
        model.addStringOurValue(", World!");

        view.printMessageAndData(view.OUR_DATA, model.getValue());
    }

    // The Utility methods
    public String inputValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_HELLO);
        String value = "";
        while(!(value = sc.next()).equals("Hello")) {
            view.printMessage(view.WRONG_INPUT_DATA + " " + view.INPUT_HELLO);
        }
        return value;
    }
}