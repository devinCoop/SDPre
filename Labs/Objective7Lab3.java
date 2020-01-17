import static java.lang.System.*;
import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = scanner.nextInt();
      if (selection == 1) {
        out.println("Hello human");
      }
      else if (selection == 2) {
        out.println("Apples, Bananas, Coconuts");
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

  public static void printMenu() {
    out.println("____Menu____");
    out.println("1: Say Hello");
    out.println("2: List my favorite foods");
    out.println("3: Exit");
    out.println();
  }
}
