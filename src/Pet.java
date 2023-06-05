public class Pet {

    PetType petType;
    private int weight;
    private String name;

    public Pet(PetType type) {
        this.petType = type;
    }

    public Pet(PetType type, String name) {
        this.petType = type;
        this.name = name;
    }

    public Pet(PetType type, String name, int weight) {
        this(type,name);
        this.weight = weight;

    }

    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }


    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }


    public void sleep() {
        System.out.println("The cat is sleep");
    }

    public void play() {
        System.out.println("The cat is playing");
    }

    public void eat(Food food) {
        System.out.println("The cat eat " + food.smbEat());

    }
}



