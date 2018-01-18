package ht5_16_01_18;

public class School {
private int number;
private Adres adres;
private ClassRoom[] classList;

    public School() {
    }

    public School(int number, Adres adres, ClassRoom classRoom) {
        this.number = number;
        this.adres = adres;
        for (int i = 0; i < classList.length; i++){
            if (classList[i] == null) {
                classList[i] = classRoom;
            }
        }

    }
}
