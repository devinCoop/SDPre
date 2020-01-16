import static java.lang.System.*;

public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while (counter <= 20) {
      if (counter % 2 == 0) {
        out.println(counter + " is even");
      }
      else {
        out.println(counter + " is odd");
      }

      counter = counter + 1;
    }
  }
}
