package modul07.Abstract;

    public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Three-argument constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    // Setter dan Getter untuk firstName
    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    // Setter dan Getter untuk lastName
    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter dan Getter untuk socialSecurityNumber
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // Return String representation of Employee Object
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // Abstract method - harus di-override oleh subclass
    public abstract double earnings(); // no implementation here
}
