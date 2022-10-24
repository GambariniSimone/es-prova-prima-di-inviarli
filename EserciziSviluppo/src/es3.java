import java.util.Scanner;

public class es3 {
    public static int cont, pos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zip;
        boolean giusto;
        int posiz;
        System.out.println("Inserisci una Stringa che comprende minimo uno zip \n" +
                "(la zip deve essere minuscola)");
        zip = sc.nextLine();
        giusto = controllo(zip);
        if (giusto && cont > 1) {
            System.out.println("L'ultima zip si trova nella posizione: " + pos);
        }else{
            System.out.println("La paorla zip non e presente o non viene ripetuta abbastanza volte");
        }
    }

    public static boolean controllo(String zip) {
        int num;
        boolean giusto;
        do {
            num = zip.indexOf("zip");
            zip = zip.substring(num + 1);

            if(num != -1){
                cont++;
                pos = pos + num;
            }

        }while (num >= 0);

        if(cont == 0 ){
            giusto = false;
        }else{
            giusto = true;
        }

        return giusto;
    }

}
