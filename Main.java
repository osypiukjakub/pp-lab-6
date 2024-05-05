import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jacek", 3000, 1);
        Worker worker2 = new Worker("Bartek", 1600, 2);
        Worker worker3 = new Worker("Klara", 2700, 3);
        Worker worker4 = new Worker("Sara", 3400, 4);

        Manager manager = new Manager("Roman", 10000, 5);

        System.out.println("Salary worker_1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary worker_2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary worker_3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary worker_4: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary manager: " + manager.getSalary());
        manager.work();
    }
}