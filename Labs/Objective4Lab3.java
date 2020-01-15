import static java.lang.System.*;
import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    out.println("Please enter a number: ");

    userNum = scanner.nextInt();

    if (userNum > 0) {
      out.println("The number is positive");
    }
    else if (userNum == 0) {
      out.println("The number is 0");
    }
    else if (userNum < 0) {
      out.println("The number is negative");
    }
  }
}
