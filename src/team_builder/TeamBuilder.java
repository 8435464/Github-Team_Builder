/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team_builder;

/**
 *
 * @author che8435464
 */
public class TeamBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InputOutput.output("Welcome to the Team Builder System");
        InputOutput.output(" -====-- --- ");
        int i = InputOutput.inputint("How many members are in the team? ");
        Member[] teamMembers = new Member[i];
        InputOutput.output("Input the team members (Name:Surname:Sex:DD/MM/YYYY) :");
        for (int j = 0; j < i; j++) {
            String member = InputOutput.input();
            InputOutput.output("");
            int indexSeperator = member.indexOf(":");
            String name = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + l, member.length());

            indexSeperator = member.indexOf(":");
            String surname = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + l, member.length());
            indexSeperator = member.indexOf(":");
            char sex = member.charAt(0);
            member = member.substring(indexSeperator + l, member.length());
            indexSeperator = member.indexOf("/");
            String dateString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + l, member.length());
            indexSeperator = member.indexOf("/");
            String monthString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + l, member.length());
            String yearString = member.substring(0, member.length());
            Integer dateinteger = new Integer(dateString);
            Integer monthinteger = new Integer(monthString);
            Integer yearinteger = new Integer(yearString);
            int date = dateinteger.intValue();
            int month = monthinteger.intValue();
            int year = yearinteger.intValue();
            teamMembers[j] = new Member(name, surname, sex, date, month, year);
        }
        int selection = 0;
        while (selection != 1 && selection != 2 && selection != 3) {
            InputOutput.output("");
            InputOutput.output("Team Builder Menu: ");
            InputOutput.output("");
            InputOutput.output("=========");
            InputOutput.output("");
            InputOutput.output("l) List the team members");
            InputOutput.output("2) Find the oldest member");
            InputOutput.output("3) Find the youngest member");
            selection = InputOutput.inputint("");
            switch (selection) {
            
        
    

case 1: InputOutput.output("");
outputTeamMembers(teamMembers);
break;
case 2: InputOutput.output("The oldest member is: "+ oldest(teamMembers));
break;
case 3: InputOutput.output("The youngest member is: "+ youngest(teamMembers));
default: break;
        }

    }
