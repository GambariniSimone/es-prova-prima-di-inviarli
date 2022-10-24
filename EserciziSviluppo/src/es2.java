import java.util.Scanner;

public class es2 {
    public static int ris1 = 0, ris2 = 0;

    public static void main(String[] args) {
        Scanner binario = new Scanner(System.in);
        String bin1, bin2;
        boolean ripeti, ferma;
        int muv;
        System.out.println("inserisci una stringa in codice binario \n" +
                "es: 10111001");
        bin1 = binario.next();
        System.out.println("inserisci una string binaria lunga uguale ma diversa dalla prima");
        do {
            bin2 = binario.next();
            ripeti = controllo(bin1, bin2);
            if (ripeti) {
                ferma = false;
                muv = swapmin(bin1, bin2);
                System.out.println("I movimenti sono " + muv);
            } else {
                ferma = true;
                System.out.println("Devi inserire una stringa diversa dalla prima ma lunga uguale");
                ris1 = 0;
                ris2 = 0;
            }

        } while (ferma);

    }

    public static int swapmin(String bin1, String bin2) {
        int cont = 0, muv = 0;
        char[] list1 = bin1.toCharArray();
        char[] list2 = bin2.toCharArray();
        for (int pern = 0; pern <= list1.length; pern++) {

            for (int num = 0; num < list2.length; num++) {

                if ((list1[pern] == '1') && (list2[num] == '1') && (cont == 0) &&(pern != num)) {
                    if(pern == 0){
                        muv =-1;
                    }
                    muv = (num - pern) + muv;
                    cont++;
                }
            }
            cont = 0;
        }

        return muv;
    }

    public static boolean controllo(String bin1, String bin2) {
        int div;
        String estrat1 = bin1, estrat2 = bin2;
        boolean ripeti;

        if (bin1.equals(bin2)) {
            ripeti = false;
        } else {

            if (bin1.length() == bin2.length()) {


                do {
                    div = estrat1.indexOf("0");
                    estrat1 = estrat1.substring(div + 1);

                    if (div != -1) {
                        ris1++;
                    }

                } while (div > -1);

                do {

                    div = estrat2.indexOf("0");
                    estrat2 = estrat2.substring(div + 1);
                    if (div != -1) {
                        ris2++;
                    }


                } while (div > -1);
                if (ris1 == ris2) {
                    ripeti = true;
                } else {
                    ripeti = false;
                }
            } else {
                ripeti = false;
            }
        }

        return ripeti;
    }
}
