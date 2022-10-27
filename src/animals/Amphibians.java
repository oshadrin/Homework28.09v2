package animals;

public class Amphibians extends Animals{

    public void hunt() {
        System.out.println("Земноводное охотится");
    }

    public Amphibians(String name, String age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println("Земноводное ест");
    }

    @Override
    public void move() {
        System.out.println("Земноводное идет");
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getHabitat() + " ";
    }
}
