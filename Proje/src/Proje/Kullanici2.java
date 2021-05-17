package Proje;

public class Kullanici2 implements IObserver{

    private String name, surName, password;

    public Kullanici2(Builder builder) {
        this.name = builder.name;
        this.surName = builder.surName;
        this.password = builder.password;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    public String getPassword() {
        return password;
    }
    public static class Builder{

        private String name, surName, password;

        public Builder(){ }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surName){
            this.surName = surName;
            return this;
        }

        public Builder password(String password){
            this.password = password;
            return this;
        }

        public Kullanici2 build(){
            return new Kullanici2(this);
        }

    }

    @Override
    public void update(String message) {
        System.out.println("Kullanıcı 2'ye gelen mesaj: "+message);
    }
}
