import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    double firstInvestment;
    double interestRate;
    int compound;
    int years;
    double endResult;
    System.out.print("What was your first investment? ");
    firstInvestment = scanner.nextDouble();
    System.out.print("Whats the interest rate(in %)? ");
    interestRate = scanner.nextDouble() / 100;
    System.out.print("How many times it compounds per year?  ");
    compound=scanner.nextInt();
    System.out.print("How many years do you wish to have passed? ");
    years=scanner.nextInt();
    endResult = firstInvestment * (Math.pow(1+(interestRate/compound),compound*years));
    System.out.printf("This is the amount that will be obtained after %d years : %.2f ",years,endResult);
    scanner.close();
    }
}
