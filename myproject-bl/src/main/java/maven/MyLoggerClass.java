package maven;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyLoggerClass {

  private StatusLogger logger;
  private Messages messages;

  public MyLoggerClass(StatusLogger logger , Messages messages){

    this.logger = logger;

    this.messages = messages;
  }

  public void onBuildSucces(){

    logger.log(messages.onSuccess());

  }
}
