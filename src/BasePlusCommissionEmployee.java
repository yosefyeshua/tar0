public class BasePlusCommissionEmployee extends CommissionEmployee{
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public float getBaseSalary() { return baseSalary; }
    public void setBaseSalary(float baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    @Override
    public float earnings() { return baseSalary + super.earnings(); }

    @Override
    public String toString() {
        return super.toString() + ", baseSalary=" + baseSalary;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) obj;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }
}


