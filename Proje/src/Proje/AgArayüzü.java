package Proje;
import java.util.Scanner;

public class AgArayüzü {
    public static void girisEkrani(){
        String kullaniciAdi="";
        String sifre="";
        Scanner girdi = new Scanner(System.in);
        System.out.println("Cihaz arayüzüne hoş geldiniz.");
        Sleep.sleep();
        System.out.print("Kullanıcı adınızı giriniz :");
        kullaniciAdi = girdi.nextLine();
        System.out.print("Şifrenizi giriniz :");
        sifre=girdi.nextLine();
        if(PostgreSqlVeritabaniBirimi.kullaniciDogrula(kullaniciAdi,sifre)){
            System.out.println("Bilgileriniz kontrol ediliyor...Lütfen bekleyiniz.");
            Sleep.sleep();
            System.out.println("Sisteme giriş yapıldı.");
            System.out.println("Hoş geldiniz "+kullaniciAdi);
            MerkeziIslemBirimi durum = new MerkeziIslemBirimi();
            durum.islemSecimi();
        }else System.out.println("Başarısız giriş gerçekleşti.Kullanıcı adı veya şifre yanlış.Lütfen tekrar deneyiniz.");

    }
}

