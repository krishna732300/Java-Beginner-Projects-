import java.util.Scanner;

public class Palin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    int org = num;
    int rev = 0;

    while (num > 0) {
      int i = num % 10;
      rev = rev * 10 + i;
      num = num / 10;
    }
    if (org == rev) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
    sc.close();

  }
}
