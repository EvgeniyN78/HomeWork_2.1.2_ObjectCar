package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, Double maxSpeed, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, typeOfFuel);
    }

    @Override
    public void refill() {
        if (getFuelPercentage() < 55) {
            if (getTypeOfFuel() == "бензин" || getTypeOfFuel() == "дизель") {
                System.out.println("Залить " + getTypeOfFuel());
            } else if (getTypeOfFuel() == "газ") {
                System.out.println("Заправить газом");
            } else if (getTypeOfFuel() == "электро") {
                System.out.println("Зарядить до 100%");
            }
        } else {
            if (getTypeOfFuel() == "бензин" || getTypeOfFuel() == "дизель" || getTypeOfFuel() == "газ") {
                System.out.println("Топлива достаточно");
            } else if (getTypeOfFuel() == "электро") {
                System.out.println("Энергии достаточно");
            }
        }
    }

    @Override
    public String toString() {
        return "Автобус:" +
                " наименование: " + getBrand() + ", модель: " + getModel() +
                ", год: " + getYear() + ", страна: " + getCountry() + ", цвет: " + getColor() +
                ", максимальная скорость: " + getMaxSpeed() + "км/ч., топливный бак заполнен на: " + getFuelPercentage() + "%";
    }
}

