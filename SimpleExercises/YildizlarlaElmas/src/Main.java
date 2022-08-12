import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        for (int i = 0; i <= n ; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        int m = n-1;
        for (int i = 0; i <= m;i++){
            for (int k = 1; k <= (i+1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2*m+1)-(2 * i)); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
