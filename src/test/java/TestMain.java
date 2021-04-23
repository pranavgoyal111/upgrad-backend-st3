import ua.telecom.phonebook.util.PasswordUtil;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("user_sergiy - " + PasswordUtil.encode("user_sergiy"));
        System.out.println("anasteisha - " + PasswordUtil.encode("anasteisha"));
        System.out.println("12345 - " + PasswordUtil.encode("12345"));
    }
}
