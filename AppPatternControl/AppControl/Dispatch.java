package appcontrol;

public class Dispatch
{
  private ChapterOne  Episode1;
  private ChapterTwo Episode2;
  private ChapterThree  Episode3;

  public Dispatch()
  {
    Episode1 = new ChapterOne();
    Episode2 = new ChapterTwo();
    Episode3 = new ChapterThree();
  }

  public void dispatch( String request )
  {
    if( request.equalsIgnoreCase("EPISODE1") )
    {
      Episode1.show();
    }
    else if( request.equalsIgnoreCase("EPISODE2") )
    {
      Episode2.show();
    }
    else
    {
      Episode3.show();
    }
  }
}
