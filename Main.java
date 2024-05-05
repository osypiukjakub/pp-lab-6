import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jacek", 3000, 1, "2020-04-05", "Developer");
        Worker worker2 = new Worker("Bartek", 1600, 2, "2020-02-05", "Developer");
        Worker worker3 = new Worker("Klara", 2700, 3, "2020-12-20", "Tester");
        Worker worker4 = new Worker("Sara", 3400, 4, "2019-08-10", "Koordynator");

        Manager manager = new Manager("Roman", 10000, 5, "2019-05-10", "CEO");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}