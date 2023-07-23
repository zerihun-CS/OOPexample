public class ContractEmployee extends Employee {
float perDayAmount;

    @Override
    float calculateSalary() {
        return (30* perDayAmount);

    }
}
