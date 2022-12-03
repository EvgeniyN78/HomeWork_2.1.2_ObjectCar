import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//regionCars
        Car ladaGranta = new Car("", null, 0, null, -2015, "",
                "МКПП", "седан", "х000хх000", 5, "s", 0, 75.00, "бензин");
        Car.Key ladaGrantaKey = ladaGranta.new Key("нет", "нет");
        Car.Insurance ladaGrantaInsurance = ladaGranta.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
        ladaGranta.setKey(ladaGrantaKey);
        ladaGranta.setInsurance(ladaGrantaInsurance);

        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020,
                "Германия", "АКПП", "", "", 5, "W", 0, 75.00, "электро");
        Car.Key audiA8Key = audiA8.new Key("да", "да");
        Car.Insurance audiA8Insurance = audiA8.new Insurance(LocalDate.of(2023, 7, 4), 8000, "12g4орв8j");
        audiA8.setKey(audiA8Key);
        audiA8.setInsurance(audiA8Insurance);

        Car bmvZ8 = new Car("BMW", "Z8", 3.0, "Чёрный", 2021,
                "Германия", "АКПП", "", "", 5, "S", 0, 75.00, "бензин");
        Car.Key bmvZ8Key = bmvZ8.new Key("да", "да");
        Car.Insurance bmvZ8Insurance = bmvZ8.new Insurance(LocalDate.of(2023, 7, 4), 8000, "1234орв8j");
        bmvZ8.setKey(bmvZ8Key);
        bmvZ8.setInsurance(bmvZ8Insurance);

        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "Красный", 2018,
                "Южная Корея", "АКПП", "", "", 5, "зима", 0, 75.00, "дизель");
        Car.Key kiaSportageKey = kiaSportage.new Key("нет", "нет");
        Car.Insurance kiaSportageInsurance = kiaSportage.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
        kiaSportage.setKey(kiaSportageKey);
        kiaSportage.setInsurance(kiaSportageInsurance);

        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016,
                "Южная Корея", "АКПП", "", "22ааа22ааа", 5, "лето", 0, 75.00, "газ");
        Car.Key hyundaiAvanteKey = hyundaiAvante.new Key("нет", "нет");
        Car.Insurance hyundaiAvanteInsurance = hyundaiAvante.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
        hyundaiAvante.setKey(hyundaiAvanteKey);
        hyundaiAvante.setInsurance(hyundaiAvanteInsurance);
//endregion
        System.out.println(ladaGranta);
        ladaGranta.refill();
        System.out.println(audiA8);
        audiA8.refill();
        System.out.println(bmvZ8);
        bmvZ8.refill();
        System.out.println(kiaSportage);
        kiaSportage.refill();
        System.out.println(hyundaiAvante);
        hyundaiAvante.refill();

//        regionTrain
        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", "", 3500,
                0.0, "Белорусский вокзал", "Минск-Пассажирский", 11, 0, 75.00, "дизель");

        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", "", 1700,
                0.0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 270, 75.00, "дизель");

        System.out.println(lastochka);
        lastochka.refill();
        System.out.println(leningrad);
        leningrad.refill();
//        endregion

//        regionBus

        Bus ikarus = new Bus("Икарус", "a7500", 1980, "Венгрия", "Жёлтый", 160, 10, "дизель");
        Bus mersedes = new Bus("Мерседес", "Спринтер", 2022, "Германия", "", 200, 5.00, "бензин");
        Bus paz = new Bus("ПАЗ", "320530-04", 2017, " ", " ", 160, 190, "газ");

        System.out.println(ikarus);
        ikarus.refill();
        System.out.println(mersedes);
        mersedes.refill();
        System.out.println(paz);
        paz.refill();

//        endregion

    }

}
