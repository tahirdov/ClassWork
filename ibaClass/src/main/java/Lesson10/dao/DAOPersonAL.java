package Lesson10.dao;

import java.util.ArrayList;
import java.util.List;

public class DAOPersonAL implements DAO<Person> {

  private ArrayList<Person> persons = new ArrayList<>();

  @Override
  public void put(Person person) {
    persons.add( person );
  }

  @Override
  public Person get(int id) {
    Person info = null;
   for (Person person : persons ) {
     if (id == person.getId()) {
       info = person;
     }
   }
   return info;
  }

  @Override
  public void delete(int id) {
    for (Person person : persons ) {
      if (id == person.getId()) {
        System.out.printf("%s has been deleted", person.getName());
        persons.remove( person );
        break;
      }
    }

  }

  @Override
  public List<Person> getAll() {
    return persons;
  }
}
