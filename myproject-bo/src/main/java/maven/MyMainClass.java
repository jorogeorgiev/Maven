package maven;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author georgi.hristov@clouway.com
 */
public class MyMainClass {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Messages messages = new Messages();
    Logger extLogger = Logger.getLogger("TestLogger");
    RepositoryParser parser = new RepositoryParser();
    List<Person> people = parser.parse();
    for (Person person : people) {
      extLogger.info(person.getInformation());
    }
    MyStatusLogger logger = new MyStatusLogger();
    MyLoggerClass loggerClass = new MyLoggerClass(logger, messages);
    loggerClass.onBuildSucces();
  }
}
