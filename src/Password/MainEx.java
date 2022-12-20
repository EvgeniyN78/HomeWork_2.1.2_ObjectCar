package Password;

public class MainEx {
    public static void main(String[] args) {

        boolean success = Data.validate("kjsljf", "ljslfjlsjf", "ljslfjlsjf");
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");

        }

    }
}
