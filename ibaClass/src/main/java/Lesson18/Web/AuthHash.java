package Lesson18.Web;

public class AuthHash implements Auth {
    @Override
    public boolean check(String name, String passwd) {
        return false;
    }
}
