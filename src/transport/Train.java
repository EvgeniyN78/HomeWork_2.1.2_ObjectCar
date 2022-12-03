package transport;

public class Train extends Transport {

    private int priceTrip;
    private double travelTime;
    private String nameDepartureStation;
    private String finalStop;
    private int quantityWagons;

    public Train(String brand, String model, int year, String country, String color, int priceTrip, double travelTime,
                 String nameDepartureStation, String finalStop, int quantityWagons, int maxSpeed, double fuelPercentage, String typeOfFuel) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage, typeOfFuel);
        this.priceTrip = Validation.validateStandardInt(priceTrip);
        this.travelTime = Validation.validateStandardDouble(travelTime);
        this.nameDepartureStation = Validation.validateStandard(nameDepartureStation);
        this.finalStop = Validation.validateStandard(finalStop);
        this.quantityWagons = Validation.validateStandardInt(quantityWagons);
    }

    //regionGettersTrain
    public int getPriceTrip() {
        return priceTrip;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getQuantityWagons() {
        return quantityWagons;
    }
//endregion

    //regionSettersTrain
    public void setPriceTrip(int priceTrip) {
        this.priceTrip = Validation.validateStandardInt(priceTrip);
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = Validation.validateStandardDouble(travelTime);
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = Validation.validateStandard(nameDepartureStation);
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = Validation.validateStandard(finalStop);
    }

    public void setQuantityWagons(int quantityWagons) {
        this.quantityWagons = Validation.validateStandardInt(quantityWagons);
    }
//endregion


    @Override
    public String toString() {
        return "Поезд: наименование: " + '\"' + brand + '\"' + ", модель: " + model + ", страна: " + country +
                ", год: " + year + ", цвет: " + color + ", количество вагонов: " + quantityWagons +
                ", максимальная скорость: " + maxSpeed + "км/ч., станция отправления: " + nameDepartureStation +
                ", станция прибытия: " + finalStop + ", время в пути: " + travelTime + " час., стоимость поездки: " + priceTrip +
                " руб.";

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
}
