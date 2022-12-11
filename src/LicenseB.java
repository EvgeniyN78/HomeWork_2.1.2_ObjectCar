import transport.Buses;
import transport.Car;
import transport.PassengerCars;

public class LicenseB <T extends PassengerCars> extends Driver {


    public LicenseB(String name, String driverLicense, Integer experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("запустить двигатель, включить передачу, нажать на педаль газа.");
    }

    @Override
    public void refuel() {
        System.out.println("остановиться, дождаться заправки, продолжить движение.");
    }

    @Override
    public void stand() {
        System.out.println("остановиться, заглушить двигатель.");
    }

    public String getStartMessage(PassengerCars passengerCars) {
        return "Водитель " + getName() + " управляет автомобилем " + passengerCars.getBrand() + " " +
                passengerCars.getModel() + ", и будет участвовать в заезде.";
    }

}
