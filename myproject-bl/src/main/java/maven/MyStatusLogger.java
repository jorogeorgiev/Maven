package maven;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyStatusLogger  implements  StatusLogger{

  @Override
  public void log(String msg) {
    System.out.println(msg);
  }
}
