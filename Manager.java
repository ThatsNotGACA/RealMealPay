import java.util.*;

public class Manager {
    private ArrayList<Student> students;

    public Manager() {
        students = new ArrayList<>();
    }

    public String transactionsOnDate(int month, int day) {
        String s = "";
        for (Student stud : students) {
            ArrayList<Transaction> perDay = stud.getTransactionsByDate(month, day);
            if (!perDay.isEmpty()) {
                s += perDay.toString() + " by: " + stud.getName() + " ID: " + stud.getID() + "\n";
            }
        }
        return s;
    }

    public void logMeal(int month, int day, int id) {
        for (Student stud : students) {
            if (stud.getID() == id) {
                stud.chargeLunch(month, day);
                return; 
            }
        }
        System.out.println("No student found with ID: " + id);
    }

    public void addStudent(String myName) {
        students.add(new Student(myName));
    }

    public String toString() {
        return students.toString();
    }

    public void addBalance(int month, int day, int id, int balance) {
        for (Student stud : students) {
            if (stud.getID() == id) {
                stud.addBalance(month, day, balance);
                return;
            }
        }
        System.out.println("No student found with ID: " + id);
    }

    public void chargeMeal(int month, int day, int id) {
        for (Student stud : students) {
            if (stud.getID() == id) {
                stud.chargeLunch(month, day);
                return;
            }
        }
        System.out.println("No student found with ID: " + id);
    }

    public ArrayList<Student> negativeBalances() {
        ArrayList<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getBalance() < 0) {
                list.add(student);
            }
        }
        return list;
    }
}
