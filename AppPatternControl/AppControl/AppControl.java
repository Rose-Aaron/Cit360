package appcontrol;

import java.util.Scanner;

public class AppControl
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please type Episode 1, Episode 2, or Episode 3 to go to a page.");
    AppController app = new AppController();
    app.dispatchRequest(input.next());
      
  }
}
