package Application;

public class Employee {
       public String name;
       public double grossSalary;
       public double rate;

       public double NetSalary(){
           return grossSalary - rate;
       }

       public void IncreaseSalary(double percentage){
          grossSalary += grossSalary * percentage / 100.0;
       }

       public String toString(){
           return name + ", $ " + String.format("%.2f", NetSalary());
       }


}
