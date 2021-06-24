import java.util.Scanner;

public class HesapKontrol {

    public static void main(String[] args) {

        String userName, password, newPass;

        String user = "patika";
        String pass = "java12";

        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz : ");
        userName = scan.nextLine();

        System.out.println("Şifrenizi Giriniz : ");
        password = scan.nextLine();

        if (userName.equals(user) && password.equals(pass)) {

            System.out.println("Giriş Yaptınız.");

        } else {
            System.out.println("Hesap Bilgileriniz Hatalı");

            System.out.println("Şifre Sıfırlamak için 1 e basınız, çıkmak için 2 seçiniz.");

            int a = scan.nextInt();


boolean b=false;
for(;;) {
    switch (a) {

        case 1:
            System.out.println("Yeni Şifrenizi giriniz : ");
            Scanner scan1 = new Scanner(System.in);
            newPass = scan1.nextLine();

            if (newPass.equals(pass)) {
                System.out.println("Eski şifrenizi tekrar kullanamazsınız. Lütfen Yeni Şifre Giriniz : ");


            } else {

                System.out.println("Şifreniz güncellendi");
b=true;

            }

            break;

        case 2:
            System.out.println("Çıkış Yapıldı.");
            break;

        default:
            System.out.println("Geçersiz işlem Seçildi.");


    }
    if(b){

        break;
    }



}


        }


    }
}
