import java.util.Scanner;

public class es4 {

    public static boolean fine;

    public static void main(String[] args) {
        Scanner numeri = new Scanner(System.in);
        String num;
        do {
            System.out.println("GENERAZIONE AUTOMATICA DI NUMERI");
            num = generazione();
            System.out.println(num);
        } while (fine);
    }

    public static String generazione() {
        int num;
        String list ="111";
        for (int n = 0; n <= 5; n++) {
            num = (int) (Math.random() * 5) + 1;
            list = Integer.toString(num);
        }

        return list;
    }

    public static boolean controllo() {
        boolean giusto = true;
        String listnum[] = new String[3125];
        return giusto;
    }
}
