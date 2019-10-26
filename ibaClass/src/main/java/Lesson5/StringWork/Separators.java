package Lesson5.StringWork;

public class Separators {
    private final String lower_vowels;
    private final String upper_vowels;
    private final String lower_consonants;
    private final String upper_consonants;

    public Separators(String lower_vowels, String upper_vowels, String lower_consonants, String upper_consonants) {
        this.lower_vowels = lower_vowels;
        this.upper_vowels = upper_vowels;
        this.lower_consonants = lower_consonants;
        this.upper_consonants = upper_consonants;
    }

    public String getLower_vowels() {
        return lower_vowels;
    }

    public String getUpper_vowels() {
        return upper_vowels;
    }

    public String getLower_consonants() {
        return lower_consonants;
    }

    public String getUpper_consonants() {
        return upper_consonants;
    }
}
