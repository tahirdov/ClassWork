package Lesson5.StringWork;

public class Result {
    private final String origin;
    private final String upper_consonants;
    private final String upper_vowels;
    private final String lower_consonants;
    private final String lower_vowels;

    public Result(String origin,
                  String upper_consonants,
                  String upper_vowels,
                  String lower_consonants,
                  String lower_vowels) {
        this.origin = origin;
        this.upper_consonants = upper_consonants;
        this.upper_vowels = upper_vowels;
        this.lower_consonants = lower_consonants;
        this.lower_vowels = lower_vowels;
    }

    String getOrigin() {
        return origin;
    }

    String getUpper_consonants() {
        return upper_consonants;
    }

    String getUpper_vowels() {
        return upper_vowels;
    }

    String getLower_consonants() {
        return lower_consonants;
    }

    String getLower_vowels() {
        return lower_vowels;
    }

    int count(String string, int pos) {
        return string.length() - string.replaceAll( String.valueOf( pos ), "" ).length();
    }

}
