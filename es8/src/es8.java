import java.util.InputMismatchException;
import java.util.Scanner;

public class es8 {

    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num = 1, numinv, ris;
        String inverti, pezzo, fin = "";
        char[] aiuto;
        boolean continua = false,ferma = false;
        do {
            do {
                System.out.println("Inserisci un mumero intero");

                try {

                    num = sc.nextInt();
                    continua = false;
                } catch (InputMismatchException e) {
                    System.out.println("Devi inserire un numero intero");
                    continua = true;
                    sc.nextLine();
                }

            } while (continua);

            inverti = String.valueOf(num);
            for (int x = inverti.length(); x >= 0; x--) {
                if (x == inverti.length()) {
                    pezzo = inverti.substring(x);
                } else {
                    pezzo = inverti.substring(x, x + 1);
                }
                fin = fin + pezzo;
            }

            numinv = Integer.valueOf(fin);
            ris = num - numinv;

            if (ris < 0) {
                ris = 0;
                System.out.println("Il numero inserito:" + num + " il numero in uscita:" + ris);
            } else {
                System.out.println("Il numero inserito:" + num + " il numero in uscita:" + ris);
            }

            System.out.println("Sciegli un opzione: \n" +
                    "Inserisci 1 se vuoi continuare a inserire i numeri. \n" +
                    "Inserisci 2 se vuoi uscire dal programma.");
            do {
                switch (sc.next()) {
                    case "1":
                        ferma = false;
                        continua = true;
                        break;

                    case "2":
                        ferma = false;
                        continua = false;
                        break;

                    default:
                        System.out.println("Devi inserire 1 o 2");
                        ferma = true;
                }
            }while(ferma);
        } while (continua);
    }
}
