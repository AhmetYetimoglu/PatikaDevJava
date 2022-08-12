import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int deger , max = 0, min = 0;
        for (int i = 1; i <=n; i++){
            System.out.print(i+". sayıyı giriniz : ");
            deger = input.nextInt();
            if (i==1){
                max=deger;
                min=deger;
            } else if (deger > max) {
                max = deger;
            }else if(deger < min){
                min = deger;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
