import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while (true) {
      Scanner in = new Scanner(System.in);
      
      char temporary;
      boolean works =  true;

      System.out.print("Enter a message: ");
      String input = in.nextLine();

      if (input.length() == 0 || input == "\'\'") {
        System.out.print("Ascending Order: Invalid String!\n\n");
        works = false;
      }
      
      ArrayList <Character> list = new ArrayList<Character>();
      
      for (int i = 0; i < input.length(); i++) {
        list.add(i, input.charAt(i));
      }

      int size = list.size();
      int i = 0;
      boolean sorted;
      
      for (;;) {
        sorted = true;
        for (i = 0; i < size - 1; i++) {
          if (list.get(i) > list.get(i + 1)) {
            temporary = list.get(i);
            list.set(i , list.get(i + 1));
            list.set(i + 1, temporary);
            sorted = false;
          }
        }
        if (sorted == true) 
          break;
      }
      if (input.length() != 0) {
        System.out.print("Ascending order:");
        for (i = 0; i< size; i++) {
          System.out.print(list.get(i));
        }
        System.out.println("\n");
      }
    }
  }
}

