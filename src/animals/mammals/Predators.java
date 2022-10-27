package animals.mammals;

public class Predators extends Mammals {

    public void hunt() {
        System.out.println("Хищник охотится");
    }

    public Predators(String name, String age, String habitat, String speedMove, String foodType) {
        super(name, age, habitat, speedMove, foodType);
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getSpeedMove() + " " + getFoodType();
    }
}
