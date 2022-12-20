package transport;

public class Buses extends Car implements Competing {

    private Size size;

    public Buses(String brand, String model, Double engineVolume, Integer pitStop, Double maxSpeed, Double bestLapTime, Size size) {
        super(brand, model, engineVolume, pitStop, maxSpeed, bestLapTime);

        if (size == null) {
            System.out.println("Не достаточно данных");
            return;
        }
        this.size = size;
    }

    public Size getSize() {
        return size;
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
    public void printType() {
        if (size == null) {
            System.out.println("Данных по авто не достоточно");
        } else {
            String min = size.getMin() == null ? "" : "от " + size.getMin();
            String max = size.getMax() == null ? "" : ", до " + size.getMax() + " мест";

            System.out.println("вместимость: " + size);
        }

    }

    @Override
    public void pitStop() {
        System.out.println("Заехать на заправку.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Показано лучшее время.");

    }

    @Override
    public void maxSpeed() {
        System.out.println("Зафиксирована максимальная скорость.");

    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется.");
        return true;
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "наименование: " + brand +
                ", модель: " + model +
                ", вместимость: " + size;
    }


}
