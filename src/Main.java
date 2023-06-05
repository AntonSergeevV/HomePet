public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(PetType.CAT, "Barsik", 12);
        Food food = new Food(FoodType.BURGER, "Hey", 1000);
        Fridge fridge = new Fridge();
        Table table = new Table();
        Human human = new Human("Anton", 34, 64, new Pet(PetType.DOG, "Pes", 20));
        human.getCalories(food);
        human.getFood(fridge);
        human.storeFood(fridge);
        human.foodOnTable(food);
        human.isDelicious(food);
        human.play(pet);
        human.storeFood(food);
        fridge.store();

    }
}
