package Lesson7.OptionalApp;

import java.util.ArrayList;
import java.util.Optional;

public class OptApp {

    public int behaviour (String s) {
        return 4;
    }

    public static void main1(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add( "one" );
        a.add( null );
        a.add( "two" );
        a.add( null );
        a.add( "three" );
        a.add( null );
        a.add( null );
        a.add( null );
        a.forEach(s -> System.out.printf( "** %s **\n", s ));
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = null;

        Optional<String> o1 = Optional.of( s1 );
        Optional<String> o11 = Optional.ofNullable( s1 );
        Optional<String> o2 = Optional.ofNullable( s2 );
        Optional<String> o3 = Optional.empty();
    }
}
