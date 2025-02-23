import java.util.*;

public class Manager {
    ArrayList<Student> students;

    public Manager(){
        students = new ArrayList<Student>();
    }

    public String transactionsByDay(int month, int day){
        String s = new String();
        for(Student stud : students){
            ArrayList<Transaction> perDay = stud.getTransactionsByDate(month, day);
            if(!perDay.isEmpty()){
                s += perDay.toString() + " by: " + stud.getName() + " ID: " + stud.getID();
                s += "\n";
            }
        }
        return s;
    }
}