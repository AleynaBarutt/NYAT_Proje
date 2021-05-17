package Proje;
import java.util.Random;
public class SicaklikAlgilayici implements ISicaklikAlgilayici {

    @Override
    public int randomSicaklik() {
        Random random = new Random();
        int sayi = random.nextInt(50);
        return sayi;
    }

    @Override
    public int sicaklikOku() {
        System.out.println("Sicaklik: " + randomSicaklik() + " Derece");
        return randomSicaklik();

    }
}