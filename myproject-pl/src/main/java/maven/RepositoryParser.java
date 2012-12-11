package maven;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author georgi.hristov@clouway.com
 */
public class RepositoryParser {

  private List<Person> people = new ArrayList<Person>();

  public List<Person> parse() throws SQLException, ClassNotFoundException {
    Class.forName("org.postgresql.Driver");
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mdb","postgres","123456");
    Statement statement = connection.createStatement();
    ResultSet set = statement.executeQuery("SELECT * FROM person");
    while (set.next()) {
      people.add(new Person(set.getString("firstName"), set.getString("secondName"), set.getInt("age")));
    }
    return people;

  }


}
