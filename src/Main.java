import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args)
    {
        String login = "skypro5";
        String password = "qwerty123";
        String confirmPassword = "qwerty123";
        try {
            Validator.validate(login, password, confirmPassword);
            System.out.println("All ok");
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        }//я решил использовать этот способ по причине того что мне кажется такой код более читаем,что я считаю важным
    }
}