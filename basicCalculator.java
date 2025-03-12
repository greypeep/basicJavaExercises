import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double num1;
    double num2;
    char operator;
    System.out.print("What is the first number of our operation? ");
    num1=input.nextDouble();
    System.out.print("What will be our operator (+,-,*,/,%,^)?");
    operator = input.next().charAt(0);
    System.out.print("What is the second number of our operation? ");
    num2=input.nextDouble();
    switch (operator) {
        case('+') -> System.out.print(num1 + num2);
        case('-') -> System.out.print(num1 - num2);
        case('*') -> System.out.print(num1 * num2);
        case('/') -> {
            if (num2 != 0) {
                System.out.print(num1 / num2);
            } else {
                System.out.print("you cant divide by 0");
            }
        }
        case('%') -> System.out.print(num1 % num2);
        case('^') -> System.out.print(Math.pow(num1,num2));
        default -> System.out.print("\""+operator+"\"" + " isnt a valid operator");
    }
    input.close();
    }
}
