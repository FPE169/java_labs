package Lab_20;

import java.io.Serializable;

interface Animal {
    void makeSound();
}

class Dog implements Animal, Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gav");
    }

    public String getName() {
        return name;
    }
}

class Generic<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T variableT;
    private V variableV;
    private K variableK;

    public Generic(T variableT, V variableV, K variableK) {
        this.variableT = variableT;
        this.variableV = variableV;
        this.variableK = variableK;
    }

    public T getVariableT() {
        return variableT;
    }

    public V getVariableV() {
        return variableV;
    }

    public K getVariableK() {
        return variableK;
    }

    public void printClassNames() {
        System.out.println("Class of variableT: " + variableT.getClass().getName());
        System.out.println("Class of variableV: " + variableV.getClass().getName());
        System.out.println("Class of variableK: " + variableK.getClass().getName());
    }



    public static void main(String[] args) {
        String stringVar = "Hello";
        Dog dogVar = new Dog("Ruf");
        Integer integerVar = 42;

        Generic<String, Dog, Integer> myGenericObject = new Generic<>(stringVar, dogVar, integerVar);
        myGenericObject.printClassNames();

    }
}
