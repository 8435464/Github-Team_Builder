package team_builder;

public class TeamBuilder {

    public static void main(String[] args) {

        InputOutput.output("Welcome to the Team Builder System");
        InputOutput.output(" =========== ");
        int i = InputOutput.inputInt("How many members are in the team? ");

        Member[] teamMembers = new Member[i];

        InputOutput.output("Input the team members (Name:Surname:Sex:DD/MM/YYYY) :");

        for (int j = 0; j < i; j++) {

            String member = InputOutput.input();
            InputOutput.output("");

            int indexSeperator = member.indexOf(":");
            String name = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf(":");
            String surname = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf(":");
            char sex = member.charAt(0);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf("/");
            String dateString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

            indexSeperator = member.indexOf("/");
            String monthString = member.substring(0, indexSeperator);
            member = member.substring(indexSeperator + 1, member.length());

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

        while (selection != 4) {
            InputOutput.output("");
            InputOutput.output("");
            InputOutput.output("Team Builder Menu: ");
            InputOutput.output("");
            InputOutput.output("=========");
            InputOutput.output("");
            InputOutput.output("1) List the team members");
            InputOutput.output("2) Find the oldest member");
            InputOutput.output("3) Find the youngest member");
            InputOutput.output("4) Exit");

            selection = InputOutput.inputInt("");

            if (selection == 1) {
                InputOutput.output("");
                outputTeamMembers(teamMembers);
            } else if (selection == 2) {
                InputOutput.output("The oldest member is: " + oldest(teamMembers));
            } else if (selection == 3) {
                InputOutput.output("The youngest member is: " + youngest(teamMembers));
            } else if (selection == 4) {
                break;
            }

        }

    }

    public static void outputTeamMembers(Member[] teamMembers) {

        for (Member teamMember : teamMembers) {
            String name = teamMember.getName();
            String surname = teamMember.getSurname();

            char sex = teamMember.getSex();
            int date = teamMember.getDate();
            int month = teamMember.getMonth();
            int year = teamMember.getYear();
            String sLong;

            if (sex == 'm') {
                sLong = "male";
            } else {
                sLong = "female";
            }
            InputOutput.output(name + " " + surname + ", " + sLong + ", " + "born " + date + "/" + month + "/" + year);
        }
    }

    public static String oldest(Member[] teamMembers) {

        int year;
        int month;
        int date;

        int oldest = 0;

        //int max = 0;
        for (int i = 1; i < teamMembers.length; i++) {

            //int age = (2018 - teamMembers[i].getYear());
            year = teamMembers[0].getYear();
            month = teamMembers[0].getMonth();
            date = teamMembers[0].getDate();

            if (teamMembers[i].getYear() < year) {
                year = teamMembers[i].getYear();
                oldest = i;
            } else if (teamMembers[i].getYear() == year && teamMembers[i].getMonth() < month) {
                month = teamMembers[i].getMonth();
                oldest = i;
            } else if (teamMembers[i].getMonth() == month && teamMembers[i].getDate() < date) {
                date = teamMembers[i].getDate();
                oldest = i;
            }
        }

        int age = (2018 - teamMembers[oldest].getYear());

        String toReturn = teamMembers[oldest].getName() + " " + teamMembers[oldest].getSurname() + ", age " + age;

        return toReturn;
    }

    public static String youngest(Member[] teamMembers) {

        int year;
        int month;
        int date;

        int youngest = 0;

        //int max = 0;
        for (int i = 1; i < teamMembers.length; i++) {

            //int age = (2018 - teamMembers[i].getYear());
            year = teamMembers[0].getYear();
            month = teamMembers[0].getMonth();
            date = teamMembers[0].getDate();

            if (teamMembers[i].getYear() > year) {
                year = teamMembers[i].getYear();
                youngest = i;
            } else if (teamMembers[i].getYear() == year && teamMembers[i].getMonth() > month) {
                month = teamMembers[i].getMonth();
                youngest = i;
            } else if (teamMembers[i].getMonth() == month && teamMembers[i].getDate() > date) {
                date = teamMembers[i].getDate();
                youngest = i;
            }
        }
        int age = (2018 - teamMembers[youngest].getYear());
        String toReturn = teamMembers[youngest].getName() + "/" + teamMembers[youngest].getSurname() + age + "/" + age;
        return toReturn;
    }
}
