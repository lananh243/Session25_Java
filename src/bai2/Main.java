package bai2;

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speak();
    }
}
