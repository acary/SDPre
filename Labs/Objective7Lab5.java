import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while (true) {

      System.out.println();
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      try {
        selection = scanner.nextInt();

        switch(selection) {
          case 1:
            System.out.println("Hello World");
            break;
          case 2:
            System.out.println("Tater tots, Bacon, Green onion");
            break;
          case 3:
            System.out.println("Goodbye");
            break;
          default:
            System.out.println("No valid selection entered.");
            break;
        }
      }
      catch (Exception e) {
        System.out.println("Please enter a valid selection: " + e);
      }

      System.out.println();
      scanner.close();
      return;
    }
  }
}
