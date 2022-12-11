package animals;

public class Validation {

    public static String validateStandardStr(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }

    public static String validateStandardStr(String value, String substitution) {
        return (value == null || value.isEmpty() || value.isBlank()) ? substitution : value;
    }

    public static Integer validateStandardInteger(Integer value, Integer substitution) {
        return (value == null || value <= 0) ? substitution : value;
    }

}
