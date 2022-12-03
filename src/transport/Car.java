package transport;

import java.time.LocalDate;

//regionConstructorCar
public class Car extends Transport {

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int quantityOfSeats;
    private String tireSeasonality;

    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int quantityOfSeats, String tireSeasonality, int maxSpeed, double fuelPercentage, String typeOfFuel) {

        super(brand, model, year, country, color, maxSpeed, fuelPercentage, typeOfFuel);
        this.engineVolume = Validation.validateEngineVolume(engineVolume);
        this.transmission = Validation.validateStandard(transmission);
        this.bodyType = Validation.validateStandard(bodyType);
        this.registrationNumber = Validation.checkingNumber(registrationNumber);
        this.quantityOfSeats = Validation.validateQuantityOfSeats(quantityOfSeats);
        this.tireSeasonality = Validation.validateTireSeasonality(tireSeasonality);

    }
    //endregion


    //regionGettersCar

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public String getTireSeasonality() {
        return tireSeasonality;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
    //endregion

    //regionSettersCar

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Validation.validateEngineVolume(engineVolume);
    }

    public void setTransmission(String transmission) {
        this.transmission = Validation.validateStandard(transmission);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireSeasonality(String tireSeasonality) {
        this.tireSeasonality = Validation.validateTireSeasonality(tireSeasonality);
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    //endregion

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

    //regionUnderClassKey
    public class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = Validation.validateStandard(remoteEngineStart);
            this.keylessAccess = Validation.validateStandard(keylessAccess);
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            remoteEngineStart = remoteEngineStart;
        }

        public void setKeylessAccess(String keylessAccess) {
            keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "удалённый запуск двигателя: " + remoteEngineStart +
                    ", безключевой доступ: " + keylessAccess + ", ";
        }
    }
    //endregion

    //regionUnderClassInsurance
    public class Insurance {
        private final LocalDate validityPeriod;
        private final double costInsurance;
        private final String number;

        public Insurance(LocalDate validityPeriod, double costInsurance, String number) {
            this.validityPeriod = Validation.checkValidityPeriod(validityPeriod);
            this.costInsurance = Validation.validateCostInsurance(costInsurance);
            this.number = Validation.isValidateNumber(number) ? number : "Номер страховки некорректный!";
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumber() {
            return number;
        }

        public void setValidityPeriod(LocalDate validityPeriod) {
            validityPeriod = validityPeriod;
        }

        public void setCostInsurance(double costInsurance) {
            costInsurance = costInsurance;
        }

        public void setNumber(String number) {
            number = number;
        }

        @Override
        public String toString() {
            return "срок действия страховки: " + validityPeriod +
                    ", стоимость страховки: " + costInsurance +
                    ", номер страховки: " + number + ".";
        }
    }
    //endregion

    @Override
    public String toString() {
        return "наименование: " + brand + ", модель: " + model + ", объём двигателя: " + engineVolume + " л., цвет: " + color +
                ", год выпуска: " + getYear() + ", страна: " + country + ", коробка передач: " + transmission +
                ", максимальная скорость: " + maxSpeed + " км/ч." +
                ", тип кузова: " + bodyType + ", регистрационный номер: " + registrationNumber +
                ", количество посадочных мест: " + quantityOfSeats + ", сезонность шин: " + tireSeasonality +
                ", " + key + insurance;
    }
}


