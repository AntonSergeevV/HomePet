import javax.swing.*;

public class Food {

    private int calories;
    private int count;
    private String name;
    FoodType type;

    private Food(FoodType type) {
        this.type = type;
    }

    public Food(FoodType type, String name, int calories) {
        this(type, name);
        this.calories = calories;

    }

    private Food(FoodType type, String name) {
        this.type = type;
        this.name = name;

    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean isDelicious() {
        return true;
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int smbEat() {
        count -= 1;
        return count;
    }

}



