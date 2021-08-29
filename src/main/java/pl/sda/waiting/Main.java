package pl.sda.waiting;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Meal meal = new Meal();
        Thread mealEater = new Thread(new MealEater(meal));
        Thread mealPreparer = new Thread(new MealPreparer(meal));

        mealEater.start();
        mealPreparer.start();

        mealEater.join();
        mealPreparer.join();
    }
}
