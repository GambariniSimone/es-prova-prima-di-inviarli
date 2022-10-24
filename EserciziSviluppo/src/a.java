import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estrat;
        String i = sc.next(), r;
        int div = 0;
        char[] list1 = i.toCharArray();

        for (int pern = 0; pern < list1.length; pern++) {

            if ((list1[pern] == '0')) {

                div++;
                System.out.println(div);
            }
        }
    }
}
//} while (!(div > -1 || estrat.length() > 0));