package ht5_16_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private String name;
    private int age;
    Adres adres;
    private String lang;

    public Student() {
        setRandomName();
        setRandomAge();
        adres = new Adres("Kirova St.","Dnepr","Zapad","123-456");
        lang = "rus";

    }

    public String fullStudentInformation()
    {
        String st = getName() +" " + getAge() +  " " + adres.getFullAdres() + " " + getLang();
        return  st;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setRandomName() {
        String [] str = new String [20];
        str[0] = "Vasia";
        str[1] = "Petia";
        str[2] = "Tolik";
        str[3] = "Edic";
        str[4] = "Nikolay";
        str[5] = "Vova";
        str[6] = "Anton";
        str[7] = "Sergey";
        str[8] = "Ashot";
        str[9] = "Kirill";
        str[10] = "Ksenia";
        str[11] = "Karina";
        str[12] = "Vasilisa";
        str[13] = "Stepanida";
        str[14] = "Efrosinia";
        str[15] = "Katerina";
        str[16] = "Valeria";
        str[17] = "Evlampia";
        str[18] = "Pelagea";
        str[19] = "Varvara";
        this.name = str[ThreadLocalRandom.current().nextInt(0, 19 + 1) ];
    }

    public int getAge() {
        return age;
    }

    public void setRandomAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1) ;
        this.age = randomNum;
    }
}
