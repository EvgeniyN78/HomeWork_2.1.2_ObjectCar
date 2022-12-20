import transport.*;
//import transport.Car.Key;
//import transport.Car.Insurance;
import transport.PassengerCars;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//regionCars
//        Car ladaGranta = new Car("", null, 0, null, -2015, "",
//                "МКПП", "седан", "х000хх000", 5, "s", 0, 75.00, "бензин");
//        Car.Key ladaGrantaKey = ladaGranta.new Key("нет", "нет");
//        Car.Insurance ladaGrantaInsurance = ladaGranta.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
//        ladaGranta.setKey(ladaGrantaKey);
//        ladaGranta.setInsurance(ladaGrantaInsurance);
//
//        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020,
//                "Германия", "АКПП", "", "", 5, "W", 0, 75.00, "электро");
//        Car.Key audiA8Key = audiA8.new Key("да", "да");
//        Car.Insurance audiA8Insurance = audiA8.new Insurance(LocalDate.of(2023, 7, 4), 8000, "12g4орв8j");
//        audiA8.setKey(audiA8Key);
//        audiA8.setInsurance(audiA8Insurance);
//
//        Car bmvZ8 = new Car("BMW", "Z8", 3.0, "Чёрный", 2021,
//                "Германия", "АКПП", "", "", 5, "S", 0, 75.00, "бензин");
//        Car.Key bmvZ8Key = bmvZ8.new Key("да", "да");
//        Car.Insurance bmvZ8Insurance = bmvZ8.new Insurance(LocalDate.of(2023, 7, 4), 8000, "1234орв8j");
//        bmvZ8.setKey(bmvZ8Key);
//        bmvZ8.setInsurance(bmvZ8Insurance);
//
//        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "Красный", 2018,
//                "Южная Корея", "АКПП", "", "", 5, "зима", 0, 75.00, "дизель");
//        Car.Key kiaSportageKey = kiaSportage.new Key("нет", "нет");
//        Car.Insurance kiaSportageInsurance = kiaSportage.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
//        kiaSportage.setKey(kiaSportageKey);
//        kiaSportage.setInsurance(kiaSportageInsurance);
//
//        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016,
//                "Южная Корея", "АКПП", "", "22ааа22ааа", 5, "лето", 0, 75.00, "газ");
//        Car.Key hyundaiAvanteKey = hyundaiAvante.new Key("нет", "нет");
//        Car.Insurance hyundaiAvanteInsurance = hyundaiAvante.new Insurance(LocalDate.of(2003, 9, 6), 5000, "12345678j");
//        hyundaiAvante.setKey(hyundaiAvanteKey);
//        hyundaiAvante.setInsurance(hyundaiAvanteInsurance);
////endregion
//        System.out.println(ladaGranta);
//        ladaGranta.refill();
//        System.out.println(audiA8);
//        audiA8.refill();
//        System.out.println(bmvZ8);
//        bmvZ8.refill();
//        System.out.println(kiaSportage);
//        kiaSportage.refill();
//        System.out.println(hyundaiAvante);
//        hyundaiAvante.refill();
//
//        regionTrain
//        Train lastochka = new Train("Ласточка", "B-901", 2011, "России", "", 3500,
//                0.0, "Белорусский вокзал", "Минск-Пассажирский", 11, 0, 75.00, "дизель");
//
//        Train leningrad = new Train("Ленинград", "D-125", 2019, "России", "", 1700,
//                0.0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 270, 75.00, "дизель");
//
//        System.out.println(lastochka);
//        lastochka.refill();
//        System.out.println(leningrad);
//        leningrad.refill();
////        endregion
//
//        regionBus
//
//        Bus ikarus = new Bus("Икарус", "a7500", 1980, "Венгрия", "Жёлтый", 160, 10, "дизель");
//        Bus mersedes = new Bus("Мерседес", "Спринтер", 2022, "Германия", "", 200, 5.00, "бензин");
//        Bus paz = new Bus("ПАЗ", "320530-04", 2017, " ", " ", 160, 190, "газ");
//
//        System.out.println(ikarus);
//        ikarus.refill();
//        System.out.println(mersedes);
//        mersedes.refill();
//        System.out.println(paz);
//        paz.refill();
//
//        endregion

//    }



