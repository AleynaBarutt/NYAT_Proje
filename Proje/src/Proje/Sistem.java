package Proje;

public class Sistem implements  ISistem{
    SicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();
    Eyleyici eyleyici = new Eyleyici();


    @Override
    public void sicaklikAlgila() {

        sicaklikAlgilayici.sicaklikOku();
    }

    @Override
    public void sogutucuAc() {
        eyleyici.sogutucuAc();

    }

    @Override
    public void sogutucuKapat() {
        eyleyici.sogutucuKapat();

    }



}
