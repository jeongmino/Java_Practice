public class BankDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setCashAmount(100000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(500000);
        a1.owner = p1;
        p1.account = a1;
        System.out.println(a1.deposit(30000));
        System.out.println(a1.withdraw(170000));
        System.out.println(a1.deposit(10000000));
        System.out.println(a1.deposit(10000000));

    }
}
