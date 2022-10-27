package animals.birds;

public class Flying extends Birds{

    public void fly() {
        System.out.println("Птица летает");
    }

    public Flying(String name, String age, String habitat, String moveType) {
        super(name, age, habitat, moveType);
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getMoveType();
    }
}
