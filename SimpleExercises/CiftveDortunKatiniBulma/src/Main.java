import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam= 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Lutfen bir sayi giriniz : ");
            sayi = input.nextInt();

            if (sayi%2 == 0) {
                toplam+=sayi;
            }
        }while (sayi%2 == 0);

        System.out.println("Toplam : " +toplam);
    }
}