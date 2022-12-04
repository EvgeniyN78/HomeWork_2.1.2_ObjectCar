package Animals;

public class Amphibians extends Animals {

    public Amphibians(String name, Integer age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public String toString() {
        return "Земноводные: " +
                "наименование: " + name +
                ", возраст: " + age +
                ", среда обитания: " + livingEnvironment;
    }

    //    regionMethods
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public void hunt() {

    }

//    endregion


}
