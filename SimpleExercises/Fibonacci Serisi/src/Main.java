import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        0 + 1 = 1
        1 + 1 = 2
        1 + 2 = 3
        2 + 3 = 5
        3 + 5 = 8
        5 + 8 = 13
        13 + 8 = 21
         */
        int toplam = 1;
        int i=0;
        int temp;
        int N;

        System.out.print("Lütfen bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        for (int j = 0;j<N;j++){
            temp = toplam;
            toplam +=i;
            System.out.println(i + " + " + temp + " = " + toplam);
            i = temp;
        }
    }
}
