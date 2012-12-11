package maven;


import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyLoggerClassTest {



  @Test
  public void test() {
    boolean a=true;
    assertTrue(a);
  }

  @Test
  public void loggerNotifiesOnScriptBuiltSuccess(){

    StatusLogger logger = mock(StatusLogger.class);
    Messages messages = new Messages();
    MyLoggerClass loggerClass = new MyLoggerClass(logger,messages);
    loggerClass.onBuildSucces();
    verify(logger,times(1)).log(messages.onSuccess());

  }

}
