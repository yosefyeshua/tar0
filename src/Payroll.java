public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new HourlyEmployee("moshe", "toledno", 324, 4, 35);
        employees[1] = new CommissionEmployee("ALEX", "ZIPEL", 12345, 10000, 5);
        employees[2] = new BasePlusCommissionEmployee("arye", "hacohen", 54321, 10000, 90, 2000000);
        for (int i = 0; i < 3; i++) {
            if (employees[i] instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bEmp = (BasePlusCommissionEmployee) employees[i];
                bEmp.setBaseSalary(bEmp.getBaseSalary() * 1.1f);
            }
            System.out.println(employees[i] + ", Weekly Earnings: " + employees[i].earnings());
        }

    }
}
