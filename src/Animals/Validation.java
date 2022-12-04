package Animals;

public class Validation {

    public static String validateStandardStr(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }

    public static int validateStandardInteger(Integer value) {
        return value != null && value > -1 ? value : 0;
    }

}
