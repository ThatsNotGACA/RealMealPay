import java.util.*;

public class Student {
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    public Student(String myName){
        name = myName;
        balance = 0;
        id = idGen;
        idGen++;
        transactions = new ArrayList<Transaction>();
    }

    public void chargeLunch(int month, int day){
        balance -= 7;
        Transaction t = new Transaction(month, day, -7);
        transactions.add(t);
    }
    public void addBalance(int month, int day, int amount){
        balance += amount;
        Transaction t = new Transaction(month, day, amount);
        transactions.add(t);
    }

    public ArrayList<Transaction> getTransactionsByDate(int month, int day){
        ArrayList<Transaction> given = new ArrayList<Transaction>();

        for(Transaction t : transactions){
            if(month == t.getMonth() && day == t.getDay()){
                given.add(t);
            }
        }
        if(given.size() == 0){
            return null;
        } else {
            return given;
        }
    }


    public String toString(){
        return "Name: " + name + " ID: " + id + " Balance: " + balance + " Transactions: " + transactions.toString();
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
}