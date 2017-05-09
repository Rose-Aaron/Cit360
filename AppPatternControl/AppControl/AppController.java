package appcontrol;

public class AppController
{
  private Dispatcher dispatcher;

  public AppController()
  {
    dispatcher = new Dispatcher();
  }

  private boolean isAuthenticUser()
  {
    System.out.println("User authenticated successfully.");
    return true;
  }

  private void trackRequest( String request )
  {
    System.out.println("Page requested: " + request);
  }

  public void dispatchRequest( String request )
  {
    trackRequest(request);
    if( isAuthenticUser() )
    {
      dispatcher.dispatch(request);
    }
  }
}
