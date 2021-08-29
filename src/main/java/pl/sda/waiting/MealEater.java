package pl.sda.waiting;

public class MealEater implements Runnable {

    private final Meal meal;

    public MealEater(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void run() {
        try {
            meal.waitForMeal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
