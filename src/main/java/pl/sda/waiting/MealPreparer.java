package pl.sda.waiting;

public class MealPreparer implements Runnable {

    private final Meal meal;

    public MealPreparer(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            meal.prepare();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
