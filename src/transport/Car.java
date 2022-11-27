package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

//regionConstructorCar
public class Car {

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int quantityOfSeats;
    private String tireSeasonality;

    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String bodyType, String registrationNumber, int quantityOfSeats, String tireSeasonality) {

        this.brand = validateStandard(brand);
        this.model = validateStandard(model);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.color = validateColor(color);
        this.year = validateYear(year);
        this.country = validateStandard(country);
        this.transmission = validateStandard(transmission);
        this.bodyType = validateStandard(bodyType);
        this.registrationNumber = checkingNumber(registrationNumber);
        this.quantityOfSeats = validateQuantityOfSeats(quantityOfSeats);
        this.tireSeasonality = validateTireSeasonality(tireSeasonality);

    }
    //endregion

    //regionGettersCar
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public void setColor(String color) {
        this.color = validateColor(color);
    }

    public void setTransmission(String transmission) {
        this.transmission = validateStandard(transmission);
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireSeasonality(String tireSeasonality) {
        this.tireSeasonality = validateTireSeasonality(tireSeasonality);
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
    //endregion

    //regionvalidation

    public static String validateStandard(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }
    public static String validateColor(String value) {
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "белый";
    }

    public static double validateEngineVolume(double value) {
        return value <= 0 ? value : 1.5;
    }

    public static int validateQuantityOfSeats(int value) {
        return value < 0 ? value : 4;
    }

    public static int validateYear(int value) {
        return value > 0 ? value : 2000;
    }

    public String checkingNumber(String number) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", number)) {
            return number;
        } else {
            return "Номер введён не корректно!";
        }
    }

    public static String validateTireSeasonality(String value) {
        if (value != null && !value.isEmpty() && !value.isBlank()) {
            if (value.equals("w") || value.equals("W")) {
                return "Зимняя резина";
            } else if (value.equals("s") || value.equals("S")) {
                return "Необходимо сменить летнюю резину на зимнюю";
            }
        }
        return "default";
    }

    public static boolean isValidateNumber(String number) {
        if (Pattern.matches("[а-яА-Яa-zA-z0-9]{9}", number)) {
            return true;
        } else {
            return false;
        }
    }

    public static LocalDate checkValidityPeriod(LocalDate validityPeriod) {
        if (LocalDate.now().isAfter(validityPeriod)) {
            System.out.println("Страховка просрочена. Оформите новую.");
            return LocalDate.now();
        } else {
            return validityPeriod;
        }
    }

    public static double validateCostInsurance(double value) {
        return value > 0 ? value : 1000;
    }

    //endregion

    //regionUnderClassKey
    public class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            this.remoteEngineStart = validateStandard(remoteEngineStart);
            this.keylessAccess = validateStandard(keylessAccess);
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
            return "Удалённый запуск двигателя: " + remoteEngineStart +
                    ", Безключевой доступ: " + keylessAccess + " ,";
        }
    }
    //endregion

    //regionUnderClassInsurance
    public class Insurance {
        private final LocalDate validityPeriod;
        private final double costInsurance;
        private final String number;

        public Insurance(LocalDate validityPeriod, double costInsurance, String number) {
            this.validityPeriod = checkValidityPeriod(validityPeriod);
            this.costInsurance = validateCostInsurance(costInsurance);
            this.number = isValidateNumber(number) ? number : "Номер страховки некорректный!";
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
            return "Срок действия страховки: " + validityPeriod +
                    ", Стоимость страховки: " + costInsurance +
                    ", Номер страховки: " + number + ".";
        }
    }
    //endregion

    @Override
    public String toString() {
        return  ". Бренд: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume + " л., Цвет: " + color +
                ", год выпуска: " + year + ", Страна: " + country + ", коробка передач: " + transmission + ", тип кузова: " + bodyType +
                ", регистрационный номер: " + registrationNumber + ", количество посадочных мест: " + quantityOfSeats +
                ", сезонность шин: " + tireSeasonality + " ,";
    }
}


