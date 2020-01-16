import static java.lang.System.*;
import java.util.Scanner;

public class Objective6Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {
      out.println("____Menu____");
      out.println("1: Say Hello");
      out.println("2: List My favorite foods");
      out.println("3: Exit");
      out.println();

      selection = scanner.nextInt();

      if (selection == 1) {
        out.println("Hello World");
      }
      else if (selection == 2) {
        out.println("Apple, Banana, Coconut");
      }
      else if (selection == 3) {
        out.println("Goodbye");
        break;
      }
      else {
        out.println("Incorrect input");
      }
    }

    scanner.close();
  }
}
