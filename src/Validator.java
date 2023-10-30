import exception.WrongLoginException;

public class Validator {
    private static final String LEGAL_LOGIN_CHARACTERS =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_";
    private static final int LOGIN_MAX_LENGTH = 20 ;
    public static void validate (
            String login,
            String password,
            String confirmPassword
    ) {
        for (int i = 0; i < login.length(); ++i) {
            if (LEGAL_LOGIN_CHARACTERS.indexOf (login.charAt(i)) == -1) {
                throw new WrongLoginException ("Логин содержит недопустимые символы");
            }
        }

        if (login.length() > LOGIN_MAX_LENGTH) {
            throw new WrongLoginException("Превышена допустимая длина логина");
        }
    }
}
