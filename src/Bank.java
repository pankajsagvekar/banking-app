@SuppressWarnings("unused")
public class Bank {
    private double money;
    private String user;
    private double amount;

    public Bank(String user){
        this.user = user;
        System.out.println("Welcome To The Banking App "+user);
    }

    public void addMoney(double amount){
        money += amount;
    }

    public void withdrawMoney(double amount){
        if (amount > money) {
            System.out.println("Cannot Withdraw Balance Low : "+money);
        }
        else{
            money -= amount;
        }
    }

    public void checkBalance(){
        System.out.println("Your Balance Is: "+money);
    }
}
