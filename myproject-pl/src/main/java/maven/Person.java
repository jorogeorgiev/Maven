package maven;


/**
 * @author georgi.hristov@clouway.com
 */
public class Person {

  private final String firstName;
  private final String secondName;
  private final Integer age;

  public Person(String firstName ,String secondName , Integer age){
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
  }

  public String getInformation(){

    return firstName + " " + secondName + " " + age + " " ;

  }

}
