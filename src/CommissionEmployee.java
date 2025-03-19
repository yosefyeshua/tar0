public class CommissionEmployee extends Employee{
    private float grossSales;
    private int commission;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        setGrossSales(grossSales);
        setCommission(commission);
    }

    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    public int getCommission() {
        return commission;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setCommission(int commission) {
        if (commission < 0) throw new IllegalArgumentException("commission cannot be negative");
        this.commission = commission;
    }

    public void setGrossSales(float grossSales) {
        if (grossSales < 0) throw new IllegalArgumentException("Gross sales cannot be negative");
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + " Gross sales: " + grossSales + " commission: " + commission;
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        CommissionEmployee that = (CommissionEmployee) obj;
        return commission == that.commission && Float.compare(that.grossSales, grossSales) == 0;
    }

    @Override
    public float earnings() {
        return (commission / 100.0f) * grossSales;
    }

}
