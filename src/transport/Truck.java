package transport;

public class Truck extends Car implements Competing {
    public Truck(String brand, String model, Double engineVolume, Integer pitStop, Double maxSpeed, Double bestLapTime) {
        super(brand, model, engineVolume, pitStop, maxSpeed, bestLapTime);
    }

    @Override
    public void startMoving() {
        System.out.println("Включить зажигание, включить передачу, нажать на педаль газа.");
    }

    @Override
    public void finishMoving() {
        System.out.println("Остановиться, заглушить двигатель.");
    }

    @Override
    public void pitStop() {
        System.out.println("Заехать на заправку.");
    }

    @Override
    public void bestLapTime() {
        Double minBedLapTime = 0.01;
        System.out.println("Показано лучшее время.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Зафиксирована максимальная скорость.");

    }
}