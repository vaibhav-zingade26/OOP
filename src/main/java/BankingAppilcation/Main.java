package BankingAppilcation;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("AX0989",7898,"Vaibhav","vaibhav@gmail.com","9021317200");
        account.depositMoney(200);
        account.withdraw(767);
    }
}
