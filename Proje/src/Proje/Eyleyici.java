package Proje;

public class Eyleyici implements IEyleyici{
    @Override
    public void sogutucuAc() {

        System.out.println("Soğutucu açılıyor...");
        Sleep.sleep();
        System.out.println("Soğutucu açıldı...");
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Soğutucu kapatılıyor...");
        Sleep.sleep();
        System.out.println("Soğutucu kapatıldı...");

    }
}
