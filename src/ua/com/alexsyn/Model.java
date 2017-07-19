package ua.com.alexsyn;

/**
 * Created by Alexandr on 18.07.2017.
 */
public class Model {
    private String value;

    // The Program logic

    /**
     * in this method add valueString with this.value
     * @param valueString
     * @return concat
     */
    public String addStringOurValue(String valueString) {
        return value += valueString;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
