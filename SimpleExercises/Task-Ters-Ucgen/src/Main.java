import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı:");
        int value = input.nextInt();
        for (int i = 0; i<value; i++){
            for (int k = 1; k<=(i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=((2*value-1)-(2*i));j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
