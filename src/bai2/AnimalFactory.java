package bai2;

class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        return null;
    }
}
