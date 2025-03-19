public class HourlyEmployee extends Employee{
    private int hours;
    private float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName,lastName,id);
        setHours(hours);
        setWage(wage);
    }
    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    public int getHours() {
        return hours;
    }

    public float getWage() {
        return wage;
    }

    public void setHours(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours cannot be negative");
        this.hours = hours;
    }

    public void setWage(float wage) {
        if (wage < 0) throw new IllegalArgumentException("Wage cannot be negative");
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() + " hours: " + hours + " wage: " + wage;
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        HourlyEmployee that = (HourlyEmployee) obj;
        return hours == that.hours && Float.compare(that.wage, wage) == 0;
    }

    @Override
    public float earnings() {
        return wage * hours;
    }


}
