import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int KM, yas, gidisDonus;
        double fiyat = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        KM = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=>Gidiş Dönüş) : ");
        gidisDonus = input.nextInt();

        if (KM>0 && yas>0 && (gidisDonus == 1 || gidisDonus == 2)) {
            fiyat = KM*0.10;
            if (yas<12){
                fiyat /= 2;
                if (gidisDonus == 2){
                    fiyat = fiyat - fiyat/5;
                    fiyat *= 2;
                }
            } else if (yas>=12 && yas<=24) {
                fiyat = fiyat - fiyat/10;
                if (gidisDonus == 2){
                    fiyat = fiyat - fiyat/5;
                    fiyat *= 2;
                }
            } else if (yas>65) {
                fiyat = fiyat - fiyat/5;
                if (gidisDonus == 2){
                    fiyat = fiyat - fiyat/5;
                    fiyat *= 2;
                }
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
        if (fiyat!=0) {
            System.out.println("Toplam Tutar = " +fiyat+" TL");
        }
    }
}
