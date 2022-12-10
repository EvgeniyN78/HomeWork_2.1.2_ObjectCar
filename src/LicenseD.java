import transport.Buses;

public class LicenseD<T extends Buses> extends Driver {

    public LicenseD(String name, String driverLicense, Integer experience) {
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

    public static String getStartMessage(Buses buses) {
        return "Водитель " + getName() + " управляет автобусом " + buses.getBrand() + " " + buses.getModel() + ", и будет участвовать в заезде";
    }


}
