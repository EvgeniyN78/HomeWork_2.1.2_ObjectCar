public class Main {
    public static void main(String[] args) {
        Car LadaGranta = new Car("", null, 0, null, -2015, "");
        Car AudiA8 = new Car("Audi","A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия");
        Car BMWZ8 = new Car("BMW","Z8", 3.0, "Чёрный", 2021, "Германия");
        Car KiaSportage = new Car("Kia","Sportage", 2.4, "Красный", 2018, "Южная Корея");
        Car HyundaiAvante = new Car("Hyundai","Avante", 1.6, "Оранжевый", 2016, "Южная Корея");

        System.out.println(LadaGranta);
        System.out.println(AudiA8);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage);
        System.out.println(HyundaiAvante);
    }
}
