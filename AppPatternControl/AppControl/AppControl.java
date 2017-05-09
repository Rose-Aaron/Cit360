package appcontrol;

import java.util.Scanner;

public class AppControl
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Please type EpisodeOne, EpisodeTwo, or EpisodeThree to go to a page.");
    AppController app = new AppController();
    app.dispatchRequest(input.next());
      
  }
}
