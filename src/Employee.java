// placeholder for your Employee class
public class Employee {
  
  public Employee(String name, double wage, int hours) {
    
    public String getName() {
      return name;
    }
    
    public double getWage() {
      return wage;
    }
    
    public int getHours() {
      return hours;
    }
    
    public double getWeeklySalary() {
      return (hours*wage);
    }
    
    public double getYearlySalary() {
      return (hours * wage * 52);
    }
    
    public String toString() {
      return ("name: " + name + ", wage: " + wage + ", hours: " + hours);
    }
    
    public setName(String newname) {
      name = newname;
    }
    
    public void setWage(double newWage) {
      wage = newWage;
    }
    
    public void setHours(int h) {
      hours = h;
    }
    
    public double giveRaise() {
      wage = wage + 1.00;
      return wage;
    }
  }
}