//        LicenseD ivanov = new LicenseD("Иванов И.И.", "D", 12);
//        LicenseD fedorov = new LicenseD("Фёдоров И.И.", "D", 22);
//        LicenseD smirnov = new LicenseD("Смирнов И.И.", "D", 16);
//        LicenseD carpov = new LicenseD("Карпов И.И.", "D", 32);
//        LicenseC tarasov = new LicenseC("Тарасов И.И.", "C", 25);
//        LicenseC panov = new LicenseC("Панов И.И.", "C", 8);
//        LicenseC costin = new LicenseC("Костин И.И.", "C", 26);
//        LicenseC livanov = new LicenseC("Ливанов И.И.", "C", 4);
//        LicenseB prohorov = new LicenseB("Прохоров И.И.", "B", 21);
//        LicenseB shalyapin = new LicenseB("Шаляпин И.И.", "B", 11);
//        LicenseB sidorov = new LicenseB("Сидоров И.И.", "B", 7);
//        LicenseB klimov = new LicenseB("Климов И.И.", "B", 19);


//        System.out.println(prohorov.getStartMessage(ford));
//        System.out.println(shalyapin.getStartMessage(volvo));
//        System.out.println(sidorov.getStartMessage(toyota));
//        System.out.println(klimov.getStartMessage(volkswagen));
//        System.out.println(tarasov.getStartMessage(kamaz));
//        System.out.println(panov.getStartMessage(renault));
//        System.out.println(costin.getStartMessage(daf));
//        System.out.println(livanov.getStartMessage(scania));
//        System.out.println(ivanov.getStartMessage(yutong));
//        System.out.println(fedorov.getStartMessage(neoplan));
//        System.out.println(smirnov.getStartMessage(maz));
//        System.out.println(carpov.getStartMessage(liaz));
//        ford.bestLapTime();
//        ford.pitStop();
//        ford.maxSpeed();


        PassengerCars ford = new PassengerCars("Ford", "focus", 2.2, 2,
                220.3, 24.9,BodyType.HATCHBACK);
        PassengerCars volvo = new PassengerCars("Volvo", "s90", 2.0, 3,
                230.1, 25.1, BodyType.CROSSOVER);
        PassengerCars toyota = new PassengerCars("Toyota", "hilux", 2.5, 3,
                240.8, 24.1, BodyType.COUPE);
        PassengerCars volkswagen = new PassengerCars("Volkswagen", "polo", 2.0, 2,
                250.4, 24.02, BodyType.SEDAN);

//        System.out.println(ford);
//        System.out.println(volvo);
//        System.out.println(toyota);
//        System.out.println(volkswagen);
//        volkswagen.printType();

        Truck kamaz = new Truck("Kamaz", "i750", 11.8, 3, 250.0,
                51.2, LoadCapasity.N2);
        Truck renault = new Truck("Renault", "Z400", 10.5, 5, 220.5,
                45.5, LoadCapasity.N1);
        Truck daf = new Truck("DAF", "U12", 12.4, 6, 200.5,
                53.5, LoadCapasity.N3);
        Truck scania = new Truck("Scania", "DK46", 11.2, 5, 195.5,
                62.5, LoadCapasity.N2);

//        System.out.println(kamaz);
//        System.out.println(renault);
//        System.out.println(daf);
//        System.out.println(scania);
//        kamaz.printType();

        Buses yutong = new Buses("Yutong", "ZK6129H", 14.00, 2,
                220.5, 42.5, Size.S);
        Buses neoplan = new Buses("Neoplan", "N5218", 12.00, 3,
                230.5, 52.5, Size.M);
        Buses maz = new Buses("Maz", "251", 10.00, 6,
                195.5, 63.5, Size.L);
        Buses liaz = new Buses("Liaz", "Cruiz", 12.00, 5,
                185.5, 65.5, Size.XL);


        service(ford, volvo, toyota, volkswagen,
                kamaz, renault, daf, scania,
                yutong, neoplan, maz, liaz);
//        System.out.println(yutong);
//        System.out.println(neoplan);
//        System.out.println(maz);
//        System.out.println(liaz);
//        yutong.printType();

    }

    private static void service(Car... cars) {
        for (Car car : cars) {
            serviceCar(car);
        }

    }

    private static void serviceCar(Car car) {
        try {
            if (!car.service()) {
                throw new RuntimeException("Автомобиль " + car.getBrand() + " " + car.getModel() + " не прошёл диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
