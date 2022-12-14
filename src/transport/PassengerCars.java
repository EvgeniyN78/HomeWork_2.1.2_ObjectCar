package transport;

public class PassengerCars extends Car implements Competing {

    protected BodyType bodyType;

    public PassengerCars(String brand, String model, Double engineVolume, Integer pitStop, Double maxSpeed, Double bestLapTime,
                         BodyType bodyType) {
        super(brand, model, engineVolume, pitStop, maxSpeed, bestLapTime);

        this.bodyType = bodyType;
    }

    public BodyType getNameBodyType() {
        return bodyType;
    }

    public void setNameBodyType(BodyType nameBodyType) {
        this.bodyType = nameBodyType;
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
        System.out.println("Показано лучшее время.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Зафиксирована максимальная скорость.");

    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " +
                "марка: " + brand +
                ", модель: " + model +
                ", тип кузова: " + getNameBodyType();

    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто не достоточно");
        } else {
            System.out.println("тип кузова: " + getNameBodyType());

        }

    }
}
