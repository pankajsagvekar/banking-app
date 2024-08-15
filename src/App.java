import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("Welcome To Bank App");
        System.out.println("---------------------------");
        System.out.println("Enter Your Name: ");
        String name = sc.next();
        Bank person = new Bank(name);

        Boolean running = true;
        while (running) {
            System.out.println("");
            System.out.println("Choose From Below Options: ");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Add Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");
            byte ch = sc.nextByte();

            switch (ch) {
                case 1:
                    System.out.println("Enter The Amount: ");
                    double Wcash = sc.nextDouble();
                    person.withdrawMoney(Wcash);
                    break;
                case 2:
                    System.out.println("Enter The Amount: ");
                    double Acash = sc.nextDouble();
                    person.addMoney(Acash);
                    break;
                case 3:
                    System.out.println("---------------");
                    person.checkBalance();
                    System.out.println("---------------");
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Please Enter The Right Choice");
                    break;
            }
        }
    }
}
