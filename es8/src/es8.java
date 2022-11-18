import java.util.InputMismatchException;
import java.util.Scanner;

public class es8 {

    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        double num = 1, numinv;
        String inverti, pezzo , fin = "";
        char[] aiuto;
        boolean continua = false;

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
        for (int x = inverti.length() - 3; x >= 0; x--) {

            pezzo = inverti.substring(x, x + 1);
            fin = fin + pezzo;
            System.out.println(fin);
            System.out.println(pezzo);
        }
        

    }
}
