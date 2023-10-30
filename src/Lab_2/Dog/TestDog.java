package Lab_2.Dog;

public class TestDog {
    public static void main(String[] args) {
        DogKennel kennel = new DogKennel(5);

        Dog dog1 = new Dog("Чуня", 3);
        Dog dog2 = new Dog("Рекс", 5);
        Dog dog3 = new Dog("Веста", 11);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        kennel.printAllDogs();
    }
}

