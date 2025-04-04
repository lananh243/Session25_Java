package bai3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car.Builder()
                .setEngine("V8")
                .setSeats(4)
                .setColor("Black")
                .build();

        Car car2 = new Car.Builder()
                .setEngine("Electric")
                .setSeats(2)
                .setColor("White")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
