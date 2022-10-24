import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner Email = new Scanner(System.in);
        boolean risposta = false, ferma = true, blocca;
        do {
            System.out.println("Inserire un indirizzo email");
            risposta = controlloEmail(Email.next(), risposta);

            if (risposta) {
                System.out.println("Indirizzo email esistente");
            } else {
                System.out.println("indirizzo email inesistente");
            }

            System.out.println(" ");
            System.out.println("inserisci i vari numeri se: \n" +
                    "1 - continuare a inserire delle Email \n" +
                    "2 - uscire dal programma");
            do {
                switch (Email.next()) {
                    case "1":
                        blocca = false;
                        break;
                    case "2":
                        ferma = false;
                        blocca = false;
                        break;
                    default:
                        System.out.println("devi inserire 1 o 2");
                        blocca = true;
                }
            } while (blocca);

        } while (ferma);


    }

    public static boolean controlloEmail(String email, boolean risposta) {
        int div;
        String estrat;
        div = email.indexOf("@") + 1;
        estrat = email.substring(div);
        System.out.println(email);
        System.out.println(estrat);
        if ((email.indexOf("@") != -1) && (email.indexOf(".") != -1) && (email.indexOf("@") < email.indexOf(".")) && (estrat.indexOf("@") == -1)) {

            risposta = true;

        } else {
            risposta = false;
        }
        System.out.println(risposta);
        return risposta;
    }
}