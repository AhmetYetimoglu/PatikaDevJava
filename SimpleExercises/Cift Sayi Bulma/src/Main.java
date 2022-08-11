import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, ortalama= 0, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        sayi = input.nextInt();
        for (int i=0; i<=sayi;i++) {
            if (i%12==0 && i!=0) {
                ortalama+=i;
                sayac++;
            }
        }
        ortalama = ortalama/sayac;
        System.out.println("Ortalama : " +ortalama);
    }
}
