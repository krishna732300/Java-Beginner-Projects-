import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your  num1");
    double num1 = sc.nextDouble();

    System.out.println("enter the  operator");
    char operator = sc.next().charAt(0);

    System.out.println("Enter the num2");
    double num2 = sc.nextDouble();

    double result = 0;
    boolean ValiOperation = true;

    switch (operator) {
      case '+':
        result = num1 + num2;

        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        if (num2 != 0)
          result = num1 / num2;
        else {
          System.out.println("cannot be devide by zero");
          ValiOperation = false;
        }
        break;

      default:
        System.out.println("Invalid  Operator!");
        ValiOperation = false;
    }
    if (ValiOperation) {
      System.out.println("Result: " + result);
    }

    sc.close();

  }
}
