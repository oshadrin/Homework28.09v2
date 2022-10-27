package animals.birds;

public class Flightless extends Birds {

    public void walk() {
        System.out.println("Птица гуляет");
    }

    public Flightless(String name, String age, String habitat, String moveType) {
        super(name, age, habitat, moveType);
    }


    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " " + getMoveType();
    }
}
