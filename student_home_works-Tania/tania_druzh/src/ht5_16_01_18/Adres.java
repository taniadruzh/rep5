package ht5_16_01_18;

public class Adres {
    private String adres;
    private String city;
    private String region;
    private String phone;

    public Adres() {
    }

    public Adres(String adres, String phone) {
        this.adres = adres;
        this.phone = phone;
    }

    public Adres(String adres, String city, String region, String phone) {
        this.adres = adres;
        this.city = city;
        this.region = region;
        this.phone = phone;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullAdres()
    {
        String st =  getRegion() + " " + getCity() + " " + getAdres() + " " + getPhone();
        return st;
    }

    public String getShortAdres()
    {
        String st =  getAdres() + " " + getPhone();
        return st;
    }
}
