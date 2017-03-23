
public class Employee{
  double salary;
  Employee(double salary){
    this.salary = salary;
  }
  Employee updateSalary(double salary){
    Employee employee = new Employee(this.salary+salary);
    return employee;
  }
  double getSalary(){
    return this.salary;
  }
}
class ReturnObjectDemo{
  public static void main(String args[]){
    Employee Rama = new Employee(34029.48);
    Employee Ram;
    Ram=Rama.updateSalary(6295.28);
    System.out.println("Salary of Rama is: "+Rama.getSalary());
    System.out.println("Salary of Ram is: "+Ram.getSalary());
  }
}
