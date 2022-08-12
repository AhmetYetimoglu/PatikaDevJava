import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;

        // EBOB
        /*
        for (int i = 1; i <= n1;i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
         */
        int i = 1;
        while (i<=n1){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        // EKOK
        /*
        for (int i = 1; i <= (n1*n2); i++){
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
        }
         */
        i=1;
        while (i<=(n1*n2)){
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}
