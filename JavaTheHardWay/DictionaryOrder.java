import static java.lang.System.*;
import java.util.Scanner;
public class DictionaryOrder {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine();

    if (name.compareToIgnoreCase("c++") < 0)
      out.println(name + " comes BEFORE c++");
    if (name.compareToIgnoreCase("c++") == 0)
      out.println("c++ isn't a made-up language!");
    if (name.compareToIgnoreCase("c++") > 0)
      out.println(name + " comes AFTER c++");

    if (name.compareToIgnoreCase("go") < 0)
      out.println(name + " comes BEFORE go");
    if (name.compareToIgnoreCase("go") == 0)
      out.println("go isn't a made-up language!");
    if (name.compareToIgnoreCase("gp") > 0)
      out.println(name + " comes AFTER go");

    if (name.compareToIgnoreCase("java") < 0)
      out.println(name + " comes BEFORE java");
    if (name.compareToIgnoreCase("java") == 0)
      out.println("java isn't a made up language!");
    if (name.compareToIgnoreCase("java") > 0)
      out.println(name + " comes AFTER java");

    if (name.compareToIgnoreCase("lisp") < 0)
      out.println(name + " comes BEFORE lisp");
    if (name.compareToIgnoreCase("lisp") == 0)
      out.println("lisp isn't a made-up language!");
    if (name.compareToIgnoreCase("lisp") > 0)
      out.println(name + " comes AFTER lisp");

    if (name.compareToIgnoreCase("python") < 0)
      out.println(name + " comes BEFORE python");
    if (name.compareToIgnoreCase("python") == 0)
      out.println("python isn't a made-up language!");
    if (name.compareToIgnoreCase("python") > 0)
      out.println(name + " comes AFTER python");

    if (name.compareToIgnoreCase("ruby") < 0)
      out.println(name + " comes BEFORE ruby");
    if (name.compareToIgnoreCase("ruby") == 0)
      out.println("ruby isn't a made-up language!");
    if (name.compareToIgnoreCase("ruby") > 0)
      out.println(name + " comes AFTER ruby");

    if (name.compareToIgnoreCase("visualbasic") < 0)
      out.println(name + " comes BEFORE visualbasic");
    if (name.compareToIgnoreCase("visualbasic") == 0)
      out.println("visualbasic isn't a made-up language!");
    if (name.compareToIgnoreCase("visualbasic") > 0)
      out.println(name + " comes AFTER visualbasic");
  }
}
