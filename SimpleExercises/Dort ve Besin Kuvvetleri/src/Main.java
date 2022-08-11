import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayı giriniz : ");
        n = input.nextInt();
        System.out.println("Dortun katları");
        for (int i=1; i<=n;i*=4){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Besin katları");
        for (int i=1; i<=n;i*=5){
            System.out.print(i + " ");
        }
    }
}
