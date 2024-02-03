public class Employee extends Person {
    private final String position;
    private final double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String toString() {
        return String.format("Employee: %s %s earns %.2f tenge", super.toString(), getPosition(), getPaymentAmount());
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}
