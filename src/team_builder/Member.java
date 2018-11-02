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

    public String getName(){
        return this.name;
    }
    
    Member[] teamMembers = new Member[i];
}
