package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validation {

    public static String validateStandard(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }

    public static int validateStandardInt(Integer value) {
        return value != null && value > -1 ? value : 0;
    }

    public static Double validateStandardDouble(Double value) {
        return value > -0.01 ? value : 0.0;
    }

    public static Integer validateYear(Integer value) {
        if (value < 1950 || value > LocalDate.now().getYear()) {
            return 0;
        }
        return value;
    }

    public static String validateColor(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "белый";
    }

    public static Double validateEngineVolume(Double value) {
        return value <= 0 ? value : 1.5;
    }

    public static int validateQuantityOfSeats(int value) {
        return value < 0 ? value : 4;
    }

    public static String checkingNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            return "Номер введён не корректно!";
        }
    }

    public static String validateTireSeasonality(String value) {
        if (value != null && !value.isEmpty() && !value.isBlank()) {
            if (value.equals("w") || value.equals("W")) {
                return "Зимняя резина";
            } else if (value.equals("s") || value.equals("S")) {
                return "Необходимо сменить летнюю резину на зимнюю";
            }
        }
        return "default";
    }

    public static boolean isValidateNumber(String number) {
        if (Pattern.matches("[а-яА-Яa-zA-z0-9]{9}", number)) {
            return true;
        } else {
            return false;
        }
    }

    public static LocalDate checkValidityPeriod(LocalDate validityPeriod) {
        if (LocalDate.now().isAfter(validityPeriod)) {
            return LocalDate.now();
        } else {
            return validityPeriod;
        }
    }

    public static double validateCostInsurance(double value) {
        return value > 0 ? value : 1000;
    }

    public static double validateFuelPercentage(Double value) {
        if (value == null || value < 0.00 || value > 100.00) {
            return 0.0;
        } else {
            return value;
        }
    }

}