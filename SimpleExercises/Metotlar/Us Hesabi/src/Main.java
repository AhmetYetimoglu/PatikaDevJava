import java.util.Scanner;

public class Main {
    static int expo(int tabanDegeri, int usDegeri,int sonuc) {
        if(usDegeri == 0){
            return sonuc;
        }
        sonuc = sonuc*tabanDegeri;
        return expo(tabanDegeri,usDegeri-1,sonuc);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int tabanDegeri = scan.nextInt();
        System.out.print("Üs değeri giriniz : ");
        int usDegeri = scan.nextInt();
        int sonuc = 1;
        System.out.println(expo(tabanDegeri,usDegeri,sonuc));
    }
}
