package modul07.Abstract;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Four-argument constructor
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn); // pass to Employee constructor
        setWeeklySalary(salary); // validate and store salary
    }

    // Setter untuk weeklySalary dengan validasi
    public void setWeeklySalary(double salary) {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    // Getter untuk weeklySalary
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Calculate earnings - override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // Return String representation of SalariedEmployee Object
    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary());
    }
}