import java.util.Arrays;

public class Human {
    private Pet pet;
    private String name;
    private int age;
    private int weight;
    private Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, int weight) {
        this(name, age);
        this.weight = weight;

    }

    public Human(String name, int age, int weight, Pet pet) {
        this(name, age, weight);
        this.pet = pet;

    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }


    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }


    public void eat(Food food) {
        System.out.println("WE eat " + food.smbEat() + " Portion");
    }

    public void pet(Pet pet) {
        pet.sleep();
        System.out.println("Let him sleep");
    }

    public void play(Pet pet) {
        pet.play();
        System.out.println("Play together");
    }

    public void getFood(Fridge fridge) {
        System.out.println("We buy " + Arrays.toString(fridge.getFood()));
    }

    public void storeFood(Food food) {
        food.setCalories(90);
        if (food.getCalories() >= 1000) {
            System.out.println("Eat it tomorrow");
        } else {
            System.out.println("You can eat it");
        }
    }

    public void storeFood(Fridge fridge) {
        fridge.work();
    }

    public void foodOnTable(Food food) {
        food.smbEat();
        System.out.println("We eat " + food.smbEat() + " por of food");

    }


    public void getCalories(Food food) {
        food.setCalories(1000);

    }

    public void isDelicious(Food food) {
        System.out.println("It's good");
        food.isDelicious();
    }
}






