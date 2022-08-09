import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        int merkezAcisi;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz : ");
        merkezAcisi = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        //Ödev
        alan = (alan*merkezAcisi)/360;
        System.out.println("Açı ilen girilen bölgenin alanı  : " + alan);
    }
}
