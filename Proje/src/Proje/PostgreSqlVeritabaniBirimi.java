package Proje;

import java.sql.*;

public class PostgreSqlVeritabaniBirimi implements IMerkeziIslemBirimiVeritabani{
    private String url = "jdbc:postgresql://localhost:5432/SogutucuSistemi";
    private static Connection connection;
    @Override
    public void baglan() {
        try {
            connection = DriverManager.getConnection(url,"postgres","6434");
            System.out.println("Veritabanına bağlanıyor...");
            Sleep.sleep();
            System.out.println("Veritabanına bağlandı.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void baglantiyiBitir() {
        try {
            connection.close();
            System.out.println("Çıkış yapıldı.");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static boolean kullaniciDogrula(String kullaniciAdi, String sifre) {
        String dogrulamaKodu = "select *from \"Kullanici\" where \"kullaniciAdi\"='"+kullaniciAdi+"'"+ " and \"sifre\"='"+sifre+"'";
        String tempKullanici="";
        String tempSifre="";
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(dogrulamaKodu);
            while(resultSet.next()){
                tempKullanici = resultSet.getString("kullaniciAdi");
                tempSifre = resultSet.getString("sifre");
            }
            if(kullaniciAdi.equals(tempKullanici) && sifre.equals(tempSifre)){
                return true;
            } else
                return false;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
}
