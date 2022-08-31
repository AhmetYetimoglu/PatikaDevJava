import java.util.Scanner;

public class Main {

    public static int findAsalSayi(int result,int i)
    {
        if(result%i == 0)
        {
            if (result == i) {
                return 1;
            }
            else {
                return 0;
            }
        }
        i++;
        return findAsalSayi(result,i);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int result = input.nextInt();
        int i = 2;
        int sonuc = findAsalSayi(result,i);
        if (sonuc == 1)
        {
            System.out.println(result+ " sayısı ASALDIR !");
        }else
            System.out.println(result+ " sayısı ASAL değildir !");
    }
}
