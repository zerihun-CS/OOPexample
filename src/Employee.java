public abstract class Employee {
    private String employeeName;
   private int experienceYear;
    private String department;
    private float paymentPerHour;

    public float getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(float grossSalary) {
        this.grossSalary = grossSalary;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    private float grossSalary;
    private  float taxRate;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        if(username.contains("@")){

            System.out.println("invalid username please try again ");
        }
        else{
            this.username = username;
        }

    }

    private String username;



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(float paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }





    float overtime(int numberOfHours){


        return numberOfHours*paymentPerHour;
    }

   abstract float calculateSalary();






//    float calculateSalary(){
//
//        return (grossSalary - (grossSalary * taxRate) );
//    }










}
