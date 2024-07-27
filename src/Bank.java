public class Bank {
    private float money;
    private String user;
    private float amount;

    public Bank(String user){
        this.user = user;
        System.out.println("Welcome To The Banking App "+user);
    }

    public void addMoney(float amount){
        money += amount;
    }

    public void withdrawMoney(float amount){
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
