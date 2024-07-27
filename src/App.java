public class App {
    public static void main(String[] args) throws Exception {
        Bank person = new Bank("Pankaj");

        person.addMoney(200);
        person.withdrawMoney(300);
        person.checkBalance();
    }
}
