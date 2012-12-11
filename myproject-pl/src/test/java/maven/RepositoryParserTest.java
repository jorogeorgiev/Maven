package maven;

import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author georgi.hristov@clouway.com
 */
public class RepositoryParserTest {

  @Test
  public void parserReturnsListWithPeople() throws SQLException, ClassNotFoundException {
    List<Person> people;
    RepositoryParser parser = new RepositoryParser();
    people=parser.parse();
    assertThat(people.size(),is(1));

  }


}
