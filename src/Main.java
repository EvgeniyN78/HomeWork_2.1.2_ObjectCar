import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("", null, 0, null, -2015, "w",
                "МКПП","седан", "х000хх000", 5, "s");
        Car.Key ladaGrantaKey = ladaGranta.new Key("нет", "нет");
        Car.Insurance ladaGrantaInsurance = ladaGranta.new Insurance(LocalDate.of(2003, 9,6), 5000, "123456789");
        ladaGranta.setKey(ladaGrantaKey);
        ladaGranta.setInsurance(ladaGrantaInsurance);
//
//        Car audiA8 = new Car("Audi","A8 50 L TDI quattro", 3.0, "Чёрный", 2020,
//                "Германия", "АКПП", "", "", 5, "W");
//        Car bmvZ8 = new Car("BMW","Z8", 3.0, "Чёрный", 2021,
//                "Германия", "АКПП", "", "", 5, "S");
//        Car kiaSportage = new Car("Kia","Sportage", 2.4, "Красный", 2018,
//                "Южная Корея", "АКПП", "", "", 5, "зима");
//        Car hyundaiAvante = new Car("Hyundai","Avante", 1.6, "Оранжевый", 2016,
//                "Южная Корея", "АКПП", "", "22ааа22ааа", 5, "лето");

        System.out.println(ladaGranta);
//        System.out.println(audiA8);
//        System.out.println(bmvZ8);
//        System.out.println(kiaSportage);
//        System.out.println(hyundaiAvante);
    }
}
