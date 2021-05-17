package Proje;

import java.util.Scanner;

public class MerkeziIslemBirimi {
    Sistem sistem =new Sistem();
    PostgreSqlVeritabaniBirimi postgre = new PostgreSqlVeritabaniBirimi();
    Kontrol kontrol=new Kontrol();
    public void islemSecimi(){
        int secim=0;
        int secim2=0;
        boolean durum=false;
        while(secim !=3){
            Scanner input=new Scanner(System.in);
            Sleep.sleep();
            System.out.println("********************");
            System.out.println("1-Cihazı Aç");
            System.out.println("2-Çıkış Yap");
            System.out.println("********************");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Cihaz açılıyor...Lütfen bekleyiniz");
                    Sleep.sleep();
                    System.out.println("Cihaz açıldı...");

                    while(secim2!=4){
                        Sleep.sleep();
                        System.out.println("*******MENÜ*********");
                        System.out.println("1- Sıcaklık Göster");
                        System.out.println("2- Soğutucuyu Aç ");
                        System.out.println("3- Soğutucuyu Kapat");
                        System.out.println("4- Cihazı Kapat");
                        System.out.println("********************");
                        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");

                       secim2 = input.nextInt();

                        switch(secim2){
                            case 1:
                                sistem.sicaklikAlgila();
                                break;
                            case 2:
                                if(kontrol.acikMi()){
                                    System.out.println("Soğutucunuz açık durumda.");
                                    System.out.println("Lütfen başka bir seçenek seçiniz...");
                                }
                                else kontrol.kontrol("Ac");
                                break;
                            case 3:
                                if(kontrol.kapaliMi()){
                                    System.out.println("Soğutucunuz kapalı durumda.");
                                    System.out.println("Lütfen başka bir seçenek seçiniz...");
                                }
                                else kontrol.kontrol("Kapat");
                                break;
                            case 4:
                                System.out.println("Cihaz kapatıldı.Teşekürler...");
                                break;
                            default:

                        }
                    }
                    break;
                case 2:
                    postgre.baglantiyiBitir();
                    System.exit(0);

                default:
                    System.out.println("Hatalı seçim yaptınız...Lütfen tekrar deneyiniz.");
                    break;
            }

        }
    }
}
