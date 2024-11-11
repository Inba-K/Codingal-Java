public class Salary {
    private int salary;
    private int expense;
    private int net;
    public int getSalary(){
        return salary;
    }
    public int getExpense(){
        return expense;
    }
    public int getNet(){
        return salary-expense;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setExpense(int expense){
        this.expense=expense;
    }
    public static void main(String[] args) {
        Salary total=new Salary();
        total.setSalary(7000);
        total.setExpense(1500);
        System.out.println("Net Salary: "+total.getNet());
    }

}
