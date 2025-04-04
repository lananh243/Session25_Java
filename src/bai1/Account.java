package bai1;

public class Account {
    private int id;
    private String name;
    private int age;

    public Account(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private static Account instance;
    private Account(int id, String name, int age) {}

    public static Account getInstance(int id, int age, String name) {
        if (instance == null) {
            instance = new Account(id, age, name);
        }
        return instance;
    }
}
