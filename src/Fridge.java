import java.util.Arrays;

public class Fridge {
    public String[] food = {"milk", "egg", "salad", "cola", "burger"};

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
this.food=food;
    }




    public void work() {
        System.out.println("The fridge is work");

    }

    public void store() {
        System.out.println("we have " + Arrays.toString(getFood()));
    }

    public int getTakeFood(Food food) {
        System.out.println("In fridge we have " + food);
        return getTakeFood(food);
    }


}





