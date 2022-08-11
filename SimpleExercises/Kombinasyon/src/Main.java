import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //KOMBİNASYON
        //C(n,r)=n!/(r!*(n-r)!)

        int tumElemanlar, yeniElemanlar, sonuc;
        int birinciFaktoriyel = 1, ikinciFaktoriyel =1, ucuncuFaktoriyel =1;
        Scanner input = new Scanner(System.in);
        System.out.print("Toplam eleman sayısı : ");
        tumElemanlar = input.nextInt();

        System.out.print("Yeni grubun eleman sayısı : ");
        yeniElemanlar = input.nextInt();

        for (int i = 1; i <= tumElemanlar; i++) {
            birinciFaktoriyel *= i;
        }
        for (int i = 1; i <= yeniElemanlar; i++) {
            ikinciFaktoriyel *= i;
        }
        for (int i = 1; i <= (tumElemanlar-yeniElemanlar); i++) {
            ucuncuFaktoriyel *= i;
        }
        sonuc = birinciFaktoriyel / (ikinciFaktoriyel*ucuncuFaktoriyel);
        System.out.println("Kombinasyon sonucu : "+sonuc);
    }
}
