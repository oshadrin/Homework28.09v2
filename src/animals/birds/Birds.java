package animals.birds;

import animals.Animals;

public class Birds extends Animals {

    private final String moveType;

    public void hunt() {

    }

    public Birds(String name, String age, String habitat, String moveType) {
        super(name, age, habitat);
        this.moveType = moveType;
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public void eat() {

        System.out.println("Птица ест");
    }

    @Override
    public void move() {
        System.out.println("Птица идет");
    }
}
