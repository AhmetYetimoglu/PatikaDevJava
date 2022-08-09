import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double taksimetre = 2.20;
        double acilisUcreti = 10;
        double minimumUcret = 20;
        double sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("KM : ");
        int gidilenKM = input.nextInt();
        sonuc = (taksimetre*gidilenKM);
        sonuc += acilisUcreti;
        sonuc = (sonuc<minimumUcret) ? minimumUcret : sonuc;
        System.out.println("Ödenecek tutar = " +sonuc );
    }
}
