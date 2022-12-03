package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, typeOfFuel);
    }

    @Override
    public void refill() {
        if (fuelPercentage < 55) {
            if (typeOfFuel == "бензин" || typeOfFuel == "дизель") {
                System.out.println("Залить " + getTypeOfFuel());
            } else if (typeOfFuel == "газ") {
                System.out.println("Заправить газом");
            } else if (typeOfFuel == "электро") {
                System.out.println("Зарядить до 100%");
            }
        } else {
            if (typeOfFuel == "бензин" || typeOfFuel == "дизель" || typeOfFuel == "газ") {
                System.out.println("Топлива достаточно");
            } else if (typeOfFuel == "электро") {
                System.out.println("Энергии достаточно");
            }
        }
    }

    @Override
    public String toString() {
        return "Автобус:" +
                " наименование: " + '\"' + brand + '\"' + ", модель: " + model +
                ", год: " + year + ", страна: " + country + ", цвет: " + color +
                ", максимальная скорость: " + maxSpeed + "км/ч., топливный бак заполнен на: " + fuelPercentage + "%";
    }
}

