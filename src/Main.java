import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("", null, 0, null, -2015, "w",
                "МКПП","седан", "х000хх000", 5, "s");
        Car.Key ladaGrantaKey = ladaGranta.new Key("нет", "нет");
        Car.Insurance ladaGrantaInsurance = ladaGranta.new Insurance(LocalDate.of(2003, 9,6), 5000, "12345678j");
        ladaGranta.setKey(ladaGrantaKey);
        ladaGranta.setInsurance(ladaGrantaInsurance);

        Car audiA8 = new Car("Audi","A8 50 L TDI quattro", 3.0, "Чёрный", 2020,
                "Германия", "АКПП", "", "", 5, "W");
        Car.Key audiA8Key = audiA8.new Key("да", "да");
        Car.Insurance audiA8Insurance = audiA8.new Insurance(LocalDate.of(2023, 7,4), 8000, "1234орв8j");
        ladaGranta.setKey(audiA8Key);
        ladaGranta.setInsurance(audiA8Insurance);

        Car bmvZ8 = new Car("BMW","Z8", 3.0, "Чёрный", 2021,
                "Германия", "АКПП", "", "", 5, "S");
        Car.Key bmvZ8Key = bmvZ8.new Key("да", "да");
        Car.Insurance bmvZ8Insurance = bmvZ8.new Insurance(LocalDate.of(2023, 7,4), 8000, "1234орв8j");
        ladaGranta.setKey(bmvZ8Key);
        ladaGranta.setInsurance(bmvZ8Insurance);

        Car kiaSportage = new Car("Kia","Sportage", 2.4, "Красный", 2018,
                "Южная Корея", "АКПП", "", "", 5, "зима");
        Car.Key kiaSportageKey = kiaSportage.new Key("нет", "нет");
        Car.Insurance kiaSportageInsurance = kiaSportage.new Insurance(LocalDate.of(2003, 9,6), 5000, "12345678j");
        ladaGranta.setKey(kiaSportageKey);
        ladaGranta.setInsurance(kiaSportageInsurance);

        Car hyundaiAvante = new Car("Hyundai","Avante", 1.6, "Оранжевый", 2016,
                "Южная Корея", "АКПП", "", "22ааа22ааа", 5, "лето");
        Car.Key hyundaiAvanteKey = hyundaiAvante.new Key("нет", "нет");
        Car.Insurance hyundaiAvanteInsurance = hyundaiAvante.new Insurance(LocalDate.of(2003, 9,6), 5000, "12345678j");
        ladaGranta.setKey(hyundaiAvanteKey);
        ladaGranta.setInsurance(hyundaiAvanteInsurance);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmvZ8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);
    }
}
