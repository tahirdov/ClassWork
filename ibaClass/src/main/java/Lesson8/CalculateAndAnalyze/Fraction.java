package Lesson8.CalculateAndAnalyze;

public class Fraction {
    private final int num;
    private final int den;

    public static Fraction from(String origin) {
     try {
         String[] parts = origin.split( "/" );
        int num = Integer.parseInt( parts[0] );
        int den = Integer.parseInt( parts[1] );
     } catch (RuntimeException ex) {
         throw new IllegalArgumentException( "No way to create Fraction from this String %s" + origin );
     }
     return new Fraction( 2,2 );
    }

    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int num() {
        return num;
    }

    public int den() {
        return den;
    }
}
