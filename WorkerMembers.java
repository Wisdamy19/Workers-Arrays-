package Seção10.WorkerArrays;

public class WorkerMembers {
    public int id;
    public String name;
    private double salary;

    public WorkerMembers(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void increaseSalary(double percentage){
        salary += salary * (percentage / 100);
    }
    public String toString(){
        return getId() + ": " + getName() + ", " + String.format("%.2f", getSalary());
    }


}
