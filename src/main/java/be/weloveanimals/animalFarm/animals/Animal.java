package be.weloveanimals.animalFarm.animals;

public interface Animal {
    String getName();
    void setName(String name);
    Food getFood();
    void setFood(Food food);
    int getId();
    void setId(int id);
    int getBarnId();
    void setBarnId(int id);
    void makeSound();
    int getAge();
    void setAge(int age);
}
