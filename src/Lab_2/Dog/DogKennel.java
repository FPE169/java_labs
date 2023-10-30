package Lab_2.Dog;

public class DogKennel {
    private Dog[] dogs;
    private int count;

    public DogKennel(int size) {
        dogs = new Dog[size];
        count = 0;
    }

    public void addDog(Dog dog) {
        if (count < dogs.length) {
            dogs[count] = dog;
            count++;
        }
        else {
            System.out.println("Питомник переполнен");
        }
    }

    public void printAllDogs() {
        System.out.println("Собаки в питомнике:");
        for (int i = 0; i < count; i++) {
            System.out.println(dogs[i]);
        }
    }
}
