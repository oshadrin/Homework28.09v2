package animals;

public class Animals {
    private final String name;
    private final String age;
    private String habitat;

    public void eat() {
        System.out.println("Ест");
    }
    public void sleep() {
        System.out.println("Спит");
    }
    public void move() {
        System.out.println("Идет");
    }

    public Animals(String name, String age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(this.habitat == null || this.habitat.isEmpty()){
            this.habitat = "Должно быть заполнено";
        } else {
            this.habitat = habitat;
        }
    }
}
