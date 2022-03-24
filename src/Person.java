public class Person {
    private String name;
    private int age;
    private int cashAmount;
    BankAccount account;

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge){
        if (newAge > 0)
            age = newAge;
    }
    public int getAge(){
        return age;
    }
    public void setCashAmount(int newCashAmount){
        if (newCashAmount >= 0)
            cashAmount = newCashAmount;
    }
    public int getCashAmount(){
        return cashAmount;
    }
}