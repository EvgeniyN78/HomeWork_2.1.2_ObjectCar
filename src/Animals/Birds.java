package Animals;

import static Animals.Validation.validateStandardStr;

public abstract class Birds extends Animals {
    protected String typeOfMovement;

    public Birds(String name, Integer age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        this.typeOfMovement = validateStandardStr(typeOfMovement);
    }

//    regionGS
    public String getTypeOfMovement() {
        return typeOfMovement;
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

    public void hunt() {

    }

//    endregion
}
