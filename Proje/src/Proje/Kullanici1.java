package Proje;
public class Kullanici1 implements IObserver{
    private String name, surName, password;
    public Kullanici1(Builder builder) {
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
        public Kullanici1 build(){
            return new Kullanici1(this);
        }
    }

        @Override
    public void update(String message) {
        System.out.println("Kullanıcı 1'e gelen mesaj: "+message);

    }
}
