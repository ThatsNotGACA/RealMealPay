public class MealPayRunner {
    public static void main(String[] args) {
        Manager m = new Manager();

        System.out.println("Adding some students");
        m.addStudents("Bobby Bobbs");
        m.addStudents("Joe Schmo");
        m.addStudents("Kelly Shelly");
        m.addStudents("Bobby Bobbs");

        System.out.println(m);

        System.out.println("Making some changes...");
        m.addBalance(2, 4, 1, 20);
        m.addBalance(2, 4, 2, 30);
        m.addBalance(2, 5, 2, 10);
        m.chargeMeal(2, 4, 4);
        m.chargeMeal(2, 5, 3);
        m.chargeMeal(2, 5, 3);

        System.out.println(m);

        System.out.println("Only negative balances...");
        System.out.println(m.negativeBalances());

        System.out.println("All transcations on 2/4...");
        System.out.println(m.transactionsOnDate(2, 4));

    }
}
