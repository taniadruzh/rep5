package ht5_16_01_18;

public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;
    private String lang;
    public ClassRoom() {
    }

    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
    }

    public ClassRoom(String classWord, int classLimit, Student[] studMass, String lang) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
        this.lang = lang;
    }

    public ClassRoom(String classWord, String lang) {
        this.classWord = classWord;
        this.lang = lang;
    }

    public ClassRoom(String classWord) {
        this.classWord = classWord;
    }

    public int getClassCount() {
        return studMass.length;
    }

    public void getClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName() + " " + mass.getAge());

        }
    }

    public void getShortClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName());

        }
    }

    public void ageSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void ageRevSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    public void nameSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void nameRevSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }
    public void findStudent(String name){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(name)){
                System.out.println(studMass[i].getName() + " " + studMass[i].getAge());
            }
        }
    }

    public String findClass(String name){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(name)){
                return classWord;
            }
        }
        return "Not found in " + classWord;
    }

    public String getClassWord() {
        return classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public String getLang() {
        return lang;
    }
}
