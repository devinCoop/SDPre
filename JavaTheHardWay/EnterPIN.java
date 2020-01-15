import static java.lang.System.*;
import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pWord, pwEntry;

    pin = 12345;
    pWord = "punkybrew";

    out.println("WELCOME TO THE BANK OF JAVA.");
    out.println("ENTER YOUR PASSWORD: ");
    pwEntry = keyboard.next();

    while (! pwEntry.equals(pWord)) {
      out.println("INCORRECT PASSWORD. TRY AGAIN.");
      out.println("ENTER YOUR PASSWORD: ");
      pwEntry = keyboard.next();
    }

    out.print("PASSWORD ACCEPTED. ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      out.println("\nINCORRECT PIN. TRY AGAIN.");
      out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
