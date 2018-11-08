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
        }

        switch (selection) {
            case 1:
                InputOutput.output("");
                outputTeamMembers(teamMembers);
                break;
            case 2:
                InputOutput.output("The oldest member is: " + oldest(teamMembers));
                break;
            case 3:
                InputOutput.output("The youngest member is: " + youngest(teamMembers));
            default:
                break;
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

        int max = 0;
        int oldest = 0;

        for (int i = 0; i < teamMembers.length; i++) {

            int age = (2011 - teamMembers[i].getYear());

            if (age > max) {
                max = age;
                oldest = i;
            }
        }
        int age = (2011 - teamMembers[oldest].getYear());

        String toReturn = teamMembers[oldest].getName() + " " + teamMembers[oldest].getSurname() + ", age " + age;

        return toReturn;
    }

    public static String youngest(Member[] teamMembers) {

        int min = 999;
        int youngest = 0;
        for (int i = 0; i < teamMembers.length; i++) {
            int age = (2011 - teamMembers[i].getYear());
            if (age < min) {
                min = age;
                youngest = i;
            }
        }
        int age = (2011 - teamMembers[youngest].getYear());
        String toReturn = teamMembers[youngest].getName() + "/" + teamMembers[youngest].getSurname() + age + "/" + age;
        return toReturn;
    }
}
