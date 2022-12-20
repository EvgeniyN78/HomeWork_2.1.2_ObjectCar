import transport.PassengerCars;
import transport.Truck;

public class LicenseC<T extends Truck> extends Driver {

    public LicenseC(String name, String driverLicense, Integer experience, String category) {
        super(name, driverLicense, experience, category);
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

    public String getStartMessage(Truck truck) {
        return "Водитель " + getName() + " управляет автомобилем " + truck.getBrand() + " " +
                truck.getModel() + ", и будет участвовать в заезде.";
    }
}
