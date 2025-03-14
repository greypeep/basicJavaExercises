import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double balance = 0.0;
    boolean isRunning = true;
    byte choice;
    double maxWithdraw;
    while (isRunning) {
        System.out.print("Select one of the options: \n Show Balance(Press 1)");
        System.out.print("\n Deposit(Press 2) \n Withdraw(Press 3) \n Quit (Press 4) \n");
        choice= scanner.nextByte();
        switch (choice) {
            case 1 -> showBalance(balance);
            case 2 -> {
                System.out.println("How much you wish to deposit?");
                balance += scanner.nextDouble();
            }
            case 3 -> {
                System.out.println("How much you wish to withdraw?");
                maxWithdraw = scanner.nextDouble();
                if (maxWithdraw > balance) {
                    System.out.print("You do not have enough money \n");
                } else {
                    balance -= maxWithdraw;
                }
            }
            case 4 -> isRunning = false;
        }
    }
    scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Your balance is %.1f \n",balance);
    }

}
