public class Student extends Person {
    private final double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public String toString() {
        return String.format("Student: %s earns %.2f tenge", super.toString(), getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.00;
    }

    @Override
    public String getPosition() {
        return "Student";
    }
}
