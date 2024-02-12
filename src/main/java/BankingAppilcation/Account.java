package BankingAppilcation;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String number, double balance, String name, String email, String phoneNumber) {
        Number = number;
        Balance = balance;
        Name = name;
        Email = email;
        PhoneNumber = phoneNumber;
    }

    public void depositMoney(double depositedMoney){
        Balance+=depositedMoney;
        System.out.println("Deposited successful \nAvailable Balance is :"+Balance);

    }
    public void withdraw(double withdrawMoney){
        if(Balance-withdrawMoney<0){
            System.out.println("Insufficient Balance \n"+"Balance is : "+Balance);
        }else{
            Balance-=withdrawMoney;
            System.out.println(Balance+ "\nHere is your money. enjoy!!!");
        }
    }

    public String getNumber() {
        return Number;
    }

    public double getBalance() {
        return Balance;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
