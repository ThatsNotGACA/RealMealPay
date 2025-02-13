import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transactions;

    public String toString(){
        return "Name: " + name + " ID: " + id + " Balance: " + balance + " Transactions: " + transactions.toString();
    }


}
