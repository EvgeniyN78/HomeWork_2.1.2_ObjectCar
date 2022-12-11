package transport;

import java.time.LocalDate;

//regionConstructorCar
public abstract class Car extends Transport {

    protected Double engineVolume;
    protected String transmission;
    protected String bodyType;
    protected String registrationNumber;
    protected int quantityOfSeats;
    protected String tireSeasonality;

//    protected Key key;
//    protected Insurance insurance;


    public Car(String brand, String model, Double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int quantityOfSeats, String tireSeasonality, Double maxSpeed, double fuelPercentage,
               String typeOfFuel) {

        super(brand, model, year, country, color, maxSpeed, fuelPercentage, typeOfFuel);
        this.engineVolume = Validation.validateEngineVolume(engineVolume);
        this.transmission = Validation.validateStandard(transmission);
        this.bodyType = Validation.validateStandard(bodyType);
        this.registrationNumber = Validation.checkingNumber(registrationNumber);
        this.quantityOfSeats = Validation.validateQuantityOfSeats(quantityOfSeats);
        this.tireSeasonality = Validation.validateTireSeasonality(tireSeasonality);

    }

    protected Integer pitStop;
    protected Double maxSpeed;
    protected Double bestLapTime;

    public Car(String brand, String model, Double engineVolume, Integer pitStop, Double maxSpeed, Double bestLapTime) {
        super(brand, model);
        this.engineVolume = Validation.validateEngineVolume(engineVolume);
        this.pitStop = pitStop;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }

    public Integer getPitStop() {
        return pitStop;
    }

    public void setPitStop(Integer pitStop) {
        this.pitStop = pitStop;
    }

    @Override
    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(Double bestLapTime) {
        this.bestLapTime = bestLapTime;
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

//    public Key getKey() {
//        return key;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//    //endregion

    //regionSettersCar

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Validation.validateEngineVolume(engineVolume);
    }

//    public void setTransmission(String transmission) {
//        this.transmission = Validation.validateStandard(transmission);
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public void setTireSeasonality(String tireSeasonality) {
//        this.tireSeasonality = Validation.validateTireSeasonality(tireSeasonality);
//    }
//
//    public void setKey(Key key) {
//        this.key = key;
//    }
//
//    public void setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//    }
//
//    @Override
//    public void refill() {
//
//    }
//
//    endregion

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
//
//    regionUnderClassKey
//    public class Key {
//        private final String remoteEngineStart;
//        private final String keylessAccess;
//
//        public Key(String remoteEngineStart, String keylessAccess) {
//            this.remoteEngineStart = Validation.validateStandard(remoteEngineStart);
//            this.keylessAccess = Validation.validateStandard(keylessAccess);
//        }
//
//        public String getRemoteEngineStart() {
//            return remoteEngineStart;
//        }
//
//        public String getKeylessAccess() {
//            return keylessAccess;
//        }
//
//        public void setRemoteEngineStart(String remoteEngineStart) {
//            remoteEngineStart = remoteEngineStart;
//        }
//
//        public void setKeylessAccess(String keylessAccess) {
//            keylessAccess = keylessAccess;
//        }
//
//        @Override
//        public String toString() {
//            return "удалённый запуск двигателя: " + remoteEngineStart +
//                    ", безключевой доступ: " + keylessAccess + ", ";
//        }
//    }
//    endregion
//
//    regionUnder


    public void startMoving() {
        System.out.println("Завести машину, включить передачу, выжать педаль газа.");
    }


    public void finishMoving() {
        System.out.println("Остановиться, включить паркинг, заглушить машину.");
    }

}


