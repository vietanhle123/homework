package BTVN_Java.atmMachine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final Pattern accNumRegex = Pattern.compile("[0-9]+", Pattern.CASE_INSENSITIVE);
    public static final Pattern EmailRegex = Pattern.compile(
            "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9]+\\.)+[a-zA-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    public static final Pattern PasswordRegex = Pattern.compile(
            "(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;]).{7,15}", Pattern.CASE_INSENSITIVE);
    public static String validateEmail(String email) {
        Matcher matcher = EmailRegex.matcher(email);
        if (matcher.find()) {
            return email;
        } else {
            throw new RuntimeException("Email is invalid!");
        }
    }
    public static String validatePassword(String password) {
        Matcher matcher = PasswordRegex.matcher(password);
        if (matcher.find()) {
            return password;
        } else {
            throw new RuntimeException("Password is invalid!");
        }
    }
    public static String validateaccNum(String accNum) {
        Matcher matcher = accNumRegex.matcher(accNum);
        if (matcher.find()) {
            return accNum;
        } else {
            throw new RuntimeException("So tai khoan khong hop le");
        }
    }
}
