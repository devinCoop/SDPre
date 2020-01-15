import static java.lang.System.*;
import java.util.Scanner;

public class Objective5Lab1 {
  public static void main(String[] args) {
    int month = 6;
    /* Could accept user input as follows
    out.print("Enter a month (1-12): ");
    Scanner keyboard = new Scanner(System.in);
    month = keyboard.nextInt();
    */

    switch (month) {
      case 1:
        out.println("January");
        break;
      // Would follow this with case 2 thru 5
      case 6:
        out.println("June");
        break;
      // Would follow this with case 7 thru 12
      default:
        out.println("That is not a valid month");
        break;
    }
  }
}
