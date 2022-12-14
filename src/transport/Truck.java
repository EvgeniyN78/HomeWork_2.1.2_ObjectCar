package transport;

public class Truck extends Car implements Competing {

    protected LoadCapasity loadCapasity;

    public Truck(String brand, String model, Double engineVolume, Integer pitStop, Double maxSpeed,
                 Double bestLapTime, LoadCapasity loadCapasity) {
        super(brand, model, engineVolume, pitStop, maxSpeed, bestLapTime);

        if (loadCapasity == null) {
            System.out.println("Не достаточно данных");
            return;
        }
        this.loadCapasity = loadCapasity;

    }

    public LoadCapasity getLoadCapasity() {
        return loadCapasity;
    }

    public void setLoadCapasity(LoadCapasity loadCapasity) {
        this.loadCapasity = loadCapasity;
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

    @Override
    public String toString() {
        return "Грузовик: " +
                "наименование: " + brand +
                ", модель: " + model +
                " грузоподъёмность: " + loadCapasity;
    }

    @Override
    public void printType() {
        if (loadCapasity == null) {
            System.out.println("Данных по авто не достоточно");
        } else {
            String min = loadCapasity.getMin() == null ? "" : "от " + loadCapasity.getMin();
            String max = loadCapasity.getMax() == null ? "" : " тонн, до " + loadCapasity.getMax() + " тонн";

            System.out.println("грузоподъёмность: " + loadCapasity);

        }

    }
}