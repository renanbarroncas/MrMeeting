package application;
import java.util.ArrayList;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

class Core {

    static ArrayList<Professor> professors = new ArrayList();
    static ArrayList<Meeting> meetings = new ArrayList();

    public static void setProfessors(Professor professor){
        Core.professors.add(professor);
    }

    public static void setMeetings(Meeting meeting){
        Core.meetings.add(meeting);
    }

    public void printProfessorSchedules(){
        for(int i = 0; i < Core.professors.size(); i++){
            Professor item = Core.professors.get(i);
            System.out.println("Professor: " + item.getPsname());
            for(int h = 0; h < item.getSchedules().size(); h++){
                Schedules avaiableTime =  item.getSchedules().get(i);
                System.out.println("#" + h + " A partir de " + avaiableTime.getStart() + " até " + avaiableTime.getEnd());
            }
            System.out.println("--- ");
        }
    }
}
