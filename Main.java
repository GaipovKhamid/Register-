import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Passwords password = new Passwords();

        int passw = password.getPassword();
        String name = password.getName();

        System.out.print("Введите login: ");
        Scanner login = new Scanner(System.in);
        String loggin = login.next();
        if (loggin.equals(name)){
            System.out.print("Введите password: ");
            Scanner psw = new Scanner(System.in);
            int pass = psw.nextInt();

            if (pass == passw) {
                System.out.println("Ok, go to site");
            } else {
                System.out.println("Xato parol");
            }
        } else {
            System.out.println("Xato login");
        }

    }
}