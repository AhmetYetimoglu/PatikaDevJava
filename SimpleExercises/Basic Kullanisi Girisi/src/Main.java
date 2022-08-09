import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        String dataUserName = "patika", dataPassword = "java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(dataUserName)) {
            if (!password.equals(dataPassword)) {
                System.out.print("Şifreniz yanlış! Şifrenizi sıfırlamak istiyor musunuz? (evet/hayır) : ");
                String cevap;
                cevap = input.nextLine();
                if (cevap.equals("evet")) {
                    String newPassword;
                    System.out.print("Yeni Şifre : ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(dataPassword)) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    } else {
                        dataPassword = newPassword;
                        System.out.println("Şifre oluşturuldu");
                    }
                }
            } else {
                System.out.println("Giriş Yaptınız !");
            }
        } else {
            System.out.println("Bilgileriniz Yanlış !");
        }
    }
}
