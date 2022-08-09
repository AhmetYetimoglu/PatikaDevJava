import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double para;
        double kdv = 18.0/100.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Para girişi : ");
        para = input.nextDouble();

        double kdvTutari =  para * kdv;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'li fiyat : " + kdvliFiyat);
        System.out.println("KDV Tutarı : " + kdvTutari);

    }
}
