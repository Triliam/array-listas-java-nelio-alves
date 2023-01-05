package vetores.application;

import vetores.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTeste1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered?");
        int n = scan.nextInt();

        Employee employee = null;
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("ID");
            Integer id = scan.nextInt();

            System.out.println("Name");
            String name = scan.next();

            System.out.println("Salary");
            Double salary = scan.nextDouble();

            employee = new Employee(name, id, salary);

            list.add(employee);
        }

        System.out.println(list);

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSearch = scan.nextInt();

        for (int i = 0; i < list.size(); i++) {
            while (list.get(i).getId() != idSearch) {
                System.out.println("Enter the employee id that will have salary increase: ");
                idSearch = scan.nextInt();
            }
            if (list.get(i).getId() == idSearch) {
                System.out.println("Employe encontrado: " + list.get(i));

                System.out.println("Enter the percentage: ");
                Double perc = scan.nextDouble();
                list.get(i).increase(perc);
                break;
            }
        }
        System.out.println(list);
        scan.close();
    }
}
