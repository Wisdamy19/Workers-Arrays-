package Seção10.WorkerArrays;

import java.util.Scanner;
import java.util.Locale;

public class Worker {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many workers will be registered? ");
        int workers = scan.nextInt();
        WorkerMembers[] vect = new WorkerMembers[workers];
        for (int i = 0; i <vect.length; i++){
            scan.nextLine();
            System.out.println("Worker #" + (i+1) + ":");
            System.out.println("Id: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Name: ");
            String name = scan.nextLine();
            System.out.println("Salary: ");
            double salary = scan.nextDouble();
            vect[i] = new WorkerMembers(id, name, salary);
        }
        System.out.println("Enter the employee id that will have salary increase :");
        int idIncrease = scan.nextInt();
        System.out.println("Enter the percentage ");
        double percentage = scan.nextDouble();

        System.out.println("List of workers: ");
        for (WorkerMembers member : vect){
            if(member.getId() == idIncrease){
                member.increaseSalary(percentage);
            }else break;
            System.out.println(member);
        }
    }
}
