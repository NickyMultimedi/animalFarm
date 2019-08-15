package be.weloveanimals.animalFarm.feeders;

public interface Feeder {
    Food getFood();
    void setFood(Food food);
    int getFoodAmount();
    void fillFeeder(Food food, int amount);
    void feed();
}
