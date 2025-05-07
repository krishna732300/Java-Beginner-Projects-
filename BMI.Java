import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your waight(in kg): ");
    double w = sc.nextDouble();
    System.out.println("enter your Height(in meter): ");
    double h = sc.nextDouble();

    double bmi = w / (h * h);

    System.out.println("Your Bmi is: " + bmi);

    if (bmi < 18.5) {
      System.out.println("you are underweight");
    } else if (bmi >= 18.5 && bmi < 24.9) {
      System.out.println("You have normal weight");

    } else if (bmi >= 24.9 && bmi < 29.9) {
      System.out.println("you are Overweight");
    } else {
      System.out.println("you are obese");
    }
    sc.close();

  }
}
