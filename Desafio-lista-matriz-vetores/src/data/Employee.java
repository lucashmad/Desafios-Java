package data;

public class Employee {
    private String name;
    private Integer id;
    private Double salary;

    public Employee() {
    }
    public Employee(String name, Integer ID, Double salary) {
        this.name = name;
        this.id = ID;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.0;
    }


    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f%n", salary);
    }
}
