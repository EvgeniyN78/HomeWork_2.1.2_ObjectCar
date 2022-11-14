public class Car {

    public static int counter = 1;
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    private int idCar;


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.equals("")) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        this.year = year;
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }

        idCar = counter++;

    }

    @Override
    public String toString() {
        return idCar + ". Бренд: \"" + brand + '\"' +
                ", модель: \"" + model + '\"' +
                ", объём двигателя: " + engineVolume +
                " л., цвет кузова: \"" + color + '\"' +
                ", год выпуска: " + year +
                ", сборка: \"" + country + "\";";
    }

}
