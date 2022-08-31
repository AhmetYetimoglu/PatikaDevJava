import java.util.Scanner;

public class Main {
    public static int pattern(int sayi1, int sayac, int temp){
        System.out.print(sayi1 + " ");
        if (sayi1<=0) {
            sayac = -1;
        }
        if (sayac == -1) {
            sayi1 += 10;
        }
        sayi1 -= 5;
        if (sayi1 == temp+5)
        {
            return 1;
        }
        return pattern(sayi1, sayac,temp);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int result = input.nextInt();
        int sayac = 0;
        pattern(result,sayac,result);
    }
}
