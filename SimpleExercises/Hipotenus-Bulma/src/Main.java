import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int uzunKenar, kisaKenar;
        double hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("Uzun Kenar : ");
        uzunKenar = input.nextInt();

        System.out.print("Kısa Kenar : ");
        kisaKenar = input.nextInt();

        hipotenus = (kisaKenar*kisaKenar + uzunKenar*uzunKenar);
        hipotenus = Math.sqrt(hipotenus);
        System.out.println("hipotenüs : " + hipotenus);
    }
}
