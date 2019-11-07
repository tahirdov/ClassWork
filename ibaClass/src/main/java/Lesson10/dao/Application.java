package Lesson10.dao;

public class Application {
  public static void main(String[] args) {

    DAO<Person> pps = new DAOPersonAL();

    Person person1 = new Person( 0, "Tahir", 23 );
    Person person2 = new Person( 1, "Xeyal", 33 );
    Person person3 = new Person( 2, "Dadas", 43 );
    Person person4 = new Person( 3, "Balas", 53 );
    Person person5 = new Person( 4, "Esmira", 13 );
    Person person6 = new Person( 5, "Letafet", 63 );
    Person person7 = new Person( 6, "Alex", 73 );
    Person person8 = new Person( 7, "Kseniia", 83 );
    Person person9 = new Person( 8, "Nurlan", 93 );
    Person person10 = new Person( 9, "Zemfira", 3 );

    pps.put( person1 );
    pps.put( person2 );
    pps.put( person3 );
    pps.put( person4 );
    pps.put( person5 );
    pps.put( person6 );
    pps.put( person7 );
    pps.put( person8 );
    pps.put( person9 );
    pps.put( person10 );

    pps.delete( 4 );

  }
}
