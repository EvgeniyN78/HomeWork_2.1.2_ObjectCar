package transport;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected Integer year;
    protected String country;
    protected String color;
    protected Double maxSpeed;
    protected Double fuelPercentage;
    protected String typeOfFuel;

    public Transport(String brand, String model, Integer year, String country, String color, Double maxSpeed, Double fuelPercentage, String typeOfFuel) {
        this.brand = Validation.validateStandard(brand);
        this.model = Validation.validateStandard(model);
        this.year = Validation.validateYear(year);
        this.country = Validation.validateStandard(country);
        this.color = Validation.validateColor(color);
        this.maxSpeed = Validation.validateStandardDouble(maxSpeed);
        this.fuelPercentage = Validation.validateFuelPercentage(fuelPercentage);
        this.typeOfFuel = Validation.validateStandard(typeOfFuel);
    }

    public Transport(String brand, String model) {
        this.brand = Validation.validateStandard(brand);
        this.model = Validation.validateStandard(model);
    }

//regionGetters

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }


//endregion

//regionSetters

    public void setBrand(String brand) {
        this.brand = Validation.validateStandard(brand);
    }

    public void setModel(String model) {
        this.model = Validation.validateStandard(model);
    }

    public void setColor(String color) {
        this.color = Validation.validateColor(color);
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = Validation.validateStandardDouble(maxSpeed);
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = Validation.validateFuelPercentage(fuelPercentage);
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.brand = Validation.validateStandard(typeOfFuel);
    }

//endregion

    public abstract void refill();
}
