public abstract class Driver {

    private static String name;
    private String driverLicense;
    private Integer experience;

    public Driver(String name, String driverLicense, Integer experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;

    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public abstract void start();

    public abstract void refuel();

    public abstract void stand();


}
