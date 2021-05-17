package Proje;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PostgreSqlVeritabaniBirimi postgre = new PostgreSqlVeritabaniBirimi();
        postgre.baglan();
        Sleep.sleep();
        Kullanici1 kullanici1 = new Kullanici1.Builder().name("Aleyna").build();
        Kullanici2 kullanici2 = new Kullanici2.Builder().surname("Barut").build();
        Publisher publisher = new Publisher();
        publisher.attach(kullanici1);
        publisher.attach(kullanici2);
        publisher.notify("Cihaz kullanıma hazırlanıyor...Lütfen bekleyiniz...");
        Sleep.sleep();
        AgArayüzü.girisEkrani();

    }
}


