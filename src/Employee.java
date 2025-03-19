public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        setId(id);
    }
    public Employee(){
        this.firstName = "Plony";
        this.lastName = "Almony";
        this.id = 0;
    }
    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        if (id < 0) throw new IllegalArgumentException("ID cannot be negative");
        this.id = id;
    }

    @Override
    public String toString() {
        return "first name: " + firstName + " last name: " + lastName + " ID: " + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    public abstract float earnings();



}