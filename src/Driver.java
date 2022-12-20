public abstract class Driver {

    private String name;
    private String driverLicense;
    private Integer experience;
    private String category;

    public Driver(String name, String driverLicense, Integer experience, String category) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
        setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав.");
        }
        this.category = category;
    }

    public String getName() {
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
