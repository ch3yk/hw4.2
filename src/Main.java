public class Main {
    public static void personalData(String login,String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new  WrongLoginException();
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException();
        }
        if (password.matches("^[a-zA-Z]*$")) {
            throw new WrongPasswordException();
        }
        if (password.matches("[1 2 3 4 5 6 7 8 9]")) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
    public static void main(String[] args) {
        try { personalData("Skypro_pro","Qwertyuiop1_","Qwertyuiop1_");
    }catch (WrongLoginException e) {
        System.out.println("Логин больше 20 символов");
    }
    catch (WrongPasswordException e) {
        System.out.println("Пороль не совподает требованием");
    }
    finally {
        System.out.println("Блок выполнен");
    }
    }

}
