/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_builder;

/**
 *
 * @author ZhaoZiqi
 */
public class Member {

    int i;
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
        return this.getName();
    }

    public String getSurname() {
        return this.getSurname();
    }

    public String getSex() {
        return this.getSex();
    }

    public String getDate() {
        return this.getDate();
    }

    public String getMonth() {
        return this.getMonth();
    }

    public String getYear() {
        return this.getYear();
    }

    Member[] teamMembers = new Member[i];

}
