public class BankAccount {
    private int balance;
    Person owner;
    public void setBalance(int newBalance){
        if (newBalance >= 0)
            balance = newBalance;
    }
    public int getBalance(){
        return balance;
    }
    boolean deposit(int amount){
        if (amount < owner.getCashAmount()){
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        }
        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);
        System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;
    }
    boolean withdraw(int amount){
        if (amount > balance){
            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
        balance += amount;
        owner.setCashAmount(owner.getCashAmount() - amount);
        System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
        return true;

    }
}