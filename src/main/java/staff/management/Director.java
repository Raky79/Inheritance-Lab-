package staff.management;

public class Director extends Manager{

    private int budget;

    public Director(String name, int niNumber, double salary, String deptName, int budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
