package appcontrol;

public class Dispatch
{
  private EpisodeOne One;
  private EpisodeTwo Two;
  private EpisodeThree Three;

  public Dispatch()
  {
    One = new EpisodeOne();
    Two = new EpisodeTwo();
    Three = new EpisodeThree();
  }

  public void dispatch( String request )
  {
    if( request.equalsIgnoreCase("ONE") )
    {
      One.show();
    }
    else if( request.equalsIgnoreCase("TWO") )
    {
      Two.show();
    }
    else
    {
      Three.show();
    }
  }
}
