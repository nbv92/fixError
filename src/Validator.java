import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validator {
    private static final String LEGAL_CHARACTERS =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_";
    private static final int MAX_LENGTH = 20 ;
    public static void validate (
            String login,
            String password,
            String confirmPassword
    ) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        for (int i = 0; i < login.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            }
        }

        if (login.length() > MAX_LENGTH) {
            throw new WrongLoginException("Превышена допустимая длина логина");
        }
    }

    private static void validatePassword (
            String password,
            String confirmPassword
    ) {

        for (int i = 0; i < password.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf (password.charAt(i)) == -1) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            }
        }

        if (password.length() > MAX_LENGTH) {
            throw new WrongPasswordException("Превышена допустимая длина пароля");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException ("Пароли не совпадают");
        }
    }
}
