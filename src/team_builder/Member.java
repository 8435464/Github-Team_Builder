package team_builder;

public class Member {
 
    String name;
    String surname;
    char sex;
    int date;
    int month;
    int year;

    public Member(String name, String surname, char sex, int date, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public char getSex() {
        return this.sex;
    }

    public int getDate() {
        return this.date;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

}
