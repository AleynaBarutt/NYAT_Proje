package Proje;

public class Kontrol {
    private boolean acik = false;
    Sistem sistem = new Sistem();

    public void kontrol(String durum){
        Sleep.sleep();
        if(durum.equals("Ac")){ //Soğutucu zaten açık mı
            sistem.sogutucuAc();
            acik = true;
        }
        else { //Soğutucu zaten açık değil
            sistem.sogutucuKapat();
            acik = false;
        }

    }
    public boolean acikMi(){
        if (acik) {
            return true;
        }
        else return false;
    }

    public boolean kapaliMi(){
        if (acik) {
            return false;
        }
        else return true;
    }



}
