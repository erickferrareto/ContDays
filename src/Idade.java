import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int year = 2022;
        System.out.println("Em que ano você nasceu ?");
        Scanner input = new Scanner(System.in);
        String rest = input.nextLine();
        int restConvert = Integer.parseInt(rest);
        int yearsOld = year - restConvert;
        int days = yearsOld * 365;
        int weeks = yearsOld * 52;
        int months = yearsOld * 12;
        System.out.println("Você tem " + yearsOld + " anos");
        System.out.println("Você viveu em média " + days + " dias");
        System.out.println("Você viveu em média " + weeks + " semanas");
        System.out.println("Você viveu em média " + months + " meses");

    }
}
