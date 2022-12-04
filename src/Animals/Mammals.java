package Animals;

import static Animals.Validation.validateStandardInteger;
import static Animals.Validation.validateStandardStr;

public abstract class Mammals extends Animals {
    protected Integer movementSpeed;
    protected String TypeOfFood;

    public Mammals(String name, Integer age, String livingEnvironment, Integer movementSpeed, String TypeOfFood) {
        super(name, age, livingEnvironment);
        this.movementSpeed = validateStandardInteger(movementSpeed);
        this.TypeOfFood = validateStandardStr(TypeOfFood);

    }

    @Override
    public String toString() {
        return "Mammals{" +
                "movementSpeed=" + movementSpeed +
                ", TypeOfFood='" + TypeOfFood + '\'' +
                '}';
    }

    //    regionGS
    public Integer getMovementSpeed() {
        return movementSpeed;
    }

    public String getTypeOfFood() {
        return TypeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.TypeOfFood = validateStandardStr(TypeOfFood);
    }
//    endregion

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

    public void walk() {

    }

//    endregion

}
