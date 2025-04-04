package bai1;

public class Main {
    public static void main(String[] args) {
        Account account1 = Account.getInstance(1, 20, "Nguyen Van A");
        Account account2 = Account.getInstance(2, 22, "Tran Thi B");

        System.out.println("account1 == account2: " + (account1 == account2));
    }
}
