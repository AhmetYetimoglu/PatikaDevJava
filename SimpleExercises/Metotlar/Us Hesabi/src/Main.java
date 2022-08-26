import java.util.Scanner;

public class Main {
    static void expo() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int tabanDegeri = scan.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int usDegeri = scan.nextInt();
        int sonuc = 1;
        for (int i=0;i<usDegeri;i++) {
            sonuc *= tabanDegeri;
        }
        System.out.println("Sonuc : " +sonuc);
    }
    public static void main(String[] args) {
        expo();
    }
}
